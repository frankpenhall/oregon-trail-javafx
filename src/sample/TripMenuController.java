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

public class TripMenuController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    Label settlerLabel, milesTraveledLabel, locationLabel;

    @FXML
    Button exitButton;

    Inventory inventory = new Inventory();
    int[] playerInventory = inventory.getInventory();

    Settler settlers = new Settler();
    int playerSettlers = settlers.getSettlers();

    Miles miles = new Miles();
    int playerMiles = miles.getTotalMiles();

    public void exitGame(ActionEvent event) {
        Stage stage = (Stage) exitButton.getScene().getWindow();
        stage.close();
    }

    public void setLabels() {
        settlerLabel.setText(String.valueOf(playerSettlers));
        milesTraveledLabel.setText(String.valueOf(playerMiles));
        if (playerMiles == 0) {
            locationLabel.setText("Missouri");
        } else if (playerMiles >= 25 && playerMiles < 200) {
            locationLabel.setText("Kansas");
        } else if (playerMiles >= 200 && playerMiles < 600) {
            locationLabel.setText("Nebraska");
        } else if (playerMiles >= 600 && playerMiles < 1100) {
            locationLabel.setText("Wyoming");
        } else if (playerMiles >= 1100 && playerMiles < 1600) {
            locationLabel.setText("Idaho");
        } else if (playerMiles >= 1600) {
            locationLabel.setText("Oregon");
        }
    }

    public void checkSupplies(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("checkInventoryScene.fxml"));
        try {
            root = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        CheckInventoryController checkInventoryController = loader.getController();
        checkInventoryController.setLabels();

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        String css = this.getClass().getResource("sample.css").toExternalForm();
        scene.getStylesheets().add(css);
        stage.show();
    }

    public void viewMap(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("viewMapScene.fxml"));
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

    public void hunt(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("huntScene.fxml"));
        try {
            root = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        HuntController huntController = loader.getController();
        huntController.setLabels();

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        String css = this.getClass().getResource("sample.css").toExternalForm();
        scene.getStylesheets().add(css);
        stage.show();
    }

    public void continueTrail(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("eventScene.fxml"));
        try {
            root = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        EventSceneController eventSceneController = loader.getController();
        eventSceneController.setLabels();

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        String css = this.getClass().getResource("sample.css").toExternalForm();
        scene.getStylesheets().add(css);
        stage.show();
    }
}
