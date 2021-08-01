package sample;

public class Event {

    String[] eventArr = new String[12];
    String eventTitle = "Wild Wolves";
    String eventDescription = "While traveling, a pack of wild wolves prowl on your wagon, threatening you and your travelers.";
    String choice1 = "1. Toss a piece of meat at the pack of wolves to distract them [-5 Food]";
    String choice2 = "2. Grab your trusty handgun and shoot at the wild animals [-5 Ammo]";
    String choice3 = "3. Whip the oxen and try to make a quick escape";

    String choice1Result = "-5 food 0 food";
    String choice2Result = "-5 ammo 0 food";
    String choice3Result = "-1 oxen 0 food";

    String choice1Conclusion = "The distraction works, the wolves leave for the chunk of meat, your wagon continues on its way. [-5 Food]";
    String choice2Conclusion = "You shoot at the closest wolf, killing it. The other wolves scatter away. [-5 Ammo]";
    String choice3Conclusion = "The wolves attack one of your oxen injuring it greatly. You decide you leave that ox behind and escape while the wolves are busy eating it. [-1 Oxen]";

    String imageURL = "/img/event1.png";

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
        eventArr[11] = imageURL;
    }

    public String[] getEventArray() {
        return eventArr;
    }
}

class Event2 {

    String[] eventArr = new String[12];
    String eventTitle = "River";
    String eventDescription = "Your wagon comes across a large river. There's a few options on how to traverse the river.";
    String choice1 = "1. Better be safe than sorry. You pay for a ferry across the river [-50 Money]";
    String choice2 = "2. You decide to float your wagon across";
    String choice3 = "3. You decide to travel you wagon and oxen through the water";

    String choice1Result = "-50 money 0 food";
    String choice2Result = "-2 clothes 0 food";
    String choice3Result = "-1 settler 0 food";

    String choice1Conclusion = "You safely cross the river [-50 Money]";
    String choice2Conclusion = "During the crossing your wagon turns sideways and you lose some supplies. [-2 clothes]";
    String choice3Conclusion = "The force of the river was too strong. A settler falls and gets washed down the river. [-1 settler]";

    String imageURL = "/img/event2.png";


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
        eventArr[11] = imageURL;

    }

    public String[] getEventArray() {
        return eventArr;
    }

}

class Event3 {

    String[] eventArr = new String[12];

    String eventTitle = "Shiny";
    String eventDescription = "While taking a break, you find some shade and sit down. You spot a reflection coming from the sand";
    String choice1 = "Grab a shovel from the wagon to dig at the spot";
    String choice2 = "Dig with your hands at the spot";
    String choice3 = "Ignore it";

    String choice1Result = "0 food 0 food";
    String choice2Result = "+50 money 0 food";
    String choice3Result = "0 food 0 food";

    String choice1Conclusion = "After grabbing a shovel, you try to find the reflection again, but cannot find it.";
    String choice2Conclusion = "After digging a little, you find a nugget of gold ore! [+50 Money]";
    String choice3Conclusion = "You continue on the trail.";

    String imageURL = "/img/event3.png";


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
        eventArr[11] = imageURL;

    }

    public String[] getEventArray() {
        return eventArr;
    }
}

class Event4 {

    String[] eventArr = new String[12];

    String eventTitle = "Owl";
    String eventDescription = "While sleeping, the hooting of an owl wakes you up. You take a look outside the wagon.";
    String choice1 = "Scare the owl using your handgun";
    String choice2 = "Hunt for the owl";
    String choice3 = "Go back to sleep";

    String choice1Result = "-3 ammo 0 food";
    String choice2Result = "+5 food 0 food";
    String choice3Result = "-2 food 0 food";

    String choice1Conclusion = "Annoyed by the owl, you shoot three rounds into the sky. The owl flies away. You sleeping peacefully. [-3 Ammo]";
    String choice2Conclusion = "You try to hunt for the owl. You carefully approach the owl and capture it. [+5 Food]";
    String choice3Conclusion = "You wake to see that the owl ate some food from the food sack somehow [-2 Food]";

    String imageURL = "/img/event4.png";


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
        eventArr[11] = imageURL;

    }

    public String[] getEventArray() {
        return eventArr;
    }
}

class Event5 {

    String[] eventArr = new String[12];

    String eventTitle = "Trader";
    String eventDescription = "You come up to another wagon. They are willing to trade!";
    String choice1 = "[+10 Food for -2 Clothes]";
    String choice2 = "[+2 Clothes for -10 Ammo]";
    String choice3 = "Don't trade";

    String choice1Result = "+10 food -2 clothes";
    String choice2Result = "+2 clothes -10 ammo";
    String choice3Result = "0 food 0 food";

    String choice1Conclusion = "[+10 Food for -2 Clothes]";
    String choice2Conclusion = "[+2 Clothes for -10 Ammo]";
    String choice3Conclusion = "You do not trade and continue moving";

    String imageURL = "/img/event5.png";


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
        eventArr[11] = imageURL;

    }

    public String[] getEventArray() {
        return eventArr;
    }
}

class Event6 {

    String[] eventArr = new String[12];

    String eventTitle = "Hunt";
    String eventDescription = "It's time to do some hunting!";
    String choice1 = "Go for the big game [-10 Ammo]";
    String choice2 = "Go for the small game [-5 Ammo]";
    String choice3 = "Don't hunt";

    String choice1Result = "-10 ammo +20 food";
    String choice2Result = "-5 ammo +10 food";
    String choice3Result = "0 food 0 food";

    String choice1Conclusion = "You hunt down a big animal! [-10 Ammo] [+20 Food]";
    String choice2Conclusion = "You hunt down for a small animal! [-5 Ammo] [+10 Food]";
    String choice3Conclusion = "You continue on the trail";

    String imageURL = "/img/wolves.png";


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
        eventArr[11] = imageURL;

    }

    public String[] getEventArray() {
        return eventArr;
    }
}

class Event7 {

    String[] eventArr = new String[11];

    String eventTitle = "";
    String eventDescription = "";
    String choice1 = "";
    String choice2 = "";
    String choice3 = "";

    String choice1Result = "";
    String choice2Result = "";
    String choice3Result = "";

    String choice1Conclusion = "";
    String choice2Conclusion = "";
    String choice3Conclusion = "";

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

class Event8 {

    String[] eventArr = new String[11];

    String eventTitle = "";
    String eventDescription = "";
    String choice1 = "";
    String choice2 = "";
    String choice3 = "";

    String choice1Result = "";
    String choice2Result = "";
    String choice3Result = "";

    String choice1Conclusion = "";
    String choice2Conclusion = "";
    String choice3Conclusion = "";

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

class Event9 {

    String[] eventArr = new String[11];

    String eventTitle = "";
    String eventDescription = "";
    String choice1 = "";
    String choice2 = "";
    String choice3 = "";

    String choice1Result = "";
    String choice2Result = "";
    String choice3Result = "";

    String choice1Conclusion = "";
    String choice2Conclusion = "";
    String choice3Conclusion = "";

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

class Event10 {

    String[] eventArr = new String[11];

    String eventTitle = "";
    String eventDescription = "";
    String choice1 = "";
    String choice2 = "";
    String choice3 = "";

    String choice1Result = "";
    String choice2Result = "";
    String choice3Result = "";

    String choice1Conclusion = "";
    String choice2Conclusion = "";
    String choice3Conclusion = "";

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


