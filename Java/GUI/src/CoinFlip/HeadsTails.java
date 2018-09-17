package lab5;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.event.ActionEvent;
import java.util.Random;
public class HeadsTails extends Application {
	//fields
	private ImageView coinView;
	private Image heads = new Image("file:heads.jpg");
	private Image tails = new Image("file:tails.jpg");
	private Image placeholder = new Image("file:placeHolder.png");
	private Label result;
	public static void main(String[] args) {
		launch(args);
	}
	
	public void start(Stage primaryStage) {
		//create the controls
		coinView = new ImageView(placeholder);
		Button flipCoin = new Button("Flip the coin");
		result = new Label();
				
		//attach the event listener
		flipCoin.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event) {
				Random flip = new Random();
				int flipped = flip.nextInt(2);
				if(flipped == 0) {
					coinView.setImage(heads);
					result.setText("Heads");
				}else if(flipped == 1) {
					coinView.setImage(tails);
					result.setText("Tails");
				}
			}
		});
		
		//create a vbox
		VBox vbox = new VBox(10, flipCoin, coinView, result);
		vbox.setAlignment(Pos.CENTER);
		
		//create the scene
		Scene scene = new Scene(vbox);
		
		//set the scene
		primaryStage.setScene(scene);
		primaryStage.setTitle("Coin Flip");
		primaryStage.show();
	}
}
