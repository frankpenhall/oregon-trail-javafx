package sample;

public class Event {

    String[] eventArr = new String[16];

    String eventTitle = "Wild Wolves";
    String eventDescription = "While traveling, a pack of wild wolves prowl on your wagon,";
    String eventDescription2 = "threatening you and your travelers.";
    String choice1 = "1. Toss a piece of meat at the wolves to distract them [-3 Food]";
    String choice2 = "2. Grab your handgun and shoot at the wild wolves [-3 Ammo]";
    String choice3 = "3. Whip the oxen and try to make a quick escape";

    String choice1Result = "-3 food 0 food";
    String choice2Result = "-3 ammo 0 food";
    String choice3Result = "-1 oxen 0 food";

    String choice1Conclusion = "The distraction works, the wolves leave for the chunk of meat,";
    String choice1Conclusion2 = "your wagon continues on its way. [-3 Food]";
    String choice2Conclusion = "You shoot at the closest wolf, killing it.";
    String choice2Conclusion2 = "The other wolves scatter away. [-3 Ammo]";
    String choice3Conclusion = "The wolves attack one of your oxen injuring it greatly.";
    String choice3Conclusion2 = "You decide to escape and leave the ox behind. [-1 oxen]";

    String imageURL = "/img/event1.png";

    public void makeArray() {
        eventArr[0] = eventTitle;
        eventArr[1] = eventDescription;
        eventArr[2] = eventDescription2;
        eventArr[3] = choice1;
        eventArr[4] = choice2;
        eventArr[5] = choice3;
        eventArr[6] = choice1Result;
        eventArr[7] = choice2Result;
        eventArr[8] = choice3Result;
        eventArr[9] = choice1Conclusion;
        eventArr[10] = choice1Conclusion2;
        eventArr[11] = choice2Conclusion;
        eventArr[12] = choice2Conclusion2;
        eventArr[13] = choice3Conclusion;
        eventArr[14] = choice3Conclusion2;
        eventArr[15] = imageURL;
    }

    public String[] getEventArray() {
        return eventArr;
    }
}

class Event2 {

    String[] eventArr = new String[16];

    String eventTitle = "River";
    String eventDescription = "Your wagon comes across a large river. There's a few";
    String eventDescription2 = "options on how to traverse the river";
    String choice1 = "1. You pay for a ferry across the river [-50 Money]";
    String choice2 = "2. You decide to float your wagon across";
    String choice3 = "3. You decide to travel you wagon and oxen through the water";

    String choice1Result = "-50 money 0 food";
    String choice2Result = "-2 ammo 0 food";
    String choice3Result = "-1 settler 0 food";

    String choice1Conclusion = "You safely cross the river [-50 Money]";
    String choice1Conclusion2 = "";
    String choice2Conclusion = "During the crossing your wagon turns sideways";
    String choice2Conclusion2 = "and you lose some supplies. [-2 ammo]";
    String choice3Conclusion = "The force of the river was too strong. A settler falls";
    String choice3Conclusion2 = "and gets washed down the river. [-1 settler]";

    String imageURL = "/img/event2.png";


    public void makeArray() {
        eventArr[0] = eventTitle;
        eventArr[1] = eventDescription;
        eventArr[2] = eventDescription2;
        eventArr[3] = choice1;
        eventArr[4] = choice2;
        eventArr[5] = choice3;
        eventArr[6] = choice1Result;
        eventArr[7] = choice2Result;
        eventArr[8] = choice3Result;
        eventArr[9] = choice1Conclusion;
        eventArr[10] = choice1Conclusion2;
        eventArr[11] = choice2Conclusion;
        eventArr[12] = choice2Conclusion2;
        eventArr[13] = choice3Conclusion;
        eventArr[14] = choice3Conclusion2;
        eventArr[15] = imageURL;

    }

    public String[] getEventArray() {
        return eventArr;
    }

}

class Event3 {

    String[] eventArr = new String[16];

    String eventTitle = "Shiny";
    String eventDescription = "While taking a break, you find some shade and sit down";
    String eventDescription2 = "You spot a reflection coming from the sand.";
    String choice1 = "1. Grab a shovel from the wagon to dig at the spot";
    String choice2 = "2. Dig with your hands at the spot";
    String choice3 = "3. Ignore it";

    String choice1Result = "0 food 0 food";
    String choice2Result = "+50 money 0 food";
    String choice3Result = "0 food 0 food";

