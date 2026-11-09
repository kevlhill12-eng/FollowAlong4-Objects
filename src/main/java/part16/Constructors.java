package part16;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=11407s
//        starts at about 3:10:07 — stop at about 3:19:32, when he says
//        "if you would like a copy of all this code"
// Guide: GUIDE.md in this folder, Video 1 — the same lesson, written out step by step
//
// Part 16, video 1 — constructors
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide).
//    His class with main is called Main. Yours is called Constructors.
//    Leave the "package part16;" line and the "public class Constructors" line alone.
//    He also has a second class called Human. YOU make that file too:
//    right-click the part16 folder -> New -> Java Class -> type Human -> Enter.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    in THIS file AND in Human.java, saying in YOUR OWN WORDS what that line does.

public class Constructors {
    public static void main(String[] args) {
        Human human = new Human("Kevin", 19, 160.5);
        // Creates a new Human object named "human" with the name "Kevin", age 19, and weight 160.5

        Human human2 = new Human("Morty", 17, 140.6);
        // Creates a second Human object named "human2" with the name "Morty", age 17, and weight 140.6

        System.out.println(human.name);
        // Prints the value of the 'name' field for the first human object ("Kevin") to the console

        System.out.println(human2.name);
        // Prints the value of the 'name' field for the second human object ("Morty") to the console

        human2.eat();
        // Invokes the 'eat()' method instance behavior on the 'human2' object

        human.drink();
        // Invokes the 'drink()' method instance behavior on the 'human' object

    }
}
