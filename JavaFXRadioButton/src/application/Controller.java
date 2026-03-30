package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class Controller {

	@FXML
	private RadioButton rButtonPizza;
	@FXML
	private RadioButton rButtonSandwich;
	@FXML
	private RadioButton rButtonBurger;
	@FXML
	private Label myLabel;
	
	public void getFood(ActionEvent e) {
		
		if (rButtonPizza.isSelected()) {
			myLabel.setText(rButtonPizza.getText());
		}else if (rButtonSandwich.isSelected()) {
			myLabel.setText(rButtonSandwich.getText());
		}else {
			myLabel.setText(rButtonBurger.getText());
		}

	}
	
}
