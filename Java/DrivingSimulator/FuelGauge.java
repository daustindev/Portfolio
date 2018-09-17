package lab12;

public class FuelGauge {
	//fields
	public final int MAX_GALLONS = 15;
	private int gallons;
	
	//constructors
	public FuelGauge() {
		
	}
	public FuelGauge(int g) {
		gallons = g;
	}
	
	//getter
	public int getGallons() {
		return gallons;
	}
	
	
	//methods
	public void incrementGallons() {
		if(gallons < 15) {
			gallons++;
		}
		else {
			System.out.println("The tank is full");
		}
	}
	public void decrimentGallons() {
		if(gallons > 0) {
			gallons--;
		}
		else {
			System.out.println("The tank is empty");
		}
	}
}
