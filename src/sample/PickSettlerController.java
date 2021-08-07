package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;

import java.io.IOException;

public class PickSettlerController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    Inventory inventory = new Inventory();
    int[] playerInventory = inventory.getInventory();

    @FXML
    RadioButton radioBanker, radioCarpenter, radioFarmer;

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

    public void pickDifficulty(ActionEvent event) {
        if (radioBanker.isSelected()) {
            System.out.println("You choose banker");
            Money.setMoney(1600);
            Settler.setSettlers(5);
        }
        else if (radioCarpenter.isSelected()) {
            System.out.println("You choose carpenter");
            Money.setMoney(1200);
            Settler.setSettlers(4);
        }
        else if (radioFarmer.isSelected()) {
            System.out.println("You choose farmer");
            Money.setMoney(800);
            Settler.setSettlers(3);
        }

    }

    public void switchToHintScene(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("hintScene.fxml"));
        try {
            root = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        String css = this.getClass().getResource("sample.css").toExternalForm();
        scene.getStylesheets().add(css);
        stage.show();
    }

    public void switchToPickSettler(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("pickSettlerScene.fxml"));
        try {
            root = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        String css = this.getClass().getResource("sample.css").toExternalForm();
        scene.getStylesheets().add(css);
        stage.show();
    }

}
