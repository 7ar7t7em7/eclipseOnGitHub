package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class SceneController2 {
	@FXML
	Label labelHello;
	public void displayName(String username) {
		labelHello.setText("Hi " + username);
	}
}
