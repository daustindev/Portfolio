package lab14;

public class HeadsOrTailsGame {
	public static void main(String[] args) {
		//instantiate 2 players
		Player player1 = new Player();
		Player player2 = new Player();
		
		//instantiate a sentinel value
		boolean keepPlaying = true;
		while(keepPlaying != false) {
			CoinToss toss = new CoinToss();
			System.out.print("Player 1, ");
			String player1Guess = player1.guess();
			System.out.print("Player 2, ");
			String player2Guess = player2.guess();
			String result = toss.getSideUp();
			System.out.println("The coin landed on " + result);
			player1.assignPoints(result, player1Guess);
			player2.assignPoints(result, player2Guess);
			System.out.println("Player 1 has " + player1.getPoints() + "points");
			System.out.println("Player 2 has " + player2.getPoints() + "points");
			System.out.println();
			if(player1.getPoints() >= 5 || player2.getPoints() >= 5) {
				System.out.println("We have a winner!");
				if(player1.getPoints() >= 5) {
					System.out.println("Congrats player 1");
				}
				else if(player2.getPoints() >= 5) {
					System.out.println("Congrats player 2");
				}
				keepPlaying = false;
			}
		}
	}
}
