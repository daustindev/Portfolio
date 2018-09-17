package lab6;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import java.util.Random;

public class DiceSimulator extends Application{
	//fields
	Image die1;
	Image die2;
	Image die3;
	Image die4;
	Image die5;
	Image die6;
	Image placeHolder;
	ImageView firstDie;
	ImageView secondDie;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public void start(Stage primaryStage) {
		//instantiate the controls
		die1 = new Image("file:die1.png");
		die2 = new Image("file:die2.png");
		die3 = new Image("file:die3.png");
		die4 = new Image("file:die4.png");
		die5 = new Image("file:die5.png");
		die6 = new Image("file:die6.png");
		placeHolder = new Image("file:placeHolder.png");
		firstDie = new ImageView(placeHolder);
		firstDie.setFitHeight(200);
		firstDie.setFitWidth(200);
		secondDie = new ImageView(placeHolder);
		secondDie.setFitHeight(200);
		secondDie.setFitWidth(200);
		
		//create a button
		Button rollDice = new Button("Roll Dice");
		
		//register the event handler
		rollDice.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				Random roll = new Random();
				int firstRoll = roll.nextInt(6) + 1;
				int secondRoll = roll.nextInt(6) + 1;
				
				switch(firstRoll) {
				case 1:
					firstDie.setImage(die1);
					break;
				case 2:
					firstDie.setImage(die2);
					break;
				case 3:
					firstDie.setImage(die3);
					break;
				case 4:
					firstDie.setImage(die4);
					break;
				case 5:
					firstDie.setImage(die5);
					break;
				case 6:
					firstDie.setImage(die6);
					break;
				}
				switch(secondRoll) {
				case 1:
					secondDie.setImage(die1);
					break;
				case 2:
					secondDie.setImage(die2);
					break;
				case 3:
					secondDie.setImage(die3);
					break;
				case 4:
					secondDie.setImage(die4);
					break;
				case 5:
					secondDie.setImage(die5);
					break;
				case 6:
					secondDie.setImage(die6);
					break;
				}
			}
		});
		//create a gridpane
		GridPane gridpane = new GridPane();
		gridpane.setHgap(10);
		gridpane.setVgap(10);
		//add the controls to the gridpane
		gridpane.add(rollDice, 1, 0);
		gridpane.add(firstDie, 0, 1);
		gridpane.add(secondDie, 2, 1);
		
		//create the scene
		Scene scene = new Scene(gridpane);
		
		//set the scene
		primaryStage.setScene(scene);
		primaryStage.setTitle("Dice roll");
		primaryStage.show();
	}
}
