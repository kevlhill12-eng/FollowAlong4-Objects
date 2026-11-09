package part17;

public class Pizza {
    String bread; // Declares a String instance variable to store the pizza's bread type
    String sauce; // Declares a String instance variable to store the pizza's sauce type
    String cheese; // Declares a String instance variable to store the pizza's cheese type
    String topping; // Declares a String instance variable to store the pizza's topping

    Pizza (String bread, String sauce, String cheese, String topping) {
        // Overloaded constructor that takes four arguments to initialize bread, sauce, cheese, and topping
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;
    }

    Pizza(String bread, String sauce, String cheese) {
        // Overloaded constructor that takes three arguments to initialize bread, sauce, and cheese
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
    }

    Pizza(String bread, String sauce) {
        // Overloaded constructor that takes two arguments to initialize bread and sauce
        this.bread = bread;
        this.sauce = sauce;
    }

    Pizza(String bread) {
        // Overloaded constructor that takes a single argument to initialize only the bread
        this.bread = bread;
    }

    Pizza() {
        // No-argument (default) constructor that creates a Pizza object without initializing any fields
    }
}
