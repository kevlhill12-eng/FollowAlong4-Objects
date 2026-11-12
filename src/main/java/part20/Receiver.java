package part20;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo
//        (no video in this part — it is a checkpoint. Use it to look things up)

// Part 20 — CHECKPOINT. No video, no guide.
//
// You write this whole class yourself, starting from an empty file.
// The README lists everything a Receiver needs, one step at a time.
// Main.java uses it, so you can run Main to check your work.
//
// Leave the "package part20;" line alone.
// Under these comments, type the class: public class Receiver { ... }
//
// When it works, put a // comment ABOVE every line of code, in YOUR OWN WORDS (Section B).
public class Receiver {
// Declares the public class named Receiver to model a football wide receiver.

    String name;
    // Declares an instance variable to store the receiver's name.
    int n;
    // Declares an instance variable to store the receiver's jersey number.
    int catches;
    // Declares an instance variable to track the total number of catches made.
    int yards;
    // Declares an instance variable to track the total receiving yards accumulated.

    Receiver(String name, int n) {
        // Defines the constructor for the Receiver class, accepting a name and jersey number.
        this.name = name;
        // Assigns the passed name parameter to the instance variable.
        this.n = n;
        // Assigns the passed jersey number parameter to the instance variable.
    }
    // Closes the constructor block.

    public String getName() {
        // Defines a getter method to retrieve the receiver's name.
        return name;
        // Returns the stored name value.
    }
    // Closes the getName method block.

    public int getNumber() {
        // Defines a getter method to retrieve the receiver's jersey number.
        return n;
        // Returns the stored jersey number value.
    }
    // Closes the getNumber method block.

    public int getCatches() {
        // Defines a getter method to retrieve the total number of catches.
        return catches;
        // Returns the stored catches count.
    }
    // Closes the getCatches method block.

    public int getYards() {
        // Defines a getter method to retrieve the total receiving yards.
        return yards;
        // Returns the accumulated yardage.
    }
    // Closes the getYards method block.

    public void catchBall(int gain) {
        // Defines a method to update statistics when a ball is caught with a given yardage gain.
        catches++;
        // Increments the catch counter by 1.
        yards += gain;
        // Adds the yardage gain amount to the total receiving yards.
    }
    // Closes the catchBall method block.

    public String toString() {
        // Defines the toString method to return a formatted string representation of the receiver.
        String myString = "#" + n + " " + name + ": " + catches + " catches, " + yards + " yards";
        // Builds the formatted string containing the number, name, catches, and yards.
        return myString;
        // Returns the constructed summary string.
    }
    // Closes the toString method block.
}
// Closes the Receiver class block.


