package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class ContinueTrailController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    String eventOutCome;
    int choice;

    String[] eventArr = new String[11];

    @FXML
    Label eventTitleLabel, eventDescriptionLabel, option1Label, option2Label, option3Label;

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
        //String css = this.getClass().getResource("sample.css").toExternalForm();
        //scene.getStylesheets().add(css);
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
        //String css = this.getClass().getResource("sample.css").toExternalForm();
        //scene.getStylesheets().add(css);
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
        //String css = this.getClass().getResource("sample.css").toExternalForm();
        //scene.getStylesheets().add(css);
        stage.show();
    }

    public void setLabels() {
        setUpEvent();
        //System.out.println("Setting labels");
        eventTitleLabel.setText(eventArr[0]);
        eventDescriptionLabel.setText(eventArr[1]);
        option1Label.setText(eventArr[2]);
        option2Label.setText(eventArr[3]);
        option3Label.setText(eventArr[4]);
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
            System.out.println(eventArr[5]);
            strArr = eventArr[5].split(" ", 4);
            System.out.println(Arrays.toString(strArr));
            eventOutCome = eventArr[8];

        } else if (choice == 2) {
            //System.out.println("You picked 2");
            System.out.println(eventArr[6]);
            strArr = eventArr[6].split(" ", 4);
            System.out.println(Arrays.toString(strArr));
            eventOutCome = eventArr[9];

        } else {
            //System.out.println("You picked 3");
            System.out.println(eventArr[7]);
            strArr = eventArr[7].split(" ", 4);
            System.out.println(Arrays.toString(strArr));
            eventOutCome = eventArr[10];

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
