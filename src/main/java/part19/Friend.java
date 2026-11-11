package part19;

public class Friend {


    static int numberOfFriends;
    static String newestFriend;
    //saying this value exist any time in the program

        String name;
        // making a variable called name
        Friend(String name){
            // a constructor setting the class as name
            this.name = name;
            // saying to use this value name
            numberOfFriends++;
            // adding one friend per successful loop
            newestFriend = name;

        }

        static void displayFriends(){
            //new constructor with an empty parameter
        System.out.println("You have " + numberOfFriends + " friends");
        // printing out method
    }





}
