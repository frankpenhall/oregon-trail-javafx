package sample;

public class Inventory {

    static int[] inventory = new int[6];

    public static void setInventory(int[] updatedInventory) {
        inventory = updatedInventory;
    }

    public static int[] getInventory() {
        return inventory;
    }

    public void printInventory() {
        for(int i = 0; i < 5; i++){
            System.out.println(inventory[i]);
        }
    }
}
