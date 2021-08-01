package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class EventSceneController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    String[] eventOutCome = new String[2];
    int choice;

    String[] eventArr = new String[16];

    @FXML
    Label eventTitleLabel, eventDescriptionLabel, eventDescriptionLabel2, option1Label, option2Label, option3Label;

    @FXML
    ImageView eventImage;

    int[] playerInventory = Inventory.getInventory();

    int playerSettlers = Settler.getSettlers();

    int playerMoney = Money.getMoney();

    Random rand = new Random();
    int x = rand.nextInt(6);

    public void option1(ActionEvent event) {
        System.out.println("You choice 1");
        choice = 1;

        computeResults(choice);

        FXMLLoader loader = new FXMLLoader(getClass().getResource("eventConclusionScene.fxml"));
        try {
            root = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        EventConclusionController eventConclusionController = loader.getController();
        eventConclusionController.setLabels(eventOutCome);

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        String css = this.getClass().getResource("sample.css").toExternalForm();
        scene.getStylesheets().add(css);
        stage.show();
    }

    public void option2(ActionEvent event) {
        System.out.println("You choice 2");
        choice = 2;

        computeResults(choice);

        FXMLLoader loader = new FXMLLoader(getClass().getResource("eventConclusionScene.fxml"));
        try {
            root = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        EventConclusionController eventConclusionController = loader.getController();
        eventConclusionController.setLabels(eventOutCome);

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        String css = this.getClass().getResource("sample.css").toExternalForm();
        scene.getStylesheets().add(css);
        stage.show();
    }

    public void option3(ActionEvent event) {
        System.out.println("You choice 3");
        choice = 3;

        computeResults(choice);

        FXMLLoader loader = new FXMLLoader(getClass().getResource("eventConclusionScene.fxml"));
        try {
            root = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        EventConclusionController eventConclusionController = loader.getController();
        eventConclusionController.setLabels(eventOutCome);

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        String css = this.getClass().getResource("sample.css").toExternalForm();
        scene.getStylesheets().add(css);
        stage.show();
    }

    public void setLabels() {
        setUpEvent();
        //System.out.println("Setting labels");
        eventTitleLabel.setText(eventArr[0]);
        eventDescriptionLabel.setText(eventArr[1]);
        eventDescriptionLabel2.setText(eventArr[2]);
        option1Label.setText(eventArr[3]);
        option2Label.setText(eventArr[4]);
        option3Label.setText(eventArr[5]);
        Image image = new Image(getClass().getResourceAsStream(eventArr[15]));
        eventImage.setFitHeight(200);
        eventImage.setFitWidth(200);
        eventImage.setImage(image);
    }

    public void setUpEvent() {
        System.out.println(x);
        if (x == 0) {
            System.out.println("Event 1 Selected");
            Event event = new Event();
            event.makeArray();
            eventArr = event.getEventArray();
        }
        else if (x == 1) {
            System.out.println("Event 2 Selected");
            Event2 event = new Event2();
            event.makeArray();
            eventArr = event.getEventArray();
        }
        else if (x == 2) {
            System.out.println("Event 2 Selected");
            Event2 event = new Event2();
            event.makeArray();
            eventArr = event.getEventArray();
        }
        else if (x == 3) {
            System.out.println("Event 3 Selected");
            Event3 event = new Event3();
            event.makeArray();
            eventArr = event.getEventArray();
        }
        else if (x == 4) {
            System.out.println("Event 4 Selected");
            Event4 event = new Event4();
            event.makeArray();
            eventArr = event.getEventArray();
        }
        else if (x == 5) {
            System.out.println("Event 5 Selected");
            Event5 event = new Event5();
            event.makeArray();
            eventArr = event.getEventArray();
        }
    }

    public void computeResults(int choice) {
        String[] strArr;
        if (choice == 1) {
            //System.out.println("You picked 1");
            System.out.println(eventArr[6]);
            strArr = eventArr[6].split(" ", 4);
            System.out.println(Arrays.toString(strArr));
            eventOutCome[0] = eventArr[9];
            eventOutCome[1] = eventArr[10];

        } else if (choice == 2) {
            //System.out.println("You picked 2");
            System.out.println(eventArr[7]);
            strArr = eventArr[7].split(" ", 4);
            System.out.println(Arrays.toString(strArr));
            eventOutCome[0] = eventArr[11];
            eventOutCome[1] = eventArr[12];
        } else {
            //System.out.println("You picked 3");
            System.out.println(eventArr[8]);
            strArr = eventArr[8].split(" ", 4);
            System.out.println(Arrays.toString(strArr));
            eventOutCome[0] = eventArr[13];
            eventOutCome[1] = eventArr[14];
        }

        for (int i=0; i<3; i += 2) {
            switch (strArr[i+1]) {
                // add if statement to check if player has enough to exchange
                case "food" -> playerInventory[0] += Integer.parseInt(strArr[i]);
                case "oxen" -> playerInventory[1] += Integer.parseInt(strArr[i]);
                case "ammo" -> playerInventory[2] += Integer.parseInt(strArr[i]);
                case "clothes" -> playerInventory[3] += Integer.parseInt(strArr[i]);
                case "spareParts" -> playerInventory[4] += Integer.parseInt(strArr[i]);
                case "settler" -> playerSettlers += Integer.parseInt(strArr[i]);
                case "money" -> playerMoney += Integer.parseInt(strArr[i]);
            }
        }
        Settler.setSettlers(playerSettlers);
        Money.setMoney(playerMoney);
    }

}
