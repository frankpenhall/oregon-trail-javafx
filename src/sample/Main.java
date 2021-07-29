package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("mainMenu.fxml"));
        stage.setTitle("Oregon Trail");
        Scene scene = new Scene(root);
        stage.setScene(scene);
        //scene.getStylesheets().add(getClass().getResource("sample.css").toExternalForm());
        //String css = this.getClass().getResource("sample.css").toExternalForm();
        //scene.getStylesheets().add(css);
        stage.show();
        //System.out.println(javafx.scene.text.Font.getFamilies());
    }

    public static void main(String[] args) {
        launch(args);
    }
}
/*
todo
add css styling to the entire game
add pixel art to the game
implement difficulty setting when player selects a settler
add more events
add losing conditions (settlers = 0, gameOver, food = 0, gameOver, oxens = 0, gameOver)
add randomization to each events independently

 */
