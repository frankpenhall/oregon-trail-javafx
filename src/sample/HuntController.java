package sample;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Bounds;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.transform.Translate;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HuntController implements Initializable {

    private Stage stage;
    private Scene scene;
    private Parent root;
    
    @FXML
    Label ammoCountLabel, foodCountLabel;

    @FXML
    ImageView crosshairImg, bearImg, deerImg, emptyImg;

    int[] playerInventory = Inventory.getInventory();
    Image blankImg = new Image("/img/blank.png");

    boolean bearShot, deerShot;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        TranslateTransition translate = new TranslateTransition();
        translate.setNode(crosshairImg);
        translate.setDuration(Duration.millis(1500));
        translate.setCycleCount(TranslateTransition.INDEFINITE);
        translate.setByX(545);
        translate.setAutoReverse(true);
        translate.play();
    }

    public void setLabels() {
        ammoCountLabel.setText(String.valueOf(playerInventory[2]));
        foodCountLabel.setText(String.valueOf(playerInventory[0]));
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

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        String css = this.getClass().getResource("sample.css").toExternalForm();
        scene.getStylesheets().add(css);
        stage.show();
    }

    public void shoot() {
        if (playerInventory[2] > 0) {
            playerInventory[2] -= 1;
            ammoCountLabel.setText(String.valueOf(playerInventory[2]));
            Bounds crosshairBox = crosshairImg.getBoundsInParent();
            Bounds deerBox = deerImg.getBoundsInParent();
            Bounds bearBox = bearImg.getBoundsInParent();
        /*
        double[] crosshairArr = new double[4];
        crosshairArr[0] = crosshairBox.getMinX();
        crosshairArr[1] = crosshairBox.getMinY();
        crosshairArr[2] = crosshairBox.getMaxX();
        crosshairArr[3] = crosshairBox.getMaxY();

        double[] animalArr = new double[4];
        animalArr[0] = animalBox.getMinX();
        animalArr[1] = animalBox.getMinY();
        animalArr[2] = animalBox.getMaxX();
        animalArr[3] = animalBox.getMaxY();

        for (int i=0; i<crosshairArr.length; i++) {
            System.out.print(crosshairArr[i] + " ");
        }
        */

            if (crosshairBox.intersects(bearBox) && !bearShot) {
                System.out.println("Shot Bear!");
                bearImg.setImage(blankImg);
                bearShot = true;
                playerInventory[0] += 3;
                foodCountLabel.setText(String.valueOf(playerInventory[0]));

            }
            if (crosshairBox.intersects(deerBox) && !deerShot) {
                System.out.println("Shot Deer!");
                deerImg.setImage(blankImg);
                deerShot = true;
                playerInventory[0] += 3;
                foodCountLabel.setText(String.valueOf(playerInventory[0]));

            }
        }
    }
}
