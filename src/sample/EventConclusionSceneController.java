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

public class EventConclusionSceneController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    int playerMiles = Miles.getTotalMiles();
    int[] playerInventory = Inventory.getInventory();
    int playerSettlers = Settler.getSettlers();
    private int playerScore = PlayerScore.getScore();

    @FXML
    Label eventConclusionLabel, eventConclusionLabel2;

    public void setScene(String[] eventOutcome) {
        this.eventConclusionLabel.setText(eventOutcome[0]);
        this.eventConclusionLabel2.setText(eventOutcome[1]);
    }

    public void switchScene(ActionEvent event) {
        playerMiles += 25; // Adding miles after completing an event
        Miles.setTotalMiles(playerMiles);
        playerScore += 100; // Adding to the player store after completing an event
        PlayerScore.setScore(playerScore);

        if (playerMiles == 300 || playerMiles == 600 || playerMiles == 950 || playerMiles == 1250 || playerMiles == 1550) {
            // Checks the miles to see if player reaches a fort/settlement
            FXMLLoader loader = new FXMLLoader(getClass().getResource("visitSettlementScene.fxml"));
            try {
                root = loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            VisitSettlementSceneController visitSettlementSceneController = loader.getController();
            visitSettlementSceneController.setScene();
        }
        else if (playerMiles == 2100) {
            // Checks the miles to see if player reaches the end of the trail
            FXMLLoader loader = new FXMLLoader(getClass().getResource("winGameScene.fxml"));
            try {
                root = loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            WinGameSceneController winGameSceneController = loader.getController();
            winGameSceneController.setScene();
        }
        else if (playerMiles == 450 || playerMiles == 850 || playerMiles == 1100 || playerMiles == 1900) {
            // Checks the miles to see if player reaches a landmark
            FXMLLoader loader = new FXMLLoader(getClass().getResource("landmarkScene.fxml"));
            try {
                root = loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            LandmarkSceneController landmarkSceneController = loader.getController();
            landmarkSceneController.setScene();
        }
        else if (playerSettlers == 0 || playerInventory[0] <= 0 || playerInventory[1] <= 0 || playerInventory[2] <= 0 || playerInventory[3] <= 0 || playerInventory[4] <= 0) {
            // Checks the user's inventory to see if player has enough miles
            FXMLLoader loader = new FXMLLoader(getClass().getResource("gameOverScene.fxml"));
            try {
                root = loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            GameOverSceneController gameOverSceneController = loader.getController();
            gameOverSceneController.setScene();
        }
        else {
            // If all checks passes, switch to the Trip Menu Scene
            FXMLLoader loader = new FXMLLoader(getClass().getResource("tripMenuScene.fxml"));
            try {
                root = loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            TripMenuSceneController tripMenuSceneController = loader.getController();
            tripMenuSceneController.setScene();
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
