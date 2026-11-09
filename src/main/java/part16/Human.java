package part16;

public class Human {
    String name; // Declares a String instance variable to store the human's name
    int age; // Declares an integer instance variable to store the human's age
    double weight; // Declares a double instance variable to store the human's weight

    Human (String name, int age, double weight){ // Constructor method used to initialize a new Human object with specific values

        this.name = name; // Assigns the passed name parameter to this object's name field
        this.age = age; // Assigns the passed age parameter to this object's age field
        this.weight = weight; // Assigns the passed weight parameter to this object's weight field
    }

    void eat (){ // Defines an instance method named 'eat' that does not return a value
        System.out.println(this.name + " is eating"); // Prints a message to the console stating that the current human is eating
    }

    void drink (){ // Defines an instance method named 'drink' that does not return a value
        System.out.println(this.name + " is drinking"); // Prints a message to the console stating that the current human is drinking
    }
}
