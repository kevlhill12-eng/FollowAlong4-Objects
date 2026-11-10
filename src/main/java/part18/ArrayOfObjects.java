package part18;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=13121s
//        starts at about 3:38:40 — stop at about 3:44:15, at "that's the basics of arrays of objects"
// Guide: GUIDE.md in this folder, steps 1–6
//
// Part 18, topic 1 — an array of objects
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called ArrayOfObjects.
//    Leave the "package part18;" line and the class line alone. Type everything else yourself.
//    You also make a new class called Food. The README shows how.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. Do this in Food.java too.

public class ArrayOfObjects {
    public static void main(String[] args) {
        int [] numbers = new int [3];
        // Declares and instantiates an integer array with a fixed size of 3 (default values are 0)

        char [] letters = new char [3];
        // Declares and instantiates a character array with a fixed size of 3 (default values are empty chars)

        String[] words = new String [3];
        // Declares and instantiates a String array with a fixed size of 3 (default values are null)

        Food[] refrigerator = new Food[3];
        // Declares and instantiates an array capable of holding 3 Food objects (initially all slots are null)

        Food food1 = new Food("pizza");
        // Instantiates a new Food object named 'food1' with the name property set to "pizza"

        Food food2 = new Food("hamburger");
        // Instantiates a new Food object named 'food2' with the name property set to "hamburger"

        Food food3 = new Food("hot dog");
        // Instantiates a new Food object named 'food3' with the name property set to "hot dog"

        refrigerator[0] = food1;
        // Assigns the 'food1' object reference to the first slot (index 0) of the refrigerator array

        refrigerator[1] = food2;
        // Assigns the 'food2' object reference to the second slot (index 1) of the refrigerator array

        refrigerator[2] = food3;
        // Assigns the 'food3' object reference to the third slot (index 2) of the refrigerator array

        System.out.println(refrigerator[0].name);
        // Accesses the Food object at index 0 of the array and prints its 'name' instance variable ("pizza")

        System.out.println(refrigerator[1].name);
        // Accesses the Food object at index 1 of the array and prints its 'name' instance variable ("hamburger")

        System.out.println(refrigerator[2].name);
        // Accesses the Food object at index 2 of the array and prints its 'name' instance variable ("hot dog")

    }
}
