package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class SceneController {

	@FXML
	private Button logoutButton;
	@FXML
	private AnchorPane scenePane;
	
	Stage stage;
	
	public void logout(ActionEvent e) {
		
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Logout");
		alert.setHeaderText("UR about to logout");
		alert.setContentText("R U sure?");
		
		if (alert.showAndWait().get() == ButtonType.OK) {
			stage = (Stage)scenePane.getScene().getWindow();
			System.out.println("U succesfully logged out");
			stage.close();
		} else {
			System.out.println("Continue");
		}
		
	}
}
