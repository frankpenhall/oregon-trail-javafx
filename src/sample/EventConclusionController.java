package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class EventConclusionController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    Label eventConclusionLabel, eventConclusionLabel2;

    int playerMiles = Miles.getTotalMiles();

    int[] playerInventory = Inventory.getInventory();

    int playerSettlers = Settler.getSettlers();

    public void setLabels(String[] eventOutcome) {
        this.eventConclusionLabel.setText(eventOutcome[0]);
        this.eventConclusionLabel2.setText(eventOutcome[1]);
    }

    public void switchToTripMenu(ActionEvent event) {
        playerMiles += 25;
        Miles.setTotalMiles(playerMiles);

        if (playerMiles == 300 || playerMiles == 600 || playerMiles == 950 || playerMiles == 1250 || playerMiles == 1550) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("visitSettlementScene.fxml"));
            try {
                root = loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            VisitSettlementController visitSettlementController = loader.getController();
            visitSettlementController.setUpScene();
        }
        else if (playerMiles == 2100) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("winGameScene.fxml"));
            try {
                root = loader.load();
                System.out.println("I'm here");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if (playerMiles == 450 || playerMiles == 850 || playerMiles == 1100 || playerMiles == 1900) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("landmarkScene.fxml"));
            try {
                root = loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            LandmarkController landmarkController = loader.getController();
            landmarkController.setUpScene();
        }
        else if (playerSettlers == 0 || playerInventory[0] <= 0 || playerInventory[1] <= 0 || playerInventory[2] <= 0 || playerInventory[3] <= 0 || playerInventory[4] <= 0) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("gameOverScene.fxml"));
            try {
                root = loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            GameOverController gameOverController = loader.getController();
            gameOverController.setUpScene();
        }
        else {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("tripMenuScene.fxml"));
            try {
                root = loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            TripMenuController tripMenuController = loader.getController();
            tripMenuController.setLabels();
        }
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        String css = this.getClass().getResource("sample.css").toExternalForm();
        scene.getStylesheets().add(css);
        stage.show();
    }
}
