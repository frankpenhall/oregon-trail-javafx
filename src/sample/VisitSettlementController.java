package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class VisitSettlementController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    Label fortTitleLabel;

    @FXML
    ImageView fortImage;

    int playerMiles = Miles.getTotalMiles();

    public void setUpScene() {
        if (playerMiles == 300) {
            fortTitleLabel.setText("Welcome to Fort Kearny!");
            Image fortkearnyImg = new Image("/img/fortkearny.png");
            fortImage.setImage(fortkearnyImg);
        }
        else if (playerMiles == 600) {
            fortTitleLabel.setText("Welcome to Fort Laramie!");
            Image fortlaramieImg = new Image("/img/fortlaramie.png");
            fortImage.setImage(fortlaramieImg);
        }
        else if (playerMiles == 950) {
            fortTitleLabel.setText("Welcome to Fort Bridger!");
            Image fortbridgerImg = new Image("/img/fortbridger.png");
            fortImage.setImage(fortbridgerImg);
        }
        else if (playerMiles == 1250) {
            fortTitleLabel.setText("Welcome to Fort Hall!");
            Image forthallImg = new Image("/img/forthall.png");
            fortImage.setImage(forthallImg);
        }
        else if (playerMiles == 1550) {
            fortTitleLabel.setText("Welcome to Fort Boise!");
            Image fortboiseImg = new Image("/img/fortboise.png");
            fortImage.setImage(fortboiseImg);
        }
    }

    public void switchToStore(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("generalStoreScene.fxml"));
        try {
            root = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        GeneralStoreController generalStoreController = loader.getController();
        generalStoreController.setLabels();

        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        String css = this.getClass().getResource("sample.css").toExternalForm();
        scene.getStylesheets().add(css);
        stage.show();
    }

    public void switchToStore2(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("generalStoreScene2.fxml"));
        try {
            root = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        GeneralStoreController generalStoreController = loader.getController();
        generalStoreController.setLabels();

        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        String css = this.getClass().getResource("sample.css").toExternalForm();
        scene.getStylesheets().add(css);
        stage.show();
    }

    public void switchToPeople(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("townspeopleScene.fxml"));
        try {
            root = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        String css = this.getClass().getResource("sample.css").toExternalForm();
        scene.getStylesheets().add(css);
        stage.show();
    }

    public void switchToPeople2(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("townspeopleScene2.fxml"));
        try {
            root = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        String css = this.getClass().getResource("sample.css").toExternalForm();
        scene.getStylesheets().add(css);
        stage.show();
    }

    public void switchToTripMenu(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("tripMenuScene.fxml"));
        try {
            root = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

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
