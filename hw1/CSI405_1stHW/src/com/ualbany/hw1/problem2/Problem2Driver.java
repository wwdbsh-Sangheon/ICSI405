//Name: Sangheon Lee
//Student ID Numbers: #001286825
import java.util.Scanner;

public class Problem2Driver {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		HW1Problem2 method = new HW1Problem2(); //Instance of HW1Problem2 class.
		
		System.out.println("Enter the numbers for first question(first integer is divisible evenly by the second one).");
		System.out.println(method.multiple(keyboard.nextInt(), keyboard.nextInt()));
		System.out.println();
		
		System.out.println("Enter the number for second question(returns the remainder of that value divided by 7).");
		System.out.println("Remainder is " + method.remainder(keyboard.nextInt()));
		System.out.println();
		
		System.out.println("Enter the numbers for third question(distance).");
		System.out.println("Distance is " + method.distance(keyboard.nextInt(), keyboard.nextInt(), keyboard.nextInt(), keyboard.nextInt()));
		System.out.println();
		
		System.out.println("Bonus Question");
		method.coinFlip();

	}

}