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

public class CheckInventoryController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    Label ammoInvLabel, clothesInvLabel, foodInvLabel, oxenInvLabel, sparePartsInvLabel, moneyLabel;

    Inventory inventory = new Inventory();
    int[] playerInventory = inventory.getInventory();

    Money money = new Money();
    int playerMoney = money.getMoney();

    public void setLabels() {
        foodInvLabel.setText(String.valueOf(playerInventory[0]));
        oxenInvLabel.setText(String.valueOf(playerInventory[1]));
        ammoInvLabel.setText(String.valueOf(playerInventory[2]));
        clothesInvLabel.setText(String.valueOf(playerInventory[3]));
        sparePartsInvLabel.setText(String.valueOf(playerInventory[4]));
        moneyLabel.setText(String.valueOf(playerMoney));
    }

    public void switchToTripMenu(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("tripMenuScene.fxml"));
        try {
            root = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //playerInventory[5] = 5;
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
