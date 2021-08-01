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

public class GeneralStoreController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    private int ammoCount, clothesCount, foodCount, oxenCount, sparePartsCount;
    private int ammoInv, clothesInv, foodInv, oxenInv, sparePartsInv;
    private int totalCost;

    @FXML
    Label ammoInvLabel, clothesInvLabel, foodInvLabel, oxenInvLabel, sparePartsInvLabel, totalCostLabel, moneyLabel;
    @FXML
    Label ammoCountLabel, clothesCountLabel, foodCountLabel, oxenCountLabel, sparePartsCountLabel;

    int[] playerInventory = Inventory.getInventory();

    int playerMoney = Money.getMoney();

    public void setLabels() {
        foodInvLabel.setText(String.valueOf(playerInventory[0]));
        oxenInvLabel.setText(String.valueOf(playerInventory[1]));
        ammoInvLabel.setText(String.valueOf(playerInventory[2]));
        clothesInvLabel.setText(String.valueOf(playerInventory[3]));
        sparePartsInvLabel.setText(String.valueOf(playerInventory[4]));
        moneyLabel.setText(String.valueOf(playerMoney));
    }

    public void purchaseSupplies() {
        if (playerMoney < totalCost) {
            System.out.println("Not enough money");
        }
        else {
            playerMoney -= totalCost;

            System.out.println(playerMoney);
            Money.setMoney(playerMoney);

            foodInv += foodCount;
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

        setLabels();

        Inventory.setInventory(playerInventory);
        Inventory.printInventory();
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

    public void switchToVisit(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("visitSettlement.fxml"));
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

    public void switchToVisit2(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("visitSettlement2.fxml"));
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

}
