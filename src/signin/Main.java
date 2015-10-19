package signin;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("signin.fxml"));
        primaryStage.setTitle("Calculate");

        Scene scene = new Scene(root, 500, 300);
        /*primaryStage.setScene(new Scene(root, 300, 180));

        scene.getStylesheets().add(getClass().
                getResource("signin.css").toExternalForm());*/

        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
