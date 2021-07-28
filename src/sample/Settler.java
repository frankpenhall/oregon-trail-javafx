package sample;

public class Settler {

    static int totalSettlers = 5;

    public static void setSettlers(int updatedSettlers) {
        totalSettlers = updatedSettlers;
    }

    public static int getSettlers() {
        return totalSettlers;
    }

    public void printSettlers() {
        System.out.println(totalSettlers);
    }
}
