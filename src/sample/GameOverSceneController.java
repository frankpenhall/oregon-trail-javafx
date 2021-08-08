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

public class GameOverSceneController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    int[] playerInventory = Inventory.getInventory();
    int playerSettlers = Settler.getSettlers();

    @FXML
    Button exitButton;

    @FXML
    Label gameOverLabel, gameOverLabel2, scoreLabel;

    public void switchToMainMenu(ActionEvent event) {
        // first sets all player stats to default values
        playerInventory[0] = 0;
        playerInventory[1] = 0;
        playerInventory[2] = 0;
        playerInventory[3] = 0;
        playerInventory[4] = 0;
        Money.setMoney(1200);
        Settler.setSettlers(5);
        Miles.setTotalMiles(0);
        PlayerScore.setScore(0);

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
        // set the game over message
        if (playerInventory[0] <= 0) {
            gameOverLabel.setText("You ran out of food while traveling.");
            gameOverLabel2.setText("You and your settlers all starved!");
        }

        else if (playerInventory[1] <= 0) {
            gameOverLabel.setText("You have no more oxen left.");
            gameOverLabel2.setText("You and your settlers are stranded!");
        }

        else if (playerInventory[2] <= 0) {
            gameOverLabel.setText("You ran out of ammo while traveling.");
            gameOverLabel2.setText("");
        }

        else if (playerInventory[3] <= 0) {
            gameOverLabel.setText("You ran out of extra clothes for the winter.");
            gameOverLabel2.setText("");
        }

        else if (playerInventory[4] <= 0) {
            gameOverLabel.setText("You ran out of spare parts for your wagon.");
            gameOverLabel2.setText("");
        }

        else if (playerSettlers <= 0) {
            gameOverLabel.setText("All of your settlers perished!");
            gameOverLabel2.setText("");
        }
    }
}
