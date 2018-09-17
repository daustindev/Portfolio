package lab3;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class RestaurantBillCalculator extends Application {
	//fields
	private Label label1;
	private TextField input;
	private Label tax;
	private Label tip;
	private Label total;
	
	public static void main(String[] args) {
		launch(args);
	}
	public void start(Stage primaryStage) {
		//instantiate the labels
		label1 = new Label("Enter Subtotal");
		tax = new Label();
		tip = new Label();
		total = new Label();
		
		//instantiate the TextField
		input = new TextField();
		
		//create a button
		Button calcButton = new Button("Add tax and tip");
		calcButton.setOnAction(new ButtonClickHandler());
		//register handler
		
		//create the gridPane
		GridPane gridpane = new GridPane();
		gridpane.setHgap(10);
		gridpane.setVgap(10);
		
		//add the controls to the gridpane
		gridpane.add(label1, 0, 0);
		gridpane.add(input, 2, 0);
		gridpane.add(calcButton, 1, 2);
		gridpane.add(tip, 1, 4);
		gridpane.add(tax, 1, 5);
		gridpane.add(total, 1, 6);
		
		//create the scene
		Scene scene = new Scene(gridpane);
		
		//set the scene
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	private class ButtonClickHandler implements EventHandler<ActionEvent>{
		public void handle(ActionEvent event) {
			double subtotalVal = Double.parseDouble(input.getText());
			double tipVal = subtotalVal * .18;
			double taxVal = subtotalVal * .07;
			double totalVal = subtotalVal + tipVal + taxVal;
			String taxString = String.format("Tax: $%.2f", taxVal);
			tax.setText(taxString);			
			String tipString = String.format("Tip: $%.2f", tipVal);
			tip.setText(tipString);
			String totalString = String.format("Total: $%.2f", totalVal);
			total.setText(totalString);
		}
	}
}