    String choice1Conclusion = "After grabbing a shovel, you try to find the";
    String choice1Conclusion2 = "reflection again, but cannot find it.";
    String choice2Conclusion = "After digging a little, you find a nugget of gold ore! [+50 Money]";
    String choice2Conclusion2 = "";
    String choice3Conclusion = "You continue on the trail.";
    String choice3Conclusion2 = "";

    String imageURL = "/img/event3.png";


    public void makeArray() {
        eventArr[0] = eventTitle;
        eventArr[1] = eventDescription;
        eventArr[2] = eventDescription2;
        eventArr[3] = choice1;
        eventArr[4] = choice2;
        eventArr[5] = choice3;
        eventArr[6] = choice1Result;
        eventArr[7] = choice2Result;
        eventArr[8] = choice3Result;
        eventArr[9] = choice1Conclusion;
        eventArr[10] = choice1Conclusion2;
        eventArr[11] = choice2Conclusion;
        eventArr[12] = choice2Conclusion2;
        eventArr[13] = choice3Conclusion;
        eventArr[14] = choice3Conclusion2;
        eventArr[15] = imageURL;
    }

    public String[] getEventArray() {
        return eventArr;
    }
}

class Event4 {

    String[] eventArr = new String[16];

    String eventTitle = "Owl";
    String eventDescription = "While sleeping, the hooting of an owl wakes you up.";
    String eventDescription2 = " You take a look outside the wagon.";
    String choice1 = "1. Scare the owl using your handgun";
    String choice2 = "2. Hunt for the owl";
    String choice3 = "3. Go back to sleep";

    String choice1Result = "-3 ammo 0 food";
    String choice2Result = "+5 food 0 food";
    String choice3Result = "-2 food 0 food";

    String choice1Conclusion = "Annoyed by the owl, you shoot three rounds into the sky.";
    String choice1Conclusion2 = "The owl flies away. You sleep peacefully. [-3 Ammo] ";
    String choice2Conclusion = "You try to hunt for the owl. You carefully";
    String choice2Conclusion2 = "approach the owl and capture it. [+5 Food]";
    String choice3Conclusion = "You wake to see that the owl ate some food from";
    String choice3Conclusion2 = "the food sack somehow [-2 Food]";

    String imageURL = "/img/event4.png";


    public void makeArray() {
        eventArr[0] = eventTitle;
        eventArr[1] = eventDescription;
        eventArr[2] = eventDescription2;
        eventArr[3] = choice1;
        eventArr[4] = choice2;
        eventArr[5] = choice3;
        eventArr[6] = choice1Result;
        eventArr[7] = choice2Result;
        eventArr[8] = choice3Result;
        eventArr[9] = choice1Conclusion;
        eventArr[10] = choice1Conclusion2;
        eventArr[11] = choice2Conclusion;
        eventArr[12] = choice2Conclusion2;
        eventArr[13] = choice3Conclusion;
        eventArr[14] = choice3Conclusion2;
        eventArr[15] = imageURL;

    }

    public String[] getEventArray() {
        return eventArr;
    }
}

class Event5 {

    String[] eventArr = new String[16];

    String eventTitle = "Trader";
    String eventDescription = "You come up to another wagon. They are willing to trade!";
    String eventDescription2 = "";
    String choice1 = "1. [+5 Food for -2 Clothes]";
    String choice2 = "2. [+2 Clothes for -5 Ammo]";
    String choice3 = "3. Don't trade";

    String choice1Result = "+5 food -2 clothes";
    String choice2Result = "+2 clothes -5 ammo";
    String choice3Result = "0 food 0 food";

    String choice1Conclusion = "You trade [+5 Food for -2 Clothes]";
    String choice1Conclusion2 = "";
    String choice2Conclusion = "You trade[+2 Clothes for -5 Ammo]";
    String choice2Conclusion2 = "";
    String choice3Conclusion = "You do not trade and continue moving.";
    String choice3Conclusion2 = "";

    String imageURL = "/img/event5.png";


    public void makeArray() {
        eventArr[0] = eventTitle;
        eventArr[1] = eventDescription;
        eventArr[2] = eventDescription2;
        eventArr[3] = choice1;
        eventArr[4] = choice2;
        eventArr[5] = choice3;
        eventArr[6] = choice1Result;
        eventArr[7] = choice2Result;
        eventArr[8] = choice3Result;
        eventArr[9] = choice1Conclusion;
        eventArr[10] = choice1Conclusion2;
        eventArr[11] = choice2Conclusion;
        eventArr[12] = choice2Conclusion2;
        eventArr[13] = choice3Conclusion;
        eventArr[14] = choice3Conclusion2;
        eventArr[15] = imageURL;
    }
    public String[] getEventArray() {
        return eventArr;
    }
}

