package lab8;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.ScrollPane;
public class JoesAutomotive extends Application{
	//fields
	private CheckBox oilCheckBox;
	private CheckBox lubeCheckBox;
	private CheckBox radiatorCheckBox;
	private CheckBox transmissionCheckBox;
	private CheckBox inspectionCheckBox;
	private CheckBox mufflerCheckBox;
	private CheckBox tireCheckBox;
	private TextField partsCostBox;
	private TextField laborHoursBox;
	private ScrollPane outputPane;
	public static void main(String[] args){
		launch(args);
	}
	public void start(Stage primaryStage) {
		//instantiate the fields
		oilCheckBox = new CheckBox();
		lubeCheckBox = new CheckBox();
		radiatorCheckBox = new CheckBox();
		transmissionCheckBox = new CheckBox();
		inspectionCheckBox = new CheckBox();
		mufflerCheckBox = new CheckBox();
		tireCheckBox = new CheckBox();
		partsCostBox = new TextField();
		partsCostBox.setText("");
		laborHoursBox = new TextField();
		laborHoursBox.setText("");
		outputPane = new ScrollPane();
		outputPane.setPrefViewportHeight(200);
		outputPane.setPrefViewportWidth(400);
		
		//make the labels
		Label oilLabel = new Label("Oil Change ");
		Label lubeLabel = new Label("Lube Job");
		Label radiatorLabel = new Label("Radiator Flush");
		Label transmissionLabel = new Label("Tansmission Fluids");
		Label inspectionLabel = new Label("Inspection");
		Label mufflerLabel = new Label("Muffler Replacement");
		Label tireLabel = new Label("Tire Rotation");
		Label partsLabel = new Label("Parts Cost:   $");
		Label laborLabel = new Label("Hours of Labor:   ");
		Label logo =  new Label("JOE'S AUTOMOTIVE");
		logo.setStyle("-fx-font: 40 impact;");
		
		//make the button
		Button submitButton = new Button("Submit");
		
		//register the Event Handler
		submitButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				String outputString = "";
				double totalCost = 0;
				double partsCost;
				double laborCost;
				if(oilCheckBox.isSelected()) {
					outputString += "Oil Change: $35.00\n";
					totalCost += 35;
				}
				if(lubeCheckBox.isSelected()) {
					outputString += "Lube Job: $25.00\n";
					totalCost += 25;
				}
				if(radiatorCheckBox.isSelected()) {
					outputString += "Radiator Fluids: $50.00\n";
					totalCost += 50;
				}
				if(transmissionCheckBox.isSelected()) {
					outputString += "Transmission Flushe: $120.00\n";
					totalCost += 120;
				}
				if(inspectionCheckBox.isSelected()){
					outputString += "Inspection: $35.00\n";
					totalCost += 35;
				}
				if(mufflerCheckBox.isSelected()) {
					outputString += "Muffler Replacement: $200.00\n";
					totalCost += 200;
				}
				if(tireCheckBox.isSelected()){
					outputString += "Tire Rotation: $20.00\n";
					totalCost += 20;
				}
				if(partsCostBox.getText().equals("")) {
					partsCost = 0;
				}else {
					partsCost = Double.parseDouble(partsCostBox.getText());
					outputString += ("Parts: $" + partsCost + "\n");
					totalCost += partsCost;
				}
				//comparing strings
				if(laborHoursBox.getText().equals("")) {
					laborCost = 0;
				}else {
					double laborHours = Double.parseDouble(laborHoursBox.getText());
					laborCost = laborHours * 60;
					outputString += ("Labor: $" + laborCost + "\n");
					totalCost += laborCost;
				}
				outputString +=("\n");
				outputString +=("---------------------------------\n");
				outputString += ("TOTAL: $" + totalCost + "\n");
				
				Label outputLabel = new Label(outputString);
				outputPane.setContent(outputLabel);
			}
		});
		//create the hboxs for each checkbox and label
		 HBox oilBox = new HBox(3, oilLabel, oilCheckBox);
		 HBox lubeBox = new HBox(3, lubeLabel, lubeCheckBox);
		 HBox radiatorBox = new HBox(3, radiatorLabel, radiatorCheckBox);
		 HBox transmissionBox = new HBox(3, transmissionLabel, transmissionCheckBox);
		 HBox inspectionBox = new HBox(3, inspectionLabel, inspectionCheckBox);
		 HBox mufflerBox = new HBox(3, mufflerLabel, mufflerCheckBox);
		 HBox tireBox = new HBox(3, tireLabel, tireCheckBox);
		 
		 
		 //create an hbox for all the checkbox item's hboxes
		 HBox checkedItemsBox = new HBox(15, oilBox, lubeBox, radiatorBox, transmissionBox, inspectionBox, mufflerBox, tireBox);
		 checkedItemsBox.setAlignment(Pos.CENTER);
		 
		 //create two hboxes for the textfield items
		 HBox partsBox = new HBox(partsLabel, partsCostBox);
		 HBox laborBox =new HBox(laborLabel, laborHoursBox);
		 
		 //create an hbox for the textfield item's hbox
		 HBox textFieldItemsBox = new HBox(30, partsBox, laborBox);
		 textFieldItemsBox.setAlignment(Pos.CENTER);
		 
		 //create an HBox for the button
		 HBox buttonBox = new HBox(submitButton);
		 buttonBox.setAlignment(Pos.CENTER);
		 
		 //create an Hbox for the scrollPane
		 HBox scrollPaneBox = new HBox(outputPane);
		 scrollPaneBox.setAlignment(Pos.CENTER);
		 
		 //create a vbox for all the Hboxs
		 VBox vbox = new VBox(15, checkedItemsBox, textFieldItemsBox, buttonBox, scrollPaneBox);
		 
		 //create an hbox for the logo
		 HBox logoBox = new HBox(logo);
		 logoBox.setAlignment(Pos.CENTER);
		 //create the borderpane
		 BorderPane borderPane = new BorderPane();
		 
		 borderPane.setCenter(vbox);
		 borderPane.setTop(logoBox);
		 borderPane.setPadding(new Insets(20, 20, 20, 20));
		 
		 //add the borderPane to the scene
		 Scene scene = new Scene(borderPane);
		 
		 //set the scene
		 primaryStage.setScene(scene);
		 primaryStage.setTitle("Receipt Maker");
		 primaryStage.show();
		 
	}
	
}
