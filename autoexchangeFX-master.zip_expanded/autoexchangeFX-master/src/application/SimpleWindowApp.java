package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.paint.Color;


public class SimpleWindowApp extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

	@Override
	public void start(Stage stage) throws Exception {
		
		startWindow(stage);
		
	}

	private void startWindow(Stage stage) {
		TabPane tabPane = createTabPane();
		
		Scene scene = new Scene(tabPane, Color.AZURE);
				
		stage.getIcons().add(new Image("icon.png"));
		stage.setTitle("Автообмен");
		stage.setScene(scene);
		stage.setWidth(1024);
		stage.setHeight(768);
		
		stage.show();
	}

	private TabPane createTabPane() {
		TabPane tabPane = new TabPane();
        Tab tab1 = new Tab("Главная");
        Tab tab2 = new Tab("Настройки");
        Tab tab3 = new Tab("О программе");
        
        tab1.setContent(createHomeContent());
                        
        tabPane.getTabs().addAll(tab1, tab2, tab3);
		return tabPane;
	}
	
    private VBox createHomeContent() {
        VBox vbox = new VBox(10); // отступ между элементами 10px
        vbox.setStyle("-fx-padding: 20; -fx-background-color: #f0f8ff;");
        
        Label statusLabel = new Label("Готов к работе");
        statusLabel.setStyle("-fx-padding: 10; -fx-background-color: #e0e0e0; -fx-font-size: 14px;");

        Button buttonAdd = new Button("Добавить");
        buttonAdd.setOnAction(e -> {
            statusLabel.setText("Добавляем базы...");
        });
        
        vbox.getChildren().addAll(buttonAdd, statusLabel);
        return vbox;
    }
}
