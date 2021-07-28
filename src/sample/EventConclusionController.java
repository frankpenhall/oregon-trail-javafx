package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;

public class EventConclusionController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    Label eventConclusionLabel;

    Miles miles = new Miles();
    int playerMiles = miles.getTotalMiles();

    public void setLabels(String eventOutcome) {
        eventConclusionLabel.setText(eventOutcome);
    }

    public void switchToTripMenu(ActionEvent event) {
        playerMiles += 15;
        miles.setTotalMiles(playerMiles);
        if (playerMiles == 60 || playerMiles == 120) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("visitSettlement.fxml"));
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
            //String css = this.getClass().getResource("sample.css").toExternalForm();
            //scene.getStylesheets().add(css);
            stage.show();
        }
        else {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("tripMenu.fxml"));
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
            //String css = this.getClass().getResource("sample.css").toExternalForm();
            //scene.getStylesheets().add(css);
            stage.show();
        }
    }
}
