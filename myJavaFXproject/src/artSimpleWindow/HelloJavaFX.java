package artSimpleWindow;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloJavaFX extends Application {
    @Override
    public void start(Stage stage) {
        // Создаём элемент интерфейса
        Label label = new Label("Привет, JavaFX!");

        // Размещаем его в контейнере
        StackPane root = new StackPane();
        root.getChildren().add(label);

        // Создаём сцену с контейнером
        Scene scene = new Scene(root, 300, 200);

        // Настраиваем и показываем окно
        stage.setTitle("Моё первое JavaFX окно");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
