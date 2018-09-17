package lab14;
import java.util.Scanner;
public class Player {
	//instantiate the scanner
	Scanner keyboard = new Scanner(System.in);
	//fields
	private int points;
	
	//constructor
	public Player() {
		points = 0;
	}
	//getter
	public int getPoints() {
		return points;
	}
	//methods
	public String guess() {
		
		System.out.println("Heads or tails?");
		String guess = keyboard.nextLine();
		return guess;
	}
	
	public void assignPoints(String result, String guess){		
		if(result.equalsIgnoreCase(guess)) {
			points += 1;
		}
		else {
			points -= 1;
		}
	}
}
