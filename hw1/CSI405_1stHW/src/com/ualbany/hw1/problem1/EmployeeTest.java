//Name: Sangheon Lee
//Student ID Numbers: #001286825
import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args){

		Scanner keyboard = new Scanner(System.in);
		
		//Instances of Employee class
		Employee e1 = new Employee(); 
		Employee e2 = new Employee();
	
		//Set instance variables for e1.
		e1.setFirstName(keyboard.next());
		e1.setLastName(keyboard.next());
		e1.setMonthlySalary(keyboard.nextInt());
		
		//Set instance variables for e2.
		e2.setFirstName(keyboard.next());
		e2.setLastName(keyboard.next());
		e2.setMonthlySalary(keyboard.nextInt());
		
		//Display employees' names and their monthly salary.
		System.out.println("The yearly salary of " + e1.getFirstName() + " " + e1.getLastName() + " is $" + e1.getMonthlySalary()*12);
		System.out.println("The yearly salary of " + e2.getFirstName() + " " + e2.getLastName() + " is $" + e2.getMonthlySalary()*12);
		
		System.out.println();
		
		//Set employees' raised salary.
		e1.setRaisingSalary(e1.getMonthlySalary());
		e2.setRaisingSalary(e2.getMonthlySalary());
		
		//Display employees' names and their raised salary. 
		System.out.println("New yearly salary of " + e1.getFirstName() + " " + e1.getLastName() + " is $" + e1.getMonthlySalary()*12);
		System.out.println("New yearly salary of " + e2.getFirstName() + " " + e2.getLastName() + " is $" + e2.getMonthlySalary()*12);
	}
}
