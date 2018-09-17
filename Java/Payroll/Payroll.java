package lab2;

public class Payroll {
	//fields
	private int[] employeeId;
	private int[] hours;
	private double[] payRate;
	private double[] wages;
	
	//constructor
	public Payroll() {
		employeeId = new int[7];
		hours = new int[7];
		payRate = new double[7];
		wages = new double[7];
		}
	//setters
	public void setEmployeeId(int index, int id) {
		employeeId[index] = id;
	}
	public void setHours(int index, int hrs) {
		hours[index] = hrs;
	}
	public void setPayRate(int index, double rate) {
		payRate[index] = rate;
	}
	//getters
	public int getEmployeeId(int index) {
		return employeeId[index];
	}
	public int getHours(int index) {
		return hours[index];		
	}
	public double getPayRate(int index) {
		return payRate[index];
	}
	
	//calc and return wages
	public double calcWages(int index) {
		wages[index] = hours[index] * payRate[index];
		return wages[index];
	}
}