class Event6 {

    String[] eventArr = new String[16];

    String eventTitle = "Big Tree";
    String eventDescription = "While traveling on the trail, your wagon comes across a ";
    String eventDescription2 = "large tree. There are some apples high up in the tree";
    String choice1 = "1. Let the settlers climb up the tree";
    String choice2 = "2. Suggest not to climb, instead pick the low-hanging fruit";
    String choice3 = "3. Gather branches and sticks for crafting";

    String choice1Result = "-1 settler 0 food";
    String choice2Result = "+3 food 0 food";
    String choice3Result = "+2 spareParts 0 food";

    String choice1Conclusion = "A settler falls from the tree and breaks their leg.";
    String choice1Conclusion2 = "They perish from their injuries. [-1 settler]";
    String choice2Conclusion = "Everyone agrees to pick the low-hanging apples instead";
    String choice2Conclusion2 = "of climbing high up in the tree. [+3 Food]";
    String choice3Conclusion = "Everyone gathers branches and wood and a settler is";
    String choice3Conclusion2 = "able to craft them into useful supplies. [+2 Spare Parts]";

    String imageURL = "/img/event1.png";


    public void makeArray() {
        eventArr[0] = eventTitle;
        eventArr[1] = eventDescription;
        eventArr[2] = eventDescription2;
        eventArr[3] = choice1;
        eventArr[4] = choice2;
        eventArr[5] = choice3;
        eventArr[6] = choice1Result;
        eventArr[7] = choice2Result;
        eventArr[8] = choice3Result;
        eventArr[9] = choice1Conclusion;
        eventArr[10] = choice1Conclusion2;
        eventArr[11] = choice2Conclusion;
        eventArr[12] = choice2Conclusion2;
        eventArr[13] = choice3Conclusion;
        eventArr[14] = choice3Conclusion2;
        eventArr[15] = imageURL;

    }

    public String[] getEventArray() {
        return eventArr;
    }
}

class Event7 {

    String[] eventArr = new String[16];

    String eventTitle = "Tired Ox";
    String eventDescription = "You noticed one of your oxen is sluggish and seems to be";
    String eventDescription2 = "worn-out. They are starting to slow the wagon down.";
    String choice1 = "1. Put down the ox, you could use the ox's meat anyways";
    String choice2 = "2. Let the ox go";
    String choice3 = "3. Give the ox extra food to give it more energy";

    String choice1Result = "+4 food -1 oxen";
    String choice2Result = "-1 oxen 0 food";
    String choice3Result = "-3 food 0 food";

    String choice1Conclusion = "You put down the tired ox, and butcher it for meat.";
    String choice1Conclusion2 = "[+4 Food] [-1 Oxen]";
    String choice2Conclusion = "You let the ox go free [-1 Oxen]";
    String choice2Conclusion2 = "";
    String choice3Conclusion = "The ox eats the extra food and seems to be doing";
    String choice3Conclusion2 = "better and able to keep up. [-3 Food]";

    String imageURL = "/img/event1.png";


    public void makeArray() {
        eventArr[0] = eventTitle;
        eventArr[1] = eventDescription;
        eventArr[2] = eventDescription2;
        eventArr[3] = choice1;
        eventArr[4] = choice2;
        eventArr[5] = choice3;
        eventArr[6] = choice1Result;
        eventArr[7] = choice2Result;
        eventArr[8] = choice3Result;
        eventArr[9] = choice1Conclusion;
        eventArr[10] = choice1Conclusion2;
        eventArr[11] = choice2Conclusion;
        eventArr[12] = choice2Conclusion2;
        eventArr[13] = choice3Conclusion;
        eventArr[14] = choice3Conclusion2;
        eventArr[15] = imageURL;

    }

    public String[] getEventArray() {
        return eventArr;
    }
}

class Event8 {

    String[] eventArr = new String[16];

    String eventTitle = "Rocky Trail";
    String eventDescription = "The wagon comes across a portion of the trail that seems";
    String eventDescription2 = "to get rocky. The sharp rocks could damage the wheels.";
    String choice1 = "1. Go through the rocks quickly";
    String choice2 = "2. Go off the trail to get around the rocky section.";
    String choice3 = "3. Go through the rocks slowly";

