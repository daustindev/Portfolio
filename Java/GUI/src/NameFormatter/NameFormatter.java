package lab2;
import java.awt.Font;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
public class NameFormatter extends Application {
	//fields
	private Label titleLabel;
	private Label firstNameLabel;
	private Label middleNameLabel;
	private Label lastNameLabel;
	private TextField titleField;
	private TextField firstNameField;
	private TextField middleNameField;
	private TextField lastNameField;
	private Label output;
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) {
		//instantiate the labels
		titleLabel = new Label("Preferred Title");
		firstNameLabel = new Label("First Name");
		middleNameLabel = new Label("Middle Name");
		lastNameLabel = new Label("Last Name");
		output = new Label("");
		output.setStyle("-fx-font: 24 arial;");
		
		//instantiate the text fields
		firstNameField = new TextField();
		middleNameField = new TextField();
		lastNameField = new TextField();
		titleField = new TextField();
		//create some buttons and register handlers
		Button tFMLButton = new Button("Title First Middle Last");
		tFMLButton.setOnAction(new tFMLButtonClickHandler());
		
		Button fMLButton = new Button("First Middle Last");
		fMLButton.setOnAction(new fMLButtonClickHandler());
		
		Button fLButton = new Button("First Last");
		fLButton.setOnAction(new fLButtonClickHandler());
		
		Button lFMTButton = new Button("Last First Middle Title");
		lFMTButton.setOnAction(new lFMTButtonClickHandler());
		
		Button lFMButton = new Button("Last First Middle");
		lFMButton.setOnAction(new lFMButtonClickHandler());
		
		Button lFButton = new Button("Last First");
		lFButton.setOnAction(new lFButtonClickHandler());
		
		//create a GridPane
		GridPane gridpane = new GridPane();
		gridpane.setHgap(10);
		gridpane.setVgap(10);
		
		gridpane.add(firstNameLabel, 1, 0);
		gridpane.add(middleNameLabel, 1, 1);
		gridpane.add(lastNameLabel, 1, 2);
		gridpane.add(titleLabel, 1, 3);
		
		gridpane.add(firstNameField, 3, 0);
		gridpane.add(middleNameField, 3, 1);
		gridpane.add(lastNameField, 3, 2);
		gridpane.add(titleField, 3, 3);
		
		gridpane.add(tFMLButton, 0, 5);
		gridpane.add(fMLButton, 1, 5);
		gridpane.add(fLButton, 2, 5);
		gridpane.add(lFMTButton, 3, 5);
		gridpane.add(lFMButton, 4, 5);
		gridpane.add(lFButton, 5, 5);
		
		gridpane.add(output, 3, 7);
		
		//create the scene
		Scene scene = new Scene(gridpane);
		
		//add the scene to the stage
		primaryStage.setScene(scene);
		primaryStage.setTitle("Name Formatter");
		
		
		//show the stage
		primaryStage.show();
		
	}
	//Event Handlers
	//interfaces
	private class tFMLButtonClickHandler implements EventHandler<ActionEvent>{
		public void handle(ActionEvent event) {
			output.setText(titleField.getText() + ". " + firstNameField.getText() + " " + middleNameField.getText() + " " + lastNameField.getText());
		}
	}
		
	private class fMLButtonClickHandler implements EventHandler<ActionEvent>{
		public void handle(ActionEvent event) {
			output.setText(firstNameField.getText() + " " + middleNameField.getText() + " " + lastNameField.getText());
		}
	}
		
	private class fLButtonClickHandler implements EventHandler<ActionEvent>{
		public void handle(ActionEvent event) {
			output.setText(firstNameField.getText() + " " + lastNameField.getText());
		}
	}
		
	private class lFMTButtonClickHandler implements EventHandler<ActionEvent>{
		public void handle(ActionEvent event) {
			output.setText(lastNameField.getText() + " " + firstNameField.getText() + " " + middleNameField.getText() + ", " + titleField.getText());
		}
	}
		
	private class lFMButtonClickHandler implements EventHandler<ActionEvent>{
		public void handle(ActionEvent event) {
			output.setText(lastNameField.getText() + " " + firstNameField.getText() + " " + middleNameField.getText());
		}
	}
		
	private class lFButtonClickHandler implements EventHandler<ActionEvent>{
		public void handle(ActionEvent event) {
			output.setText(lastNameField.getText() + " " + firstNameField.getText());
		}
	}
}
