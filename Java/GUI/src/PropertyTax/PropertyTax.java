package lab4;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class PropertyTax extends Application {
	//fields
	private Label instructions;
	private TextField input;
	private Label assessmentValue;
	private Label propertyTax;
	
	public static void main(String[] args) {
		launch(args);
	}
	public void start(Stage primaryStage) {
		//instantiate the fields
		instructions = new Label("Enter your property's actual value");
		input = new TextField();
		assessmentValue = new Label();
		propertyTax = new Label();
		
		//create the calcButton
		Button calcButton = new Button("Calculate assessment and tax");
		
		//register an event handler
		calcButton.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent event) {
				double realValueNum = Double.parseDouble(input.getText());
				double assessment = realValueNum * .6;
				double tax = (assessment / 100) * .64;
				String assessmentValString = String.format("Assessment Value: $%.2f", assessment);
				String taxString = String.format("Property Tax: $%.2f", tax);
				assessmentValue.setText(assessmentValString);
				propertyTax.setText(taxString);
			}
				
		});
		
		//create a gridpane
		GridPane gridpane = new GridPane();
		gridpane.setVgap(10);
		gridpane.setHgap(10);
		
		//add the controls to the gridpane
		gridpane.add(instructions, 0, 0);
		gridpane.add(input, 2, 0);
		gridpane.add(calcButton, 1, 2);
		gridpane.add(assessmentValue, 1, 4);
		gridpane.add(propertyTax, 1, 5);
		
		//create the scene
		Scene scene = new Scene(gridpane);
		
		//set the scene
		primaryStage.setScene(scene);
		primaryStage.setTitle("Property Tax Calculator");
		primaryStage.show();
	}
}
