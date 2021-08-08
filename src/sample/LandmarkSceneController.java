package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class LandmarkSceneController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    int playerMiles = Miles.getTotalMiles();

    @FXML
    Label landmarkTitleLabel, landmarkDesLabel, landmarkDesLabel2;

    @FXML
    ImageView landmarkImg;

    public void setScene() {
        if (playerMiles == 450) {
            landmarkTitleLabel.setText("Landmark: Chimney Rock");
            landmarkDesLabel.setText("First recorded in 1827 by Joshua Pilcher, it is known that emigrants");
            landmarkDesLabel2.setText("climbed up the cone to carve their names on the tower.");
            Image chimneyImg = new Image("/img/chimneyrock.png");
            landmarkImg.setImage(chimneyImg);
        }

        else if (playerMiles == 850) {
            landmarkTitleLabel.setText("Landmark: Independence Rock");
            landmarkDesLabel.setText("This giant piece of granite is 1,900 feet long and 128 feet high.");
            landmarkDesLabel2.setText("This was a favorite resting stop for travelers.");
            Image independenceImg = new Image("/img/independencerock.png");
            landmarkImg.setImage(independenceImg);
        }

        else if (playerMiles == 1100) {
            landmarkTitleLabel.setText("Landmark: Soda Springs");
            landmarkDesLabel.setText("Natural bubbling pools of carbonated water, caused by volcanic activity.");
            landmarkDesLabel2.setText("Emigrants used the pools of water for medicinal and bathing purposes. ");
            Image sodaSpringsImg = new Image("/img/sodasprings.png");
            landmarkImg.setImage(sodaSpringsImg);
        }

        else if (playerMiles == 1900) {
            landmarkTitleLabel.setText("Landmark: Mount Hood");
            landmarkDesLabel.setText("The snow-capped peak is a defining feature of this stratovolcano.");
            landmarkDesLabel2.setText("At 11,244 feet, it is the highest point in Oregon.");
            Image mountHoodImg = new Image("/img/mounthood.png");
            landmarkImg.setImage(mountHoodImg);
        }
    }

    public void switchToTripMenu(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("tripMenuScene.fxml"));
        try {
            root = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        TripMenuSceneController tripMenuSceneController = loader.getController();
        tripMenuSceneController.setScene();

        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        String css = this.getClass().getResource("sample.css").toExternalForm();
        scene.getStylesheets().add(css);
        stage.show();
    }
}
