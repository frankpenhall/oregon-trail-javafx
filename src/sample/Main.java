package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("mainMenuScene.fxml"));
        stage.setTitle("Oregon Trail");
        Scene scene = new Scene(root);
        stage.setScene(scene);
        //scene.getStylesheets().add(getClass().getResource("sample.css").toExternalForm());
        stage.setResizable(false);
        String css = this.getClass().getResource("sample.css").toExternalForm();
        scene.getStylesheets().add(css);
        stage.show();

        System.out.println(javafx.scene.text.Font.getFamilies());
    }

    public static void main(String[] args) {
        launch(args);
    }
}
/*

Fix event text and labels
implement difficulty setting when player selects a settler
Add more events (80 events total?)
Implement Hunt Mechanic
Have Player Stats displayed at the gameOver and winGame
Implement PlayerScore, player gets points for how far they get and their stats (1.5x points/2x points for medium/hard difficulty)
Add HelpScene
Rename classes and files to better understandability

 */
