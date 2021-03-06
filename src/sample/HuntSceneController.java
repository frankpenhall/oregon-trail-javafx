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

public class HuntSceneController implements Initializable {

    private Stage stage;
    private Scene scene;
    private Parent root;

    int[] playerInventory = Inventory.getInventory();
    Image blankImg = new Image("/img/blank.png");

    private boolean bearShot, deerShot;
    
    @FXML
    Label ammoCountLabel, foodCountLabel;

    @FXML
    ImageView crosshairImg, bearImg, deerImg, emptyImg;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // animates the crosshair image
        TranslateTransition translate = new TranslateTransition();
        translate.setNode(crosshairImg);
        translate.setDuration(Duration.millis(1500));
        translate.setCycleCount(TranslateTransition.INDEFINITE);
        translate.setByX(545);
        translate.setAutoReverse(true);
        translate.play();
    }

    public void shoot() {
        if (playerInventory[2] > 0) {
            playerInventory[2] -= 1;
            ammoCountLabel.setText(String.valueOf(playerInventory[2]));
            Bounds crosshairBox = crosshairImg.getBoundsInParent();
            Bounds deerBox = deerImg.getBoundsInParent();
            Bounds bearBox = bearImg.getBoundsInParent();

            /*
            if the crosshair image overlaps onto of the bear image, then add food to inventory
            and remove the bear by replacing the image with a black image
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

    public void setScene() {
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

        TripMenuSceneController tripMenuSceneController = loader.getController();
        tripMenuSceneController.setScene();

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        String css = this.getClass().getResource("sample.css").toExternalForm();
        scene.getStylesheets().add(css);
        stage.show();
    }

}
