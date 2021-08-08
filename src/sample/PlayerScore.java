package sample;

public class PlayerScore {
    static int totalScore = 0;
    static String playerDifficulty = "Banker";

    public static void setScore(int updatedScore) {
        totalScore = updatedScore;
    }

    public static int getScore() {
        return totalScore;
    }

    public void printScore() {
        System.out.println(totalScore);
    }

    public static void setDifficulty(String updatedDifficulty) {
        playerDifficulty = updatedDifficulty;
    }

    public static String getDifficulty() {
        return playerDifficulty;
    }

    public void printDifficulty() {
        System.out.println(playerDifficulty);
    }
}
