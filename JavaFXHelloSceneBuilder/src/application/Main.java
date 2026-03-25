package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
//			Parent myCircle = FXMLLoader.load(getClass().getResource("MyCircle.fxml")) ;
//			Scene scene = new Scene(myCircle);
			Parent cssApplication = FXMLLoader.load(getClass().getResource("CssApplication.fxml")) ;
			Scene sceneForCss = new Scene(cssApplication);	
			sceneForCss.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(sceneForCss);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}