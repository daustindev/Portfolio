package lab14;
import java.util.Random;
public class CoinToss {
	//fields
	private String sideUp;
	
	//constructor
	public CoinToss() {
		toss();
	}
	//getter
	public String getSideUp() {
		return sideUp;
	}
	//method
	public void toss() {
		int tossResult;
		Random coinToss = new Random();
		tossResult = coinToss.nextInt(2);
		if(tossResult == 0) {
			sideUp = "heads";
		}else {
			sideUp = "tails";
		}
	}
}
