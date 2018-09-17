package lab10;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.event.ActionEvent;
import java.util.Random;

public class SlotMachine extends Application{
	//fields
	private Image penguin;
	private Image burger;
	private Image games;
	private ImageView firstSlot;
	private ImageView secondSlot;
	private ImageView thirdSlot;
	private Label amountFromSpin;
	private Label totalWinnings;
	private Label amountInserted;
	private double totalWinningsVal = 0;
	private TextField input;
	public static void main(String[] args) {
		launch(args);
	}
	
	public void start(Stage primaryStage) {
		//instantiate the controls
		penguin = new Image("file:penguin1.jpg");
		burger = new Image("file:burger.jpg");
		games = new Image("file:videogames.jpg");
		firstSlot = new ImageView("file:placeHolder.png");
		firstSlot.setFitWidth(300);
		firstSlot.setFitHeight(300);
		secondSlot = new ImageView("file:placeHolder.png");
		secondSlot.setFitWidth(300);
		secondSlot.setFitHeight(300);
		thirdSlot = new ImageView("file:placeHolder.png");
		thirdSlot.setFitWidth(300);
		thirdSlot.setFitHeight(300);
		amountFromSpin = new Label("Amount Won This Spin: $0.00");
		totalWinnings = new Label("Total Amount Won: $0.00");
		amountInserted = new Label("Amount Inserted: $");
		input = new TextField();
		//create the button
		Button spin = new Button("Spin");
		//register the event handler
		spin.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				Random rand = new Random();
				double wager = Double.parseDouble(input.getText());
				double winnings;
				int firstSlotVal = rand.nextInt(3);
				switch(firstSlotVal) {
				case 0:
					firstSlot.setImage(penguin);
					break;
				case 1:
					firstSlot.setImage(burger);
					break;
				case 2:
					firstSlot.setImage(games);
					break;
				}
				int secondSlotVal = rand.nextInt(3);
				switch(secondSlotVal) {
				case 0:
					secondSlot.setImage(penguin);
					break;
				case 1:
					secondSlot.setImage(burger);
					break;
				case 2:
					secondSlot.setImage(games);
					break;
				}
				int thirdSlotVal = rand.nextInt(3);
				switch(thirdSlotVal) {
				case 0:
					thirdSlot.setImage(penguin);
					break;
				case 1:
					thirdSlot.setImage(burger);
					break;
				case 2:
					thirdSlot.setImage(games);
					break;
				}
				if(firstSlotVal == secondSlotVal && firstSlotVal == thirdSlotVal) {
					winnings = wager * 3;
				}else if(firstSlotVal == secondSlotVal || firstSlotVal == thirdSlotVal || thirdSlotVal == secondSlotVal) {
					winnings = wager * 2;
					
				}else {
					winnings = 0;
				}
				totalWinningsVal += winnings;
				String winningsVal = String.format("Amount Won This Spin: $%.2f", winnings);
				String totalWinningsString = String.format("Total Amount Won: $%.2f", totalWinningsVal);
				amountFromSpin.setText(winningsVal);
				totalWinnings.setText(totalWinningsString);
			}
		});
		
		//create the gridpane
		GridPane gridpane = new GridPane();
		gridpane.setVgap(10);
		gridpane.setHgap(10);
		
		//add the images to an HBox
		HBox slots = new HBox(5, firstSlot, secondSlot, thirdSlot);
		
		//add the output to a vbox
		VBox output = new VBox(5, amountFromSpin, totalWinnings);
		
		//create the inputBox
		HBox inputBox = new HBox(amountInserted, input);
		
		//create another hbox
		HBox bottomBox = new HBox(480, inputBox, output);
		
		//create an hbox for the button
		HBox buttonBox = new HBox(spin);
		buttonBox.setAlignment(Pos.CENTER);
		//create a vbox
		VBox container = new VBox(10, slots, bottomBox, buttonBox);
		
		//create the scene
		Scene scene = new Scene(container);
		
		//set the scene
		primaryStage.setScene(scene);
		primaryStage.setTitle("Slot Machine");
		primaryStage.show();
		
		
	}
}
