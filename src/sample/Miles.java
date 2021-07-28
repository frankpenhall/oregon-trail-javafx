package sample;

public class Miles {

    static int totalMiles = 0;

    public static void setTotalMiles(int updatedMiles) {
        totalMiles = updatedMiles;
    }

    public static int getTotalMiles() {
        return totalMiles;
    }

    public void printTotalMiles() {
        System.out.println(totalMiles);
    }
}
