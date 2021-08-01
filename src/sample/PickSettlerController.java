package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;

public class PickSettlerController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    Inventory inventory = new Inventory();
    int[] playerInventory = inventory.getInventory();

    public void switchToSupplyShop(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("supplyShopScene.fxml"));
        try {
            root = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        SupplyShopController supplyShopController = loader.getController();
        supplyShopController.setLabels();

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        String css = this.getClass().getResource("sample.css").toExternalForm();
        scene.getStylesheets().add(css);
        stage.show();
    }

    public void switchToMainMenu(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("mainMenu.fxml"));
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

    public void pickEasy(ActionEvent event) {

    }

    public void pickMedium(ActionEvent event) {

    }

    public void pickHard(ActionEvent event) {

    }

}
