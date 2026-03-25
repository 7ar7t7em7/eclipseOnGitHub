package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;


public class Controller {
	
	@FXML
	private Circle myCircle;
	private double X;
	private double Y;
	
	public void up(ActionEvent e) {
		//System.out.println("UP");
		myCircle.setCenterY(Y-=10);
	}
	public void right(ActionEvent e) {
		//System.out.println("RIGHT");
		myCircle.setCenterX(X+=10);
	}
	public void down(ActionEvent e) {
		//System.out.println("DOWN");
		myCircle.setCenterY(Y+=10);
	}
	public void left(ActionEvent e) {
		//System.out.println("LEFT");
		myCircle.setCenterX(X-=10);
	}

}
