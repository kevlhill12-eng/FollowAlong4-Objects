package part16;
import java.util.Random;

public class DiceRoller {

    Random random; // Declares a global/instance variable of type Random (starts as null)
    int number; // Declares a global/instance variable of type int (starts as 0)

    DiceRoller (){ // Constructor method called when a new DiceRoller object is instantiated
        Random random = new Random();
        // BUG/SHADOWING: Declares a NEW local variable named 'random' (shadowing the global one), leaving the global 'random' variable uninitialized (null)

        int number = 0;
        // Declares a NEW local variable named 'number' (shadowing the global one) and sets it to 0

        roll();
        // Calls the roll() method, which will throw a NullPointerException because the global 'random' variable was never initialized
    }

    void roll (){ // Defines an instance method named 'roll'
        number = random.nextInt(6)+1;
        // Attempts to use the global 'random' instance variable to generate a random number, but it is null (causing a crash) and assigns it to the global 'number' variable

        System.out.println(number);
        // Prints the rolled number to the console
    }
}
