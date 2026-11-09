package part17;

public class Car {
    String make = "Ford";
    // Declares and initializes a String instance variable for the car's make ("Ford")

    String model = "Mustang";
    // Declares and initializes a String instance variable for the car's model ("Mustang")

    String color = "red";
    // Declares and initializes a String instance variable for the car's color ("red")


    int year = 2021;
    // Declares and initializes an integer instance variable for the car's manufacturing year (2021)

    Car(String make, String model, String color, int year){
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;

    }
    Car(){

    }

    public String toString() {
        // Overrides Java's default toString() method to provide a custom string representation of the Car object

        String myString = make + "\n" + model + "\n" + color + "\n" + year;
        // Concatenates the car's attributes together into a single String, separated by newline characters (\n)

        return myString;
        // Returns the formatted multi-line String representation of the car object

    }
}
