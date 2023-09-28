import java.util.Scanner;

public class ForLoops {
    public static void main(String [] args) {
        //wu
        //keep asking the user to enter a number until they enter a
        //multiple of 7
        Scanner s = new Scanner(System.in);
//        System.out.println("enter a number");
//        int num = s.nextInt();
//        //continue as long as the input is not a mult of 7
//        while (num % 7 != 0) {
//            System.out.println("enter a number");
//            num = s.nextInt();
//        }
//        System.out.println(num + " is a multiple of 7");

//        //alternate solution:
//        boolean isMult = false;
//        //same as while (isMult == false)
//        while (!isMult) {
//            System.out.println("enter a number");
//            int num = s.nextInt();
//            if (num % 7 == 0 ) {
//                isMult = true;
//            }
//        }

        //while loops - condition-based - run until the condition becomes false
        //for loops - iteration based - run a certain number of times

        //initialization - int i = 0 - starting value of variable
        //condition - i < 10 - run until the condition is false
        //advancement - i++ - change the value of the variable
        for(int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        //before an iteration (turn) of the loop, the condition is checked
        //to decide whether to run the looped code
        //at the end of each iteration, apply the advancement step

        //9 is the last value printed bc when i increments to 10, the
        //condition becomes false

        //the variable scope of i is within the loop - it only exists in the loop
        //System.out.println(i);

        //this means you can have consecutive loops that all use var i

        System.out.println();

        //advancement step adds 2 instead of 1 to i
        //-changes the number of iterations
        for (int i = 0; i < 10; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println();

        //can set up for loops to decrement (count down)
        for (int i = 20; i >= 15; i--) {
            System.out.print(i + " ");
        }

        System.out.println();

        //for loops can be rewritten as while loops
        int x = 20;
        while (x >= 15) {
            System.out.print(x + " ");

            //important - advancement step goes at end for while loops
            x--;
        }

        //while loops can't always be rewritten as for loops bc you don't
        //always know how many times it needs to iterate
        //ex - keep asking the user for numbers until they enter a mult of 7

        System.out.println();

        //ask the user for 3 numbers using a loop
        //then print the sum of numbers
        //(don't need to re-output the user's numbers at end)

        //declare sum var before loop so that it can add up a cumulative sum
        //-if declared inside loop, the value will keep resetting during each
        //iteration
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("enter a number");
            int num = s.nextInt();
            sum += num;
        }
        System.out.println("the sum of numbers is " + sum);

        //ask the user what num they want multiples of
        //and also how many multiples to print
        //ex: 3 then 5
        //out: 3, 6, 9, 12, 15
        System.out.println("what number do you want multiples of?");
        int mult = s.nextInt();
        System.out.println("how many mults do you want?");
        int quantity = s.nextInt();

        for (int i = 1; i <= quantity; i++) {
            int multiple = mult*i;
            System.out.print(multiple + " ");
        }

        System.out.println();


        for (int i = 0; i < quantity; i++) {
            System.out.print(mult*(i+1) + " ");
        }

        System.out.println();

        for(int i = mult; i <= (mult*quantity); i+=mult) {
            System.out.print(i + " ");
        }

        System.out.println();

        //prompt for a prime number
        //then check and output whether it's really prime
        System.out.println("enter a prime number: ");
        int userNum = s.nextInt();

        boolean isPrime = true;

        //a number is prime if it's divisible only by itself and 1
        for (int i = 2; i < userNum; i++) {

            //if the number is divisible by any value of i, it's not prime
            if (userNum % i == 0) {
                isPrime = false;
            }
            //no else bc once a number is proven to NOT be prime, it can't be
            //re-proven to be prime
        }
        //same as if (isPrime == true)
        if (isPrime) {
            System.out.println("prime number");
        }
        else
            System.out.println("not prime");
    }
}
