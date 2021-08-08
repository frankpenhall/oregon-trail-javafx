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

public class ShopSceneController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    private int ammoCount, clothesCount, foodCount, oxenCount, sparePartsCount;
    private int ammoInv, clothesInv, foodInv, oxenInv, sparePartsInv;
    private int totalCost;

    Inventory inventory = new Inventory();
    int[] playerInventory = inventory.getInventory();

    Money money = new Money();
    int playerMoney = money.getMoney();

    Settler settlers = new Settler();
    int playerSettlers = settlers.getSettlers();

    @FXML
    Label ammoInvLabel, clothesInvLabel, foodInvLabel, oxenInvLabel, sparePartsInvLabel, totalCostLabel, moneyLabel;
    @FXML
    Label ammoCountLabel, clothesCountLabel, foodCountLabel, oxenCountLabel, sparePartsCountLabel;

    public void switchToPickSettler(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("pickSettlerScene.fxml"));
        try {
            root = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
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

    public void setScene() {
        foodInvLabel.setText(String.valueOf(playerInventory[0]));
        oxenInvLabel.setText(String.valueOf(playerInventory[1]));
        ammoInvLabel.setText(String.valueOf(playerInventory[2]));
        clothesInvLabel.setText(String.valueOf(playerInventory[3]));
        sparePartsInvLabel.setText(String.valueOf(playerInventory[4]));
        moneyLabel.setText(String.valueOf(playerMoney));
    }

    public void purchaseSupplies(ActionEvent event) {
        if (playerMoney < totalCost) { // checks if the player has enough money to make purchase
            System.out.println("Not enough money");
        }
        else {
            playerMoney -= totalCost; // subtract money from cost


            System.out.println(playerMoney);
            money.setMoney(playerMoney); // set new amount of money left

            foodInv += foodCount; // change food inventory depending on the amount of food selected from purchase
            foodCountLabel.setText("0");
            foodCount = 0;

            oxenInv += oxenCount;
            oxenCountLabel.setText("0");
            oxenCount = 0;

            ammoInv += ammoCount;
            ammoCountLabel.setText("0");
            ammoCount = 0;

            clothesInv += clothesCount;
            clothesCountLabel.setText("0");
            clothesCount = 0;

            sparePartsInv += sparePartsCount;
            sparePartsCountLabel.setText("0");
            sparePartsCount = 0;

            totalCostLabel.setText("0");
            totalCost = 0;

            playerInventory[0] += foodInv;
            playerInventory[1] += oxenInv;
            playerInventory[2] += ammoInv;
            playerInventory[3] += clothesInv;
            playerInventory[4] += sparePartsInv;
            playerInventory[5] = 5;
        }

        setScene(); // refresh the labels

        inventory.setInventory(playerInventory);
        inventory.printInventory();
    }

    public void incrementFood(ActionEvent event) {
        foodCount++;
        foodCountLabel.setText(String.valueOf(foodCount));
        totalCost += 2;
        totalCostLabel.setText(String.valueOf(totalCost));
    }

    public void decrementFood(ActionEvent event) {
        if(foodCount > 0) {
            foodCount--;
            foodCountLabel.setText(String.valueOf(foodCount));
            totalCost -= 2;
            totalCostLabel.setText(String.valueOf(totalCost));
        }
    }

    public void incrementOxen(ActionEvent event) {
        oxenCount++;
        oxenCountLabel.setText(String.valueOf(oxenCount));
        totalCost += 50;
        totalCostLabel.setText(String.valueOf(totalCost));
    }

    public void decrementOxen(ActionEvent event) {
        if(oxenCount > 0) {
            oxenCount--;
            oxenCountLabel.setText(String.valueOf(oxenCount));
            totalCost -= 50;
            totalCostLabel.setText(String.valueOf(totalCost));
        }
    }

    public void incrementClothes(ActionEvent event) {
        clothesCount++;
        clothesCountLabel.setText(String.valueOf(clothesCount));
        totalCost += 10;
        totalCostLabel.setText(String.valueOf(totalCost));
    }

    public void decrementClothes(ActionEvent event) {
        if (clothesCount > 0) {
            clothesCount--;
            clothesCountLabel.setText(String.valueOf(clothesCount));
            totalCost -= 10;
            totalCostLabel.setText(String.valueOf(totalCost));
        }
    }

    public void incrementAmmo(ActionEvent event) {
        ammoCount++;
        ammoCountLabel.setText(String.valueOf(ammoCount));
        totalCost += 2;
        totalCostLabel.setText(String.valueOf(totalCost));
    }

    public void decrementAmmo(ActionEvent event) {
        if (ammoCount > 0) {
            ammoCount--;
            ammoCountLabel.setText(String.valueOf(ammoCount));
            totalCost -= 2;
            totalCostLabel.setText(String.valueOf(totalCost));
        }
    }

    public void incrementSpareParts(ActionEvent event) {
        sparePartsCount++;
        sparePartsCountLabel.setText(String.valueOf(sparePartsCount));
        totalCost += 15;
        totalCostLabel.setText(String.valueOf(totalCost));
    }

    public void decrementSpareParts(ActionEvent event) {
        if (sparePartsCount > 0) {
            sparePartsCount--;
            sparePartsCountLabel.setText(String.valueOf(sparePartsCount));
            totalCost -= 15;
            totalCostLabel.setText(String.valueOf(totalCost));
        }
    }

}
