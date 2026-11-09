package part17;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=12340s
//        starts at about 3:25:40 — stop at about 3:32:05, before "the toString method"
// Guide: GUIDE.md in this folder, steps 1–7
//
// Part 17, topic 1 — overloaded constructors
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called OverloadedConstructors.
//    Leave the "package part17;" line and the class line alone. Type everything else yourself.
//    You also make a new class called Pizza. The README shows how.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. Do this in Pizza.java too.

public class OverloadedConstructors {
    public static void main(String[] args) {
        Pizza pizza = new Pizza("thick crust", "tomato", "mozzarella");
        // Instantiates a new Pizza object using an overloaded constructor that accepts three arguments: bread, sauce, and cheese

        System.out.println("Here are the ingredients of your pizza: ");
        // Prints a header message to the console introducing the pizza ingredients

        System.out.println(pizza.bread);
        // Prints the 'bread' instance variable of the pizza object ("thick crust") to the console

        System.out.println(pizza.sauce);
        // Prints the 'sauce' instance variable of the pizza object ("tomato") to the console

        System.out.println(pizza.cheese);
        // Prints the 'cheese' instance variable of the pizza object ("mozzarella") to the console

        System.out.println(pizza.topping);
        // Prints the 'topping' instance variable of the pizza object (which will be null or uninitialized since it wasn't passed to this constructor) to the console
    }
}
