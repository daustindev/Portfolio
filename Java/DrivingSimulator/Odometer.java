package lab12;
import java.util.Scanner;
public class Odometer {
	//instantiate a Scanner
	Scanner keyboard = new Scanner(System.in);
	//fields
	public final int MAX_MILEAGE = 999999;
	public final int MPG = 24;
	private int mileage;
	private int setPoint;
	private FuelGauge fuelGauge;
	
	//constructor
	public Odometer(int m, FuelGauge fg) {
		mileage = m;
		fuelGauge = fg;
	}
	
	//getter
	public int getMileage() {
		return mileage;
	}
	
	//method
	public void incrementMileage() {
		if(fuelGauge.getGallons() != 0) {
			mileage++;
			setPoint +=1;
			if(setPoint == MPG) {
				fuelGauge.decrimentGallons();
				setPoint = 0;
			}
		}
		if(fuelGauge.getGallons() == 0) {
			System.out.println("You are out of fuel!, enter R to refuel");
			String response = keyboard.nextLine();
			if(response.equalsIgnoreCase("r")) {
				for(int i = 0; i <= fuelGauge.MAX_GALLONS; ++i) {
					fuelGauge.incrementGallons();
				}
			}
		}
		
		if(mileage > MAX_MILEAGE) {
			mileage = 0;
		}
	}
}
