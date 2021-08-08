package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class WinGameSceneController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    int[] playerInventory = Inventory.getInventory();

    @FXML
    Button exitButton;

    @FXML
    Label scoreLabel;

    public void setScene() {
        // multiples the player score depending on the selected difficulty
        if (PlayerScore.getDifficulty().equals("Banker")) {
            scoreLabel.setText(String.valueOf(PlayerScore.getScore()));
        }
        else if (PlayerScore.getDifficulty().equals("Carpenter")) {
            scoreLabel.setText(String.valueOf(PlayerScore.getScore() * 1.5));
        }
        else if (PlayerScore.getDifficulty().equals("Farmer")) {
            scoreLabel.setText(String.valueOf(PlayerScore.getScore() * 2));
        }
    }

    public void switchToMainMenu(ActionEvent event) {
        // reset player stats to default
        playerInventory[0] = 0;
        playerInventory[1] = 0;
        playerInventory[2] = 0;
        playerInventory[3] = 0;
        playerInventory[4] = 0;
        Money.setMoney(1200);
        Settler.setSettlers(5);
        Miles.setTotalMiles(0);

        FXMLLoader loader = new FXMLLoader(getClass().getResource("mainMenuScene.fxml"));
        try {
            root = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        String css = this.getClass().getResource("sample.css").toExternalForm();
        scene.getStylesheets().add(css);
        stage.show();
    }

    public void exitGame(ActionEvent event) {
        Stage stage = (Stage) exitButton.getScene().getWindow();
        stage.close();
    }
}
