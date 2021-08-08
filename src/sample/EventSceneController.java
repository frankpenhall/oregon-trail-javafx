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

    public String[] eventOutCome = new String[2];
    int choice;

    int[] playerInventory = Inventory.getInventory();
    int playerSettlers = Settler.getSettlers();
    int playerMoney = Money.getMoney();

    Random rand = new Random();
    int x = rand.nextInt(15);

    String[] eventArr = new String[16];

    @FXML
    Label eventTitleLabel, eventDescriptionLabel, eventDescriptionLabel2, option1Label, option2Label, option3Label;

    @FXML
    ImageView eventImage;

    public void option1(ActionEvent event) {
        System.out.println("You choose 1");
        choice = 1;

        computeResults(choice); // calls the method to compute the results

        FXMLLoader loader = new FXMLLoader(getClass().getResource("eventConclusionScene.fxml"));
        try {
            root = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        EventConclusionSceneController eventConclusionSceneController = loader.getController();
        eventConclusionSceneController.setScene(eventOutCome);

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        String css = this.getClass().getResource("sample.css").toExternalForm();
        scene.getStylesheets().add(css);
        stage.show();
    }

    public void option2(ActionEvent event) {
        System.out.println("You choose 2");
        choice = 2;

        computeResults(choice); // calls the method to compute the results

        FXMLLoader loader = new FXMLLoader(getClass().getResource("eventConclusionScene.fxml"));
        try {
            root = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        EventConclusionSceneController eventConclusionSceneController = loader.getController();
        eventConclusionSceneController.setScene(eventOutCome);

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        String css = this.getClass().getResource("sample.css").toExternalForm();
        scene.getStylesheets().add(css);
        stage.show();
    }

    public void option3(ActionEvent event) {
        System.out.println("You choose 3");
        choice = 3;

        computeResults(choice); // calls the method to compute the results

        FXMLLoader loader = new FXMLLoader(getClass().getResource("eventConclusionScene.fxml"));
        try {
            root = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        EventConclusionSceneController eventConclusionSceneController = loader.getController();
        eventConclusionSceneController.setScene(eventOutCome);

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        String css = this.getClass().getResource("sample.css").toExternalForm();
        scene.getStylesheets().add(css);
        stage.show();
    }

    public void setScene() {
        setEvent();
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

    public void setEvent() {
        // Selects the event depending on the random integer value
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
        else if (x == 6) {
            System.out.println("Event 6 Selected");
            Event6 event = new Event6();
            event.makeArray();
            eventArr = event.getEventArray();
        }
        else if (x == 7) {
            System.out.println("Event 7 Selected");
            Event7 event = new Event7();
            event.makeArray();
            eventArr = event.getEventArray();
        }
        else if (x == 8) {
            System.out.println("Event 8 Selected");
            Event8 event = new Event8();
            event.makeArray();
            eventArr = event.getEventArray();
        }
        else if (x == 9) {
            System.out.println("Event 9 Selected");
            Event9 event = new Event9();
            event.makeArray();
            eventArr = event.getEventArray();
        }
        else if (x == 10) {
            System.out.println("Event 10 Selected");
            Event10 event = new Event10();
            event.makeArray();
            eventArr = event.getEventArray();
        }
        else if (x == 11) {
            System.out.println("Event 11 Selected");
            Event11 event = new Event11();
            event.makeArray();
            eventArr = event.getEventArray();
        }
        else if (x == 12) {
            System.out.println("Event 12 Selected");
            Event12 event = new Event12();
            event.makeArray();
            eventArr = event.getEventArray();
        }
        else if (x == 13) {
            System.out.println("Event 13 Selected");
            Event13 event = new Event13();
            event.makeArray();
            eventArr = event.getEventArray();
        }
        else if (x == 14) {
            System.out.println("Event 14 Selected");
            Event14 event = new Event14();
            event.makeArray();
            eventArr = event.getEventArray();
        }
    }

    public void computeResults(int choice) {
        // Computes the results of the choice by using String manipulation
        String[] strArr;
        if (choice == 1) {
            System.out.println(eventArr[6]);
            strArr = eventArr[6].split(" ", 4);
            System.out.println(Arrays.toString(strArr));
            eventOutCome[0] = eventArr[9];
            eventOutCome[1] = eventArr[10];
        }
        else if (choice == 2) {
            System.out.println(eventArr[7]);
            strArr = eventArr[7].split(" ", 4);
            System.out.println(Arrays.toString(strArr));
            eventOutCome[0] = eventArr[11];
            eventOutCome[1] = eventArr[12];
        }
        else {
            System.out.println(eventArr[8]);
            strArr = eventArr[8].split(" ", 4);
            System.out.println(Arrays.toString(strArr));
            eventOutCome[0] = eventArr[13];
            eventOutCome[1] = eventArr[14];
        }

        for (int i=0; i<3; i += 2) {
            switch (strArr[i+1]) {
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
