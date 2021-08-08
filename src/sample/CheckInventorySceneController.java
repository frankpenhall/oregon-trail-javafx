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

public class CheckInventorySceneController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    Inventory inventory = new Inventory();
    int[] playerInventory = inventory.getInventory();

    Money money = new Money();
    int playerMoney = money.getMoney();

    @FXML
    Label ammoInvLabel, clothesInvLabel, foodInvLabel, oxenInvLabel, sparePartsInvLabel, moneyLabel;

    public void setScene() {
        foodInvLabel.setText(String.valueOf(playerInventory[0]));
        oxenInvLabel.setText(String.valueOf(playerInventory[1]));
        ammoInvLabel.setText(String.valueOf(playerInventory[2]));
        clothesInvLabel.setText(String.valueOf(playerInventory[3]));
        sparePartsInvLabel.setText(String.valueOf(playerInventory[4]));
        moneyLabel.setText(String.valueOf(playerMoney));
    }

    public void switchToTripMenu(ActionEvent event) {
        // Switches to the Trip Menu Scene
        FXMLLoader loader = new FXMLLoader(getClass().getResource("tripMenuScene.fxml"));
        try {
            root = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Calls the setScene method in Trip Menu before switching scenes, this set labels
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
