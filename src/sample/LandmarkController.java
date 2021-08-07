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

public class LandmarkController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    Label landmarkTitleLabel, landmarkDesLabel;

    @FXML
    ImageView landmarkImg;

    int playerMiles = Miles.getTotalMiles();

    public void setUpScene() {
        if (playerMiles == 450) {
            landmarkTitleLabel.setText("Landmark: Chimney Rock");
            landmarkDesLabel.setText("");
            Image chimneyImg = new Image("/img/chimneyrock.png");
            landmarkImg.setImage(chimneyImg);
        }

        else if (playerMiles == 850) {
            landmarkTitleLabel.setText("Landmark: Independence Rock");
            landmarkDesLabel.setText("");
            Image independenceImg = new Image("/img/independencerock.png");
            landmarkImg.setImage(independenceImg);
        }

        else if (playerMiles == 1100) {
            landmarkTitleLabel.setText("Landmark: Soda Springs");
            landmarkDesLabel.setText("");
            Image sodaSpringsImg = new Image("/img/sodasprings.png");
            landmarkImg.setImage(sodaSpringsImg);
        }

        else if (playerMiles == 1900) {
            landmarkTitleLabel.setText("Landmark: Mount Hood");
            landmarkDesLabel.setText("");
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

        TripMenuController tripMenuController = loader.getController();
        tripMenuController.setLabels();

        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        String css = this.getClass().getResource("sample.css").toExternalForm();
        scene.getStylesheets().add(css);
        stage.show();
    }
}