    String choice1Result = "-2 spareParts 0 food";
    String choice2Result = "-1 oxen 0 food";
    String choice3Result = "-1 spareParts 0 food";

    String choice1Conclusion = "While speeding through the rocks, two of your wheels break";
    String choice1Conclusion2 = "and had to be replaced. [-2 Spare Parts]";
    String choice2Conclusion = "While traveling off the trail, the wagon comes across a bear.";
    String choice2Conclusion2 = "The bear attacks an ox. [-1 Oxen]";
    String choice3Conclusion = "While carefully going through the rocks, one of your wheels";
    String choice3Conclusion2 = "breaks and had to be replaced [-1 Spare Parts]";

    String imageURL = "/img/event1.png";

    public void makeArray() {
        eventArr[0] = eventTitle;
        eventArr[1] = eventDescription;
        eventArr[2] = eventDescription2;
        eventArr[3] = choice1;
        eventArr[4] = choice2;
        eventArr[5] = choice3;
        eventArr[6] = choice1Result;
        eventArr[7] = choice2Result;
        eventArr[8] = choice3Result;
        eventArr[9] = choice1Conclusion;
        eventArr[10] = choice1Conclusion2;
        eventArr[11] = choice2Conclusion;
        eventArr[12] = choice2Conclusion2;
        eventArr[13] = choice3Conclusion;
        eventArr[14] = choice3Conclusion2;
        eventArr[15] = imageURL;
    }

    public String[] getEventArray() {
        return eventArr;
    }
}

class Event9 {

    String[] eventArr = new String[16];

    String eventTitle = "Waterfall";
    String eventDescription = "The wagon comes across a beautiful waterfall however,";
    String eventDescription2 = "there seems to be something in the water.";
    String choice1 = "1. Swim close to the shore";
    String choice2 = "2. Avoid swimming in the water";
    String choice3 = "3. Swim down and investigate";

    String choice1Result = "0 food 0 food";
    String choice2Result = "0 food 0 food";
    String choice3Result = "+40 money 0 food";

    String choice1Conclusion = "You enjoy the cool water with the other settlers.";
    String choice1Conclusion2 = "";
    String choice2Conclusion = "The other settlers enjoy the water while you sit";
    String choice2Conclusion2 = "in the shade.";
    String choice3Conclusion = "While swimming down, you find a chest with valuable";
    String choice3Conclusion2 = "gold and jewelry. [+40 Money]";

    String imageURL = "/img/event1.png";

    public void makeArray() {
        eventArr[0] = eventTitle;
        eventArr[1] = eventDescription;
        eventArr[2] = eventDescription2;
        eventArr[3] = choice1;
        eventArr[4] = choice2;
        eventArr[5] = choice3;
        eventArr[6] = choice1Result;
        eventArr[7] = choice2Result;
        eventArr[8] = choice3Result;
        eventArr[9] = choice1Conclusion;
        eventArr[10] = choice1Conclusion2;
        eventArr[11] = choice2Conclusion;
        eventArr[12] = choice2Conclusion2;
        eventArr[13] = choice3Conclusion;
        eventArr[14] = choice3Conclusion2;
        eventArr[15] = imageURL;
    }

    public String[] getEventArray() {
        return eventArr;
    }
}

class Event10 {

    String[] eventArr = new String[16];

    String eventTitle = "Trader";
    String eventDescription = "You come up to another wagon. They are willing to trade!";
    String eventDescription2 = "";
    String choice1 = "1. [+10 Ammo for -5 Food]";
    String choice2 = "2. [+10 Ammo for -2 Clothes]";
    String choice3 = "3. Don't trade";

    String choice1Result = "+10 ammo -5 food";
    String choice2Result = "+10 ammo -2 clothes";
    String choice3Result = "0 food 0 food";

    String choice1Conclusion = "You trade [+10 Ammo for -5 Food]";
    String choice1Conclusion2 = "";
    String choice2Conclusion = "You trade [+10 Ammo for -2 Clothes]";
    String choice2Conclusion2 = "";
    String choice3Conclusion = "You do not trade and keep moving.";
    String choice3Conclusion2 = "";


    String imageURL = "/img/event5.png";

