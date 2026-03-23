package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SceneController {
	@FXML
	TextField nameTextField;
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	public void login(ActionEvent event) throws IOException {
		
		String username = nameTextField.getText();
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("SceneThatTakesParameters.fxml"));
		root = loader.load();
		
		SceneController2 sceneController2 = loader.getController();
		sceneController2.displayName(username);
		
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
}