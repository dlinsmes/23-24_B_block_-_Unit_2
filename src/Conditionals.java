import java.util.Scanner;

public class Conditionals {
    public static void main(String [] args) {

        //simulate flipping a coin
        // then print out the result of heads or tails

        //[1, 2]
        int random = (int)(Math.random()*2) + 1;

        //1 is heads
        //2 is tails

        //conditional statement aka if-statement
        //checks if the boolean expression is true - if it is, it runs
        //the code inside the { }
        if (random == 1) {
            System.out.println("heads");
        }

        //the else clause runs when the if-condition is false
        else {
            System.out.println("tails");
        }

        //else is optional - if it's not there, nothing will run
        // when the condition is false


        //get input for 3 numbers
        //then output the biggest number of the 3

        //s is just a variable name - call your scanner what you want
        Scanner s = new Scanner(System.in);

        System.out.println("enter 3 numbers: ");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        int max = 0;
        if (a > b && a > c) {
            max = a;
        }
        if (b > a && b > c) {
            max = b;
        }
        if (c > a && c > b) {
            max = c;
        }
        System.out.println("the biggest number is " + max);


        if (a > b && a > c) {
            max = a;
        }

        //these two if statements both run and can both be true
        //the one at the top is inconsequential bc max gets set by the
        //if-else that follow

        if (b > a && b > c) {
            max = b;
        }
        //else only runs according to the IF that comes immediately before it
        else {
            max = c;
        }
        System.out.println("the biggest number is " + max);



        if (a > b && a > c) {
            max = a;
        }
        //else if allows for multiple possibilities, where only the first
        //condition that's true will trigger code to run. No other
        //conditions will check (even if they're true)
        //-if a is the biggest number, b won't be checked
        else if (b > a && b > c)
            max = b;
            //if the code inside any branch is only one line, { } not needed

        //max = 100; can't have other code between any if-else if-else branches
        else {
            max = c;
        }
        System.out.println("the biggest number is " + max);

        s.nextLine();

        //have the user enter a password and give ONE piece of feedback
        // for whether it's correct, has 0 length, has the correct length,
        // or is incorrect

        String realPW = "iLUVbagls";
        System.out.println("enter your password");
        String userPW = s.nextLine();


        //only the first condition that's true will have its code
        //triggered - no other conditions afterward will check
        if(userPW.equals(realPW)) {
            System.out.println("wow good job so proud of you A+ v smart");
        }
        //A string's length is how many characters it has
        else if (userPW.length() == 0) {
            System.out.println("you didn't type anything dumdum");
        }
        else if (userPW.length() == realPW.length()) {
            System.out.println("nice try but WRONG");
        }
        else {
            System.out.println("NOPE");
        }

        //user inputs a number that's between 10 and 20
        //output feedback for within range, too low, too high
        System.out.println("enter a number between 10 and 20");
        a = s.nextInt();

        if (a > 10) {
            //conditionals can be nested - the inner if statement
            //won't run if the outer condition is false
            if (a > 20) {
                System.out.println("too high");
            }
            else {
                System.out.println("within range");
            }
        }
        //look at indentation and { } to figure out where to place
        //else statements
        else {
            System.out.println("too low");
        }






    }

}
