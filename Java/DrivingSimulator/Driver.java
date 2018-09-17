package lab12;
import java.util.Scanner;
public class Driver {
	public static void main(String[] args) {
		//instantiate a scanner
		Scanner keyboard = new Scanner(System.in);
		
		//instantiate a FuelGauge
		FuelGauge gauge1 = new FuelGauge(15);
		
		//instantiate an odometer
		Odometer odometer1 = new Odometer(999800, gauge1);
		
		System.out.println("Press enter to begin driving");
		keyboard.nextLine();
		boolean keepDriving = true;
		int counter = 0;
		//sentinel Value
		while (keepDriving == true) {
			while(gauge1.getGallons() != 0) {
				odometer1.incrementMileage();
				counter++;
				if(counter == 120) {
					System.out.printf("Mileage: %d\n" + "Keep Going?(Y/N)", odometer1.getMileage());
					String response = keyboard.nextLine();
					if(response.equalsIgnoreCase("N")) {
						keepDriving = false;
					}
					counter = 0;
				}
			}

		}
		
	}
}
