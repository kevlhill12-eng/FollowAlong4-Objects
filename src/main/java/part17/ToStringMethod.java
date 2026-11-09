package part17;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=12741s
//        starts at about 3:32:20 — stop at about 3:38:30, at "that's how the toString method works"
// Guide: GUIDE.md in this folder, steps 8–12
//
// Part 17, topic 2 — the toString method
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called ToStringMethod.
//    Leave the "package part17;" line and the class line alone. Type everything else yourself.
//    You also make a new class called Car. The README shows how.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. Do this in Car.java too.

public class ToStringMethod {
    public static void main(String[] args) {
        Car car = new Car();
        // Instantiates a new Car object using the default constructor

        System.out.println(car.make);
        // Prints the 'make' instance variable of the car object ("Ford") to the console

        System.out.println(car.model);
        // Prints the 'model' instance variable of the car object ("Mustang") to the console

        System.out.println(car.color);
        // Prints the 'color' instance variable of the car object ("red") to the console

        System.out.println(car.year);
        // Prints the 'year' instance variable of the car object (2021) to the console

        System.out.println(car);
        // Implicitly calls car.toString() and prints the returned multi-line string representation of the object

        System.out.println(car.toString());
        // Explicitly calls the toString() method on the car object and prints the returned multi-line string

        System.out.println(car.toString());
        // Explicitly calls the toString() method again and prints the returned multi-line string

        System.out.println(car);
        // Implicitly calls car.toString() again and prints the returned multi-line string representation of the object
    }
}
