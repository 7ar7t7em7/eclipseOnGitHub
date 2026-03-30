package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class Scene01Controller {
	@FXML
	private Label fxLabel;
	@FXML
	private TextArea fxTextEditor;
	@FXML
	private Button fxSubmit;
	
	int age;
	
	public void submit(ActionEvent event) {
		try {
			fxLabel.setText("Welcome");
			age = Integer.parseInt(fxTextEditor.getText());
			if (age >= 18) {
				fxLabel.setText("UR now signed up!");
			} else {
				fxLabel.setText("UR too young");
			}
		} 
		catch (NumberFormatException nfe) {
			fxLabel.setText("Error");
			System.out.println("Enter number plz");
		}
		catch (Exception e) {
			System.out.println(e);
		}

	}
	
}