    public void makeArray() {
        eventArr[0] = eventTitle;
        eventArr[1] = eventDescription;
        eventArr[2] = eventDescription2;
        eventArr[3] = choice1;
        eventArr[4] = choice2;
        eventArr[5] = choice3;
        eventArr[6] = choice1Result;
        eventArr[7] = choice2Result;
        eventArr[8] = choice3Result;
        eventArr[9] = choice1Conclusion;
        eventArr[10] = choice1Conclusion2;
        eventArr[11] = choice2Conclusion;
        eventArr[12] = choice2Conclusion2;
        eventArr[13] = choice3Conclusion;
        eventArr[14] = choice3Conclusion2;
        eventArr[15] = imageURL;
    }

    public String[] getEventArray() {
        return eventArr;
    }
}

class Event11 {

    String[] eventArr = new String[16];

    String eventTitle = "Drifter";
    String eventDescription = "While traveling on the trail, you come across a sole";
    String eventDescription2 = "traveler. He asks for some food.";
    String choice1 = "1. Offer him to join you on your journey";
    String choice2 = "2. Wish him luck and continue moving";
    String choice3 = "3. Ofer him some food";

    String choice1Result = "+1 settler";
    String choice2Result = "";
    String choice3Result = "-4 food +10 ammo";

    String choice1Conclusion = "The drifter gladly accepts the invitation and";
    String choice1Conclusion2 = "joins your wagon. [+1 Settler]";
    String choice2Conclusion = "You feel bad about leaving the traveler but you";
    String choice2Conclusion2 = "cannot afford to help him.";
    String choice3Conclusion = "The drifter is grateful, in return he gives his";
    String choice3Conclusion2 = "extra ammo to you. [-4 Food] [+10 Ammo]";


    String imageURL = "/img/event5.png";

    public void makeArray() {
        eventArr[0] = eventTitle;
        eventArr[1] = eventDescription;
        eventArr[2] = eventDescription2;
        eventArr[3] = choice1;
        eventArr[4] = choice2;
        eventArr[5] = choice3;
        eventArr[6] = choice1Result;
        eventArr[7] = choice2Result;
        eventArr[8] = choice3Result;
        eventArr[9] = choice1Conclusion;
        eventArr[10] = choice1Conclusion2;
        eventArr[11] = choice2Conclusion;
        eventArr[12] = choice2Conclusion2;
        eventArr[13] = choice3Conclusion;
        eventArr[14] = choice3Conclusion2;
        eventArr[15] = imageURL;
    }

    public String[] getEventArray() {
        return eventArr;
    }
}

class Event12 {

    String[] eventArr = new String[16];

    String eventTitle = "Thunderstorm";
    String eventDescription = "You hear a thunderstorm brewing. It is almost nighttime.";
    String eventDescription2 = "Where do you camp for the night?";
    String choice1 = "1. At a clearing in the field";
    String choice2 = "2. Underneath a large tree";
    String choice3 = "3. Near a large pond";

    String choice1Result = "";
    String choice2Result = "-1 oxen";
    String choice3Result = "-1 settler";

    String choice1Conclusion = "Everyone sleeps safely throughout the thunderstorm.";
    String choice1Conclusion2 = "";
    String choice2Conclusion = "During the night the large tree gets shocked by lightning.";
    String choice2Conclusion2 = "The next morning you see that an ox has perished. [-1 Oxen]";
    String choice3Conclusion = "Camping near the water wasn't the best idea. During the";
    String choice3Conclusion2 = "night a settler gets shocked by lightning. [-1 Settler]";


    String imageURL = "/img/event5.png";

    public void makeArray() {
        eventArr[0] = eventTitle;
        eventArr[1] = eventDescription;
        eventArr[2] = eventDescription2;
        eventArr[3] = choice1;
        eventArr[4] = choice2;
        eventArr[5] = choice3;
        eventArr[6] = choice1Result;
        eventArr[7] = choice2Result;
        eventArr[8] = choice3Result;
        eventArr[9] = choice1Conclusion;
        eventArr[10] = choice1Conclusion2;
        eventArr[11] = choice2Conclusion;
        eventArr[12] = choice2Conclusion2;
        eventArr[13] = choice3Conclusion;
        eventArr[14] = choice3Conclusion2;
        eventArr[15] = imageURL;
    }

    public String[] getEventArray() {
        return eventArr;
    }
}

class Event13 {

    String[] eventArr = new String[16];

