package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {

	@FXML
	private Label myLabel;
	@FXML
	private CheckBox myCheckBox;
	@FXML
	private ImageView myImage;
	
	Image myImage1 = new Image(getClass().getResourceAsStream("LightOff.jpg"));
	Image myImage2 = new Image(getClass().getResourceAsStream("LightOn.jpg"));
	
	public void press(ActionEvent e) {
		
		if (myCheckBox.isSelected()) {
			myLabel.setText("ON");
			myImage.setImage(myImage2);
		} else {
			myLabel.setText("OFF");
			myImage.setImage(myImage1);
		}
		
	}
	
	
}
