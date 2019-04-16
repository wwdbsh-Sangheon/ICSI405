package edu.albany.final_project;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JPanel;

public class Setting extends JPanel implements Runnable, KeyListener // Extend JPanel class and implement Runnable and KeyListener interface. 
{
	public static final int WIDTH = 400, HEIGHT = 400;
	private boolean up, down, right, left, start, end, run;
	private final int SIZE = 20;
	private int score, level, dx, dy, dx2, dy2, rm, flag = 0;
	private long time;
	private Graphics2D g2d;
	private BufferedImage image;
	private Thread th;
	private ArrayList<Element> snake, barrier;
	private Element head, food, hunter;
	private Random r;
	private Snake s;
	private Barrier b;
	private Food f;
	private Hunter h;
	
	public Setting() // Constructor
	{
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		setFocusable(true);
		requestFocus();
		addKeyListener(this);
		this.s = new Snake(SIZE);
		this.f = new Food(SIZE);
		this.b = new Barrier(SIZE);
		this.h = new Hunter(SIZE);
		this.r = new Random();
		this.head = new Element(SIZE);
		this.food = new Element(SIZE);
		this.hunter = new Element(SIZE);
		this.snake = new ArrayList<Element>();
	}
	
	@Override
	public void addNotify()
	{
		super.addNotify();
		th = new Thread(this);
		th.start(); // Run thread.
	}
	
	private void setFPS(int fps) // Method for speed
	{
		time = 1000 / fps;
	}

	@Override
	public void keyTyped(KeyEvent e) {}

	@Override
	public void keyPressed(KeyEvent e) // Method for key pressed
	{
		int k = e.getKeyCode();
		if(k == KeyEvent.VK_UP) up = true;
		if(k == KeyEvent.VK_DOWN) down = true;
		if(k == KeyEvent.VK_LEFT) left = true;
		if(k == KeyEvent.VK_RIGHT) right = true;
		if(k == KeyEvent.VK_ENTER) start = true;
	}

	@Override
	public void keyReleased(KeyEvent e) // Method for key released
	{
		int k = e.getKeyCode();
		if(k == KeyEvent.VK_UP) up = false;
		if(k == KeyEvent.VK_DOWN) down = false;
		if(k == KeyEvent.VK_LEFT) left = false;
		if(k == KeyEvent.VK_RIGHT) right = false;
		if(k == KeyEvent.VK_ENTER) start = false;
	}
	
	@Override
	public void run()
	{
		if(run) return;
		init();
		long startTime;
		long elapsed;
		long wait;
		while(run)
		{
			startTime = System.nanoTime();			
			update();
			requestRender();
			elapsed = System.nanoTime() - startTime;
			wait = time - elapsed / 1000000;
			if(wait > 0)
			{
				try
				{
					Thread.sleep(wait);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		}
	}
	
	private void init() // Method for initialization
	{
		image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_ARGB);
		g2d = image.createGraphics();
		run = true;
		setUp();
	}
	
	private void setUp() // Method for setting initial environment
	{
		barrier = new ArrayList<Element>();
		s.setSnake();
		snake = s.getSnake();
		head = s.getHead();
		f.setElement();
		food = f.getElement();
		b.setElement();
		barrier.add(b.getElement());
		h.setElement();
		hunter = h.getElement();
		score = 0;
		end = false;
		level = 1;
		dx = dy = dx2 = dy2 = 0;
		rm = r.nextInt(3);
		setFPS(level*7);
	}
	
	private void requestRender() // Method for requesting rendering
	{
		render(g2d);
		Graphics g = getGraphics();
		g.drawImage(image, 0, 0, null);
		g.dispose();
	}
	
	public void render(Graphics2D g2d) // Method for rendering
	{
		g2d.clearRect(0, 0, WIDTH, HEIGHT);
		g2d.setColor(Color.RED);
		for(Element e : snake) e.render(g2d);
		g2d.setColor(Color.ORANGE);
		food.render(g2d);
		g2d.setColor(Color.BLUE);
		for(Element e : barrier) e.render(g2d);
		g2d.setColor(Color.GRAY);
		hunter.render(g2d);
		g2d.setColor(Color.WHITE);
		if(end) g2d.drawString("GAMEOVER!", 160, 200);
		g2d.drawString("Score: " + score + " Level: " + level, 10, 10);
		g2d.drawString("Orange: Food  || Blue: Barrier || Gray: Hunter", 10, 390);
		if(dx == 0 && dy == 0) g2d.drawString("READY!", 200, 200);
	}
	
	private void update() // Method for update
	{
		if(end)
		{
			if(start) setUp();
			
			return ;
		}
		if(up && dy == 0)
		{
			dy = -SIZE;
			dx = 0;
		}
		if(down && dy == 0)
		{
			dy = SIZE;
			dx = 0;
		}
		if(left && dx == 0)
		{
			dy = 0;
			dx = -SIZE;
		}
		if(right && dx == 0 && dy != 0)
		{
			dy = 0;
			dx = SIZE;
		}
		if(dx != 0 || dy != 0)
		{
			for(int i = snake.size() - 1; i > 0; i--)
			{
				snake.get(i).setPosition(
						snake.get(i-1).getX(),
						snake.get(i-1).getY()
						);
			}
			head.move(dx, dy); // Move snake
		}
		if(rm == 0)
		{
			dy2 = -SIZE;
			dx2 = 0;
		}
		if(rm == 1)
		{
			dy2 = SIZE;
			dx2 = 0;
		}
		if(rm == 2)
		{
			dy2 = 0;
			dx2 = -SIZE;
		}
		if(rm == 3)
		{
			dy2 = 0;
			dx2 = SIZE;
		}
		if(dx2 != 0 || dy2 != 0)
		{
			if(flag == 2) flag = 0;
			if(flag == 0) rm = r.nextInt(3);
			hunter.move(dx2, dy2); // Move hunter
			flag++;
		}
		for(Element e : snake)
		{
			if(e.isCollision(head)) // Condition: Snake is bumped against itself
			{
				end = true;
				break;
			}
		}
		for(Element e : barrier)
		{
			if(e.isCollision(head)) // Condition: Snake is bumped against barrier
			{
				end = true;
				break;
			}
		}
		if(hunter.isCollision(head)) end = true; // Condition: Snake is bumped against hunter
		if(food.isCollision(head)) // Condition: Snake is bumped against food
		{
			score += 10;
			f.setElement();
			Element e = new Element(SIZE);
			Element e2 = new Element(SIZE);
			e.setPosition(-100, -100);
			snake.add(e);
			b.setElement();
			e2 = b.getElement();
			barrier.add(e2);
			if(score % 100 == 0)
			{
				level++;
				setFPS(level * 5);
			}
		}
		if(head.getX() < 0) head.setX(WIDTH);
		if(head.getY() < 0) head.setY(HEIGHT);
		if(head.getX() > WIDTH) head.setX(0);
		if(head.getY() > HEIGHT) head.setY(0);
		if(hunter.getX() < 0) hunter.setX(WIDTH);
		if(hunter.getY() < 0) hunter.setY(HEIGHT);
		if(hunter.getX() > WIDTH) hunter.setX(0);
		if(hunter.getY() > HEIGHT) hunter.setY(0);
	}
}