    String eventTitle = "Wild Berries";
    String eventDescription = "Some settlers come back from foraging in the forest.";
    String eventDescription2 = "They show several types of berries they found.";
    String choice1 = "1. Keep the pink berries";
    String choice2 = "2. Keep the red berries";
    String choice3 = "3. Keep the purple berries";

    String choice1Result = "+3 food 0 food";
    String choice2Result = "-1 settler 0 food";
    String choice3Result = "+3 food 0 food";

    String choice1Conclusion = "Turns out that the pink berries were safe to eat.";
    String choice1Conclusion2 = "[+3 Food]";
    String choice2Conclusion = "Turns out that the red berries were poisonous.";
    String choice2Conclusion2 = "After eating some a settler perishes [-1 Settler]";
    String choice3Conclusion = "Turns out that the purple berries were safe to eat.";
    String choice3Conclusion2 = "[+3 Food]";


    String imageURL = "/img/event5.png";

    public void makeArray() {
        eventArr[0] = eventTitle;
        eventArr[1] = eventDescription;
        eventArr[2] = eventDescription2;
        eventArr[3] = choice1;
        eventArr[4] = choice2;
        eventArr[5] = choice3;
        eventArr[6] = choice1Result;
        eventArr[7] = choice2Result;
        eventArr[8] = choice3Result;
        eventArr[9] = choice1Conclusion;
        eventArr[10] = choice1Conclusion2;
        eventArr[11] = choice2Conclusion;
        eventArr[12] = choice2Conclusion2;
        eventArr[13] = choice3Conclusion;
        eventArr[14] = choice3Conclusion2;
        eventArr[15] = imageURL;
    }

    public String[] getEventArray() {
        return eventArr;
    }
}

class Event14 {

    String[] eventArr = new String[16];

    String eventTitle = "Bandits";
    String eventDescription = "";
    String eventDescription2 = "";
    String choice1 = "1. ";
    String choice2 = "2. ";
    String choice3 = "3. ";

    String choice1Result = "";
    String choice2Result = "";
    String choice3Result = "";

    String choice1Conclusion = "";
    String choice1Conclusion2 = "";
    String choice2Conclusion = "";
    String choice2Conclusion2 = "";
    String choice3Conclusion = "";
    String choice3Conclusion2 = "";


    String imageURL = "/img/event5.png";

    public void makeArray() {
        eventArr[0] = eventTitle;
        eventArr[1] = eventDescription;
        eventArr[2] = eventDescription2;
        eventArr[3] = choice1;
        eventArr[4] = choice2;
        eventArr[5] = choice3;
        eventArr[6] = choice1Result;
        eventArr[7] = choice2Result;
        eventArr[8] = choice3Result;
        eventArr[9] = choice1Conclusion;
        eventArr[10] = choice1Conclusion2;
        eventArr[11] = choice2Conclusion;
        eventArr[12] = choice2Conclusion2;
        eventArr[13] = choice3Conclusion;
        eventArr[14] = choice3Conclusion2;
        eventArr[15] = imageURL;
    }

    public String[] getEventArray() {
        return eventArr;
    }
}
class Event15 {

    String[] eventArr = new String[16];

    String eventTitle = "";
    String eventDescription = "";
    String eventDescription2 = "";
    String choice1 = "1. ";
    String choice2 = "2. ";
    String choice3 = "3. ";

    String choice1Result = "";
    String choice2Result = "";
    String choice3Result = "";

    String choice1Conclusion = "";
    String choice1Conclusion2 = "";
    String choice2Conclusion = "";
    String choice2Conclusion2 = "";
    String choice3Conclusion = "";
    String choice3Conclusion2 = "";


    String imageURL = "/img/event5.png";

    public void makeArray() {
        eventArr[0] = eventTitle;
        eventArr[1] = eventDescription;
        eventArr[2] = eventDescription2;
        eventArr[3] = choice1;
        eventArr[4] = choice2;
        eventArr[5] = choice3;
        eventArr[6] = choice1Result;
        eventArr[7] = choice2Result;
        eventArr[8] = choice3Result;
        eventArr[9] = choice1Conclusion;
        eventArr[10] = choice1Conclusion2;
        eventArr[11] = choice2Conclusion;
        eventArr[12] = choice2Conclusion2;
        eventArr[13] = choice3Conclusion;
        eventArr[14] = choice3Conclusion2;
        eventArr[15] = imageURL;
    }

    public String[] getEventArray() {
        return eventArr;
    }
}





