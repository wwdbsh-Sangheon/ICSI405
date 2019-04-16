package edu.albany.final_project;

import java.awt.Dimension;
import javax.swing.JFrame;

public class Project405
{
	public static void main(String[] args) {
		
		JFrame fr = new JFrame("Snake"); // Object variable from JFrame
		fr.setContentPane(new Setting());
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setResizable(false);
		fr.pack();
		
		fr.setPreferredSize(new Dimension(Setting.WIDTH, Setting.HEIGHT)); // Set size for screen.
		fr.setLocationRelativeTo(null);
		fr.setVisible(true);
	}
}
