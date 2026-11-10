package part18;

public class Garage {
    void park (Car car){
        // Defines a method named 'park' that accepts a Car object as a parameter and returns nothing (void)

        System.out.println("The " + car.name + " is parked in the garage");
        // Prints a message to the console concatenating the 'name' property of the passed Car object into the text string
    }
}
