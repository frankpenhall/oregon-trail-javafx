package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class VisitSettlementController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchToStore(ActionEvent event) {

    }

    public void switchToPeople(ActionEvent event) {

    }

    public void switchToTripMenu(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("tripMenu.fxml"));
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
        //String css = this.getClass().getResource("sample.css").toExternalForm();
        //scene.getStylesheets().add(css);
        stage.show();
    }
}
