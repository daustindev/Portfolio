package lab2;
import java.util.Scanner;
public class PayrollDriver {
	public static void main(String[] args) {
		//instantiate a Scanner object
		Scanner keyboard = new Scanner(System.in);
		//instantiate a Payroll object
		Payroll employees = new Payroll();
		
		//loop through and set the values
		for(int i = 0; i < 7; i++) {
			employees.setEmployeeId(i,(i + 101));
		}
		for(int i = 0; i < 7; i++) {
			System.out.println("Enter the number of hours");
			int hours = keyboard.nextInt();
			while(hours < 0) {
				System.out.println("Negative numbers are evil! please enter a number that isn't evil");
				hours = keyboard.nextInt();
			}
			employees.setHours(i, hours);
		}
		for(int i = 0;  i < 7; i++) {
			System.out.println("Enter the hourly Pay rate40");
			double payRate = keyboard.nextDouble();
			while(payRate < 6) {
				System.out.println("This number is too low, enter a number greater than 6.00");
				payRate = keyboard.nextDouble();	
			}
			employees.setPayRate(i, payRate);
		}
		
		//print everything out
		for(int i = 0; i < 7; i++) {
			System.out.printf("Employee Id: %d \n", employees.getEmployeeId(i));
			System.out.printf("     Hours Worked: %d \n", employees.getHours(i));
			System.out.printf("     Pay rate: $%.2f per hour \n", employees.getPayRate(i));
			System.out.printf("     Gross Pay: $%.2f\n", employees.calcWages(i));
			System.out.println("___________________________________________________");
			System.out.println();
			
		}
	}
}
