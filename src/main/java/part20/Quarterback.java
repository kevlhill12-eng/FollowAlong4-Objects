package part20;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo
//        (no video in this part — it is a checkpoint. Use it to look things up)

// Part 20 — CHECKPOINT. No video, no guide.
//
// You write this whole class yourself, starting from an empty file.
// The README lists everything a Quarterback needs, one step at a time.
// Main.java uses it, so you can run Main to check your work.
//
// Leave the "package part20;" line alone.
// Under these comments, type the class: public class Quarterback { ... }
//
// When it works, put a // comment ABOVE every line of code, in YOUR OWN WORDS (Section B).
class Quarterback{
    String name;
    int armStrength;
    int attempts;
    int completions;
    int passingYards;
    Quarterback (String name, int armStrength){
        this.name = name;
        this.armStrength = armStrength;
    }
    public boolean throwTo(Receiver target, int yards){
        attempts++;
        if (yards > armStrength){
            System.out.println(name + " --> " + target.getName() + ", " + yards +": INCOMPLETE");
            return false;
        } else{
            System.out.println(name + " --> " + target.getName() + ", " + yards +": CAUGHT");
            target.catchBall(yards);

            passingYards += yards;
            completions++;
        }
        return true;
    }
    public boolean throwTo(Receiver target){
        return throwTo( target, 10);
    }
    public String getName(){
        return name;

    }
    public int getAttempts(){
        return attempts;
    }
    public int getCompletions(){
        return completions;
    }
    public int getPassingYards(){
        return passingYards;
    }

    public int completionPercentage(){
        if(attempts == 0){
            return 0;
        } else {

        }
        return (int) ((double) completions / attempts * 100);
    }
    public String toString(){
        System.out.println(name + ": " + completions + "/" + attempts + ", " + passingYards + " yards, "
        + completionPercentage()+ "%");
        return " ";
    }


}