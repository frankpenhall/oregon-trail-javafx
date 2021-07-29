package sample;

public class Money {

    static int totalMoney = 1200;

    public static void setMoney(int updatedMoney) {
        totalMoney = updatedMoney;
    }

    public static int getMoney() {
        return totalMoney;
    }

    public void printMoney() {
        System.out.println(totalMoney);
    }
}
