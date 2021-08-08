package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class TownspeopleSceneController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    Settler settlers = new Settler();
    int playerSettlers = settlers.getSettlers();

    public void noSettler(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("visitSettlementScene.fxml"));
        try {
            root = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        VisitSettlementSceneController visitSettlementSceneController = loader.getController();
        visitSettlementSceneController.setScene();

        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        String css = this.getClass().getResource("sample.css").toExternalForm();
        scene.getStylesheets().add(css);
        stage.show();
    }

    public void addSettler(ActionEvent event) {
        playerSettlers += 1;
        Settler.setSettlers(playerSettlers);

        // switch to the other visit settlement scene if player recruits a settler
        // this is to prevent the player from recruiting multiple settlers
        FXMLLoader loader = new FXMLLoader(getClass().getResource("visitSettlementScene2.fxml"));
        try {
            root = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        VisitSettlementSceneController visitSettlementSceneController = loader.getController();
        visitSettlementSceneController.setScene();

        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        String css = this.getClass().getResource("sample.css").toExternalForm();
        scene.getStylesheets().add(css);
        stage.show();
    }

    public void switchToVisit(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("visitSettlementScene2.fxml"));
        try {
            root = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        VisitSettlementSceneController visitSettlementSceneController = loader.getController();
        visitSettlementSceneController.setScene();

        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        String css = this.getClass().getResource("sample.css").toExternalForm();
        scene.getStylesheets().add(css);
        stage.show();
    }

}
