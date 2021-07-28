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
import java.util.Random;

public class TripMenuController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    Label settlerLabel, milesTraveledLabel;

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
        //String css = this.getClass().getResource("sample.css").toExternalForm();
        //scene.getStylesheets().add(css);
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
        //String css = this.getClass().getResource("sample.css").toExternalForm();
        //scene.getStylesheets().add(css);
        stage.show();
    }

    public void rest(ActionEvent event) {

    }

    public void continueTrail(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("continueTrail.fxml"));
        try {
            root = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        ContinueTrailController continueTrailController = loader.getController();
        continueTrailController.setLabels();

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        //String css = this.getClass().getResource("sample.css").toExternalForm();
        //scene.getStylesheets().add(css);
        stage.show();

    }

    /*
    public void setUpEvent() {
        System.out.println(x);
        if (x == 0) {
            System.out.println("Event 1 Selected");
            Event event1 = new Event();
        }
        else if (x == 1) {
            System.out.println("Event 2 Selected");
            Event2 event2 = new Event2();
        }
    }
    */

}
