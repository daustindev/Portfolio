package lab7;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
public class TravelExpenses extends Application{
	//fields
	TextField[] inputs = new TextField[8];
	private Label days;
	private Label airfare;
	private Label rental;
	private Label milesDriven;
	private Label parkingFee;
	private Label taxiCharges;
	private Label registrationFees;
	private Label lodging;
	private Label totalExpenses;
	private Label foodReimbursed;
	private Label parkingReimbursed;
	private Label taxiReimbursed;
	private Label lodgingReimbursed;
	private Label drivingReimbursed;
	private Label excess;
	private Label saved;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public void start(Stage primaryStage) {
		//instantiate the objects
		days = new Label("Length of the trip");
		airfare = new Label("Airfare");
		rental = new Label("Rental fees");
		parkingFee = new Label("Parking fees");
		taxiCharges = new Label("Taxi charges");
		registrationFees = new Label("Registration fees");
		lodging = new Label("Lodging");
		milesDriven = new Label("Miles driven in private vehicle");
		totalExpenses = new Label();
		foodReimbursed = new Label();
		taxiReimbursed = new Label();
		lodgingReimbursed = new Label();
		drivingReimbursed = new Label();
		parkingReimbursed = new Label();
		excess = new Label();
		saved = new Label();

		for(int i = 0; i < inputs.length; ++i) {
			inputs[i] = new TextField();
		}
		
		//create a button
		Button calculate = new Button("Calculate");
		
		
		//register the event handler
		calculate.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				double total = 0;
				int tripLength = Integer.parseInt(inputs[0].getText());
				double[] values = new double[6];
				int j = 1;
				for(int i = 0; i < values.length; ++i) {
					values[i] = Double.parseDouble(inputs[j].getText());
					total += values[i];
					j++;
				}
				double foodReimbursedVal = tripLength * 47;
				total += foodReimbursedVal;
				String totalString = String.format("total expenses: $%.2f", total);
				double miles = Double.parseDouble(inputs[7].getText());
				String foodReimbursedString = String.format("Food reimbursed: $%.2f", foodReimbursedVal);
				foodReimbursed.setText(foodReimbursedString);
				double maxParking = tripLength * 20;
				String maxParkingString = String.format("Parking allowed: $%.2f", maxParking);
				double maxTaxi = tripLength * 40;
				String maxTaxiString = String.format("Taxi fees allowed: $%.2f", maxTaxi);
				double maxLodging = tripLength * 195;
				String maxLodgingString = String.format("Lodging allowed: $%.2f", maxLodging);
				double maxMiles = miles * .42;
				String milesReimbursed = String.format("Driving reimbursed $%.2f", maxMiles);
				drivingReimbursed.setText(milesReimbursed);
				String reimbursedParkingString = String.format("Parking reimbursed: $%.2f", maxParking);
				parkingReimbursed.setText(reimbursedParkingString);
				
				String reimbursedTaxiString = String.format("Parking reimbursed: $%.2f", maxTaxi);
				taxiReimbursed.setText(reimbursedTaxiString);
				double reimbursedLodging;
				
				String reimbursedLodgingString = String.format("Parking reimbursed: $%.2f", maxLodging);
				lodgingReimbursed.setText(reimbursedLodgingString);
				double reimbursedTotal = foodReimbursedVal + maxParking + maxTaxi + maxLodging + maxMiles;
				
					double excessVal = total - reimbursedTotal;
					if(excessVal < 0) {
						excessVal = 0;
					}
					String excessString = String.format("Excess Expenses: $%.2f", excessVal);
					excess.setText(excessString);
					double savedVal = reimbursedTotal - total;
					if(savedVal < 0) {
						savedVal = 0;
					}
					String savedString = String.format("Money Saved: $%.2f", savedVal);
					saved.setText(savedString);
				}
		});
		//create an gridpane
		GridPane gridpane = new GridPane();
		gridpane.setVgap(10);
		gridpane.setHgap(10);
		
		//put the controls in the gridpane
		gridpane.add(days, 0, 0);
		gridpane.add(inputs[0], 2, 0);
		gridpane.add(airfare, 0, 1);
		gridpane.add(inputs[1], 2, 1);
		gridpane.add(rental, 0, 2);
		gridpane.add(inputs[2], 2, 2);
		gridpane.add(parkingFee, 0, 3);
		gridpane.add(inputs[3], 2, 3);
		gridpane.add(taxiCharges, 0, 4);
		gridpane.add(inputs[4], 2, 4);
		gridpane.add(registrationFees, 0, 5);
		gridpane.add(inputs[5], 2, 5);
		gridpane.add(lodging, 0, 6);
		gridpane.add(inputs[6], 2, 6);
		gridpane.add(milesDriven, 0, 7);
		gridpane.add(inputs[7], 2, 7);
		gridpane.add(calculate, 1, 8);
		gridpane.add(totalExpenses, 1, 10);
		gridpane.add(foodReimbursed, 1, 12);
		gridpane.add(parkingReimbursed, 1, 13);
		gridpane.add(taxiReimbursed, 1, 14);
		gridpane.add(lodgingReimbursed, 1, 15);
		gridpane.add(drivingReimbursed, 1, 16);
		gridpane.add(excess, 1, 18);
		gridpane.add(saved, 1, 19);
		
		//create the scene
		Scene scene = new Scene(gridpane);
		
		//add the scene to the stage
		primaryStage.setScene(scene);
		primaryStage.setTitle("Travel Expenses");
		primaryStage.show();
	}
}
