package lab1;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
public class LatinTranslator extends Application{
	
	private Label label1;        
	private Label label2;
	private Label label3;
	public static void main(String[] args)
	{
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) {
		//create 3 buttons
		Button button1 = new Button("sinister");
		Button button2 = new Button("dexter");
		Button button3 = new Button("medium");
		
		//register the event handlers
		button1.setOnAction(new Button1ClickHandler());
		button2.setOnAction(new Button2ClickHandler());
		button3.setOnAction(new Button3ClickHandler());
		
		
		//create 3 labels
		label1 = new Label("");
		label2 = new Label("");
		label3 = new Label("");
		
		//create a GridPane
		GridPane gridpane = new GridPane();
		
		//set the gaps in the gridpane
		gridpane.setHgap(10);
		gridpane.setVgap(10);
		
		
		
		//add the buttons to the gridpane
		gridpane.add(button1, 0, 0);
		gridpane.add(button2, 0, 1);
		gridpane.add(button3, 0, 2);
		
		
		
		
		//create 3 vboxes
		VBox vbox1 = new VBox(label1);
		VBox vbox2 = new VBox(label2);
		VBox vbox3 = new VBox(label3);
		
		//add the vboxes to the gridpane
		gridpane.add(vbox1, 1, 0);
		gridpane.add(vbox2, 1, 1);
		gridpane.add(vbox3, 1, 2);
		

		
		//create the scene with the gridpane and dimensions		
		Scene scene = new Scene(gridpane, 400, 200);
		
		//add the scene to the stage
		primaryStage.setScene(scene);
		primaryStage.setTitle("Latin Translator");
		//show the window
		primaryStage.show();
	}
	class Button1ClickHandler implements EventHandler<ActionEvent>{
		public void handle(ActionEvent event) {
			label1.setText("Left");
		}
	}
	
	class Button2ClickHandler implements EventHandler<ActionEvent>{
		public void handle(ActionEvent event) {
			label2.setText("Right");
		}
	}
	
	class Button3ClickHandler implements EventHandler<ActionEvent>{
		public void handle(ActionEvent event) {
			label3.setText("Center");
		}
	}
}
