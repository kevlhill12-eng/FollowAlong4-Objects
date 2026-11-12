package part20;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo
//        (no video in this part — it is a checkpoint. Use it to look things up)

// Part 20 — CHECKPOINT. You do NOT write this file. It checks the classes you write.
//
// Every step is switched off with comments, so this file still runs before you start.
// When you finish a step in Receiver.java or Quarterback.java, switch that step ON:
//
//   1. In main(), delete the // in front of that step's line, like  // step1();
//   2. Further down, delete the /* above that step's method and the */ below it.
//
// Then run Main with the green ▶ next to main, and compare with the README.

public class Main {
// Declares the public class named Main, which serves as the entry point container.

    public static void main(String[] args) {
        // Defines the main execution method where Java applications start running.

        System.out.println("=== Part 20 checkpoint ===");
        // Prints the header text indicating the start of the Part 20 checkpoint tests.
        step1();
        // Calls the step1 method to test the Receiver class basic functionality.
        step2();
        // Calls the step2 method to test catching balls and toString in Receiver.
        step3();
        // Calls the step3 method to test the Quarterback class fields, constructor, and getters.
        step4();
        // Calls the step4 method to test throwing passes to different Receivers.
        step5();
        // Calls the step5 method to test completion percentage and toString in Quarterback.
        step6();
        // Calls the step6 method to test the overloaded throwTo method in Quarterback.
    }
    // Closes the main method block.

    static void header(String title) {
        // Defines a helper static method to print section headers with a given title string.
        System.out.println();
        // Prints an empty line to visually separate different test steps in the console output.
        System.out.println("=== " + title + " ===");
        // Prints the formatted header title surrounded by separator equal signs.
    }
    // Closes the header method block.

    // Step 1 — Receiver: fields, constructor, getters
    // Section comment explaining that Step 1 tests Receiver fields, constructor, and getters.

    static void step1() {
        // Defines the static method for testing Step 1.
        header("Step 1");
        // Calls the header method to print the "Step 1" section title.
        Receiver davis = new Receiver("Davis", 11);
        // Instantiates a new Receiver object named davis with name "Davis" and jersey number 11.
        System.out.println(davis.getName() + " wears #" + davis.getNumber());
        // Prints the receiver's name and jersey number using getter methods.
        System.out.println("catches: " + davis.getCatches());
        // Prints the initial number of catches made by the receiver using getCatches.
        System.out.println("yards: " + davis.getYards());
        // Prints the initial receiving yards accumulated using getYards.
    }
    // Closes the step1 method block.

    // Step 2 — Receiver: catchBall and toString
    // Section comment explaining that Step 2 tests catchBall method and toString formatting.

    static void step2() {
        // Defines the static method for testing Step 2.
        header("Step 2");
        // Calls the header method to print the "Step 2" section title.
        Receiver davis = new Receiver("Davis", 11);
        // Instantiates a new Receiver object named davis with name "Davis" and number 11.
        davis.catchBall(12);
        // Simulates catching a ball for 12 yards, updating catches and yards.
        davis.catchBall(8);
        // Simulates catching another ball for 8 yards, updating total catches and yards.
        System.out.println(davis);
        // Implicitly calls toString on davis to print the receiver's updated statistics.
    }
    // Closes the step2 method block.


    // Step 3 — Quarterback: fields, constructor, getters
    // Section comment explaining that Step 3 tests Quarterback fields, constructor, and getters.

    static void step3() {
        // Defines the static method for testing Step 3.
        header("Step 3");
        // Calls the header method to print the "Step 3" section title.
        Quarterback carter = new Quarterback("Carter", 40);
        // Instantiates a new Quarterback object named carter with name "Carter" and number 40.
        System.out.println(carter.getName() + " has thrown " + carter.getAttempts() + " passes");
        // Prints the quarterback's name and total pass attempts using getter methods.
        System.out.println(carter.getCompletions() + " completions, " + carter.getPassingYards() + " yards");
        // Prints total completions and passing yards using getter methods.
    }
    // Closes the step3 method block.


    // Step 4 — Quarterback: throwTo(Receiver, int)
    // Section comment explaining that Step 4 tests throwing passes with specific yardage to receivers.

    static void step4() {
        // Defines the static method for testing Step 4.
        header("Step 4");
        // Calls the header method to print the "Step 4" section title.
        Quarterback carter = new Quarterback("Carter", 40);
        // Instantiates a Quarterback object named carter.
        Receiver davis = new Receiver("Davis", 11);
        // Instantiates a Receiver object named davis.
        Receiver brooks = new Receiver("Brooks", 84);
        // Instantiates a Receiver object named brooks.

        carter.throwTo(davis, 15);
        // Quarterback carter throws a 15-yard completion to davis.
        carter.throwTo(brooks, 25);
        // Quarterback carter throws a 25-yard completion to brooks.
        carter.throwTo(davis, 50);
        // Quarterback carter throws a 50-yard completion to davis.

        System.out.println(davis);
        // Prints the final stats for receiver davis via toString.
        System.out.println(brooks);
        // Prints the final stats for receiver brooks via toString.
    }
    // Closes the step4 method block.


    // Step 5 — Quarterback: completionPercentage and toString
    // Section comment explaining that Step 5 tests completion percentage calculation and toString.

    static void step5() {
        // Defines the static method for testing Step 5.
        header("Step 5");
        // Calls the header method to print the "Step 5" section title.
        Quarterback carter = new Quarterback("Carter", 40);
        // Instantiates a Quarterback object named carter.
        Receiver davis = new Receiver("Davis", 11);
        // Instantiates a Receiver object named davis.

        carter.throwTo(davis, 15);
        // Quarterback carter throws a 15-yard completion to davis.
        carter.throwTo(davis, 25);
        // Quarterback carter throws a 25-yard completion to davis.
        carter.throwTo(davis, 50);
        // Quarterback carter throws a 50-yard completion to davis.

        System.out.println(carter);
        // Prints the quarterback's stats including completion percentage via toString.
    }
    // Closes the step5 method block.


    // Step 6 — Quarterback: overloaded throwTo(Receiver)
    // Section comment explaining that Step 6 tests the overloaded throwTo method with no yardage argument (incomplete pass).

    static void step6() {
        // Defines the static method for testing Step 6.
        header("Step 6");
        // Calls the header method to print the "Step 6" section title.
        Quarterback carter = new Quarterback("Carter", 40);
        // Instantiates a Quarterback object named carter.
        Receiver brooks = new Receiver("Brooks", 84);
        // Instantiates a Receiver object named brooks.

        carter.throwTo(brooks);
        // Quarterback carter throws an incomplete pass to brooks using the overloaded method.
        carter.throwTo(brooks, 30);
        // Quarterback carter throws a 30-yard completion to brooks.

        System.out.println(brooks);
        // Prints the final stats for receiver brooks via toString.
    }
    // Closes the step6 method block.


}
// Closes the Main class block.


