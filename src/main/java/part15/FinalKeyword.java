package part15;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=10635s
//        starts at about 2:57:15 — stop at about 2:59:12, when he says
//        "if you would like a copy of this code"
// Guide: GUIDE.md in this folder, Video 1 — the same lesson, written out step by step
//
// Part 15, video 1 — the final keyword
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called FinalKeyword.
//    Leave the "package part15;" line and the "public class FinalKeyword" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class FinalKeyword {
    // Declares a public class named FinalKeyword
    public static void main(String[] args) {
        // Declares the main method, which serves as the entry point of the Java application
        final double PI = 3.14159;
        // Declares a constant double variable named 'PI' using the final keyword, initializing it to 3.14159 (making its value immutable)


        // Prints the value of the constant 'PI' to the console
        System.out.println(PI);
    }
}