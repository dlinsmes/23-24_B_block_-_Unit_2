import java.util.Scanner;

public class WhileLoops {
    public static void main(String [] args) {

        //variable scope - where the variable can be accessed
        //since a is declared in main(), it can be used at any point
        //in main() after its declaration
        int a = 2;
        if (a < 5) {
            a = 20;
            //b is declared in the if-statement, so it only exists
            //within the if-statement
            int b = 10;
            System.out.println(b);
        }
        System.out.println(a);
        //b doesn't exist outside of the if-statement it was declared in
        //System.out.println(b);

        //can declare a variable without initializing value
        String word;
        if (a > 5)
            word = "something";
        else
            word = "something else";

        //loops allow code to run repeatedly

        System.out.println();

        //while loops are condition-based
        //-like repeating if-statements
        int x = 0;
        //the condition checks to decide whether the loop runs again
        //-once the condition is no longer true, the loop stops
        while (x < 5) {
            System.out.println(x);

            //increase x by 1, same as x += 1, same as x = x + 1
            x++;
        }

        //when x is 4, the last iteration of the loop will complete,
        //then x will increment to 5. at that point the loop condition
        //is no longer true
        System.out.println("final value of x: " + x);

        System.out.println();

        x = 0;
        //the condition is never true to begin with,
        // so it never enters the loop
        while (x > 5) {
            System.out.println("x");
            x++;
        }
        System.out.println("loop ended");

        //infinite loop - BAD

//        while (x < 5) {
//            System.out.println(x);
//            //IMPORTANT - make sure the condition for the loop
//            //eventually becomes false, otherwise you get an infinite loop
//            //-the (termination) condition is never reached when
//            //in an infinite loop
//        }
//        //code after a loop won't run until the loop has ended
//        System.out.println("inifinite loop ended");

        //while loops are good for when you don;t know how many
        //times code needs to run, but the limit is based on a
        //condition

        int count = 1;

        System.out.println("enter quit to stop");

        Scanner s = new Scanner(System.in);
        String input;

//        String input = s.nextLine();
//        //when the user types something besides quit, keep looping
//        //the prompt
//        while (!input.equals("quit")) {
//            System.out.println("enter quit to stop");
//            input = s.nextLine();
//
//            //increment the count each time the prompt is re-asked
//            count++;
//        }
//
//        System.out.println("the prompt was printed " + count + " times");
//
//        System.out.println("please enter a number: 1, 2, or 3: ");
//        int num = s.nextInt();
//        //validation loop - keep asking until the user enters a valid input
//
//        //for the loop condition, check whether the input is INVALID to go into the loop
//        //(num != 1 && num != 2 && num != 3)
//        // !(num >= 1 && num <= 3)
//        while (num < 1 || num > 3) {
//            System.out.println("invalid number");
//            System.out.println("please enter a number: 1, 2, or 3: ");
//            num = s.nextInt();
//        }
//
//        System.out.println("good job");
//
//        s.nextLine();

        System.out.println("enter yes");
        input = s.nextLine();
        //while(true) will always run
        //BAD - deductions if you use while(true)/break
        while (true) {
            if (input.equals("yes")) {
                break; //break will stop a loop
            }
            else {
                System.out.println("invalid. try again");
                System.out.println("enter yes");
                input = s.nextLine();
            }

        }

        //cane simplified to:

        System.out.println("enter yes");
        input = s.nextLine();
        while(!input.equals("yes")) {
            System.out.println("invalid. try again");
            System.out.println("enter yes");
            input = s.nextLine();
        }


    }
}
