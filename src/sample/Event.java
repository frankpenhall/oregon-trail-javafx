package sample;

public class Event {

    String[] eventArr = new String[11];
    String eventTitle = "Wild Wolves";
    String eventDescription = "While traveling, a pack of wild wolves prowl on your wagon, threatening you and your travelers.";
    String choice1 = "1. Distract: Get its attention and toss a piece of meat in its direction [-10 Food]";
    String choice2 = "2. Kill: Grab your trusty handgun and shoot at the wild animals [-5 Ammo]";
    String choice3 = "3. Escape: You whip the oxens and try to make a quick escape";

    String choice1Result = "-3 food";
    String choice2Result = "-5 ammo";
    String choice3Result = "-1 oxen";

    String choice1Conclusion = "The distraction works, the wolves leave for the chunk of meat, your wagon continues on its way.";
    String choice2Conclusion = "You shoot at the closest wolf, killing it. The other wolves scatter away.";
    String choice3Conclusion = "The wolves attack one of your oxens injuring it greatly. You decide you leave that oxen behind and escape while the wolves are busy eating it. ";

    public void makeArray() {
        eventArr[0] = eventTitle;
        eventArr[1] = eventDescription;
        eventArr[2] = choice1;
        eventArr[3] = choice2;
        eventArr[4] = choice3;
        eventArr[5] = choice1Result;
        eventArr[6] = choice2Result;
        eventArr[7] = choice3Result;
        eventArr[8] = choice1Conclusion;
        eventArr[9] = choice2Conclusion;
        eventArr[10] = choice3Conclusion;
    }

    public String[] getEventArray() {
        return eventArr;
    }
}

class Event2 {

    String[] eventArr = new String[11];
    String eventTitle = "River";
    String eventDescription = "You come across a large river. It looks shallow enough that you think you could trench through it with your wagon. There is also a ferry service available if you want to be more careful.";
    String choice1 = "1. Ferry: Better be safe than sorry. You pay for a ferry across the river [-100 Money]";
    String choice2 = "2. Wagon: You decide to travel you wagon and oxens through the river.";
    String choice3 = "3. [Insert Option 3]";

    String choice1Result = "-100 money";
    String choice2Result = "-2 clothes";
    String choice3Result = "-1 settler";

    String choice1Conclusion = "You safely cross the river";
    String choice2Conclusion = "The force of the river was too strong. Your wagon turns sideways and you lose some clothes";
    String choice3Conclusion = "You loss a settler tragically";

    public void makeArray() {
        eventArr[0] = eventTitle;
        eventArr[1] = eventDescription;
        eventArr[2] = choice1;
        eventArr[3] = choice2;
        eventArr[4] = choice3;
        eventArr[5] = choice1Result;
        eventArr[6] = choice2Result;
        eventArr[7] = choice3Result;
        eventArr[8] = choice1Conclusion;
        eventArr[9] = choice2Conclusion;
        eventArr[10] = choice3Conclusion;
    }

    public String[] getEventArray() {
        return eventArr;
    }

}


