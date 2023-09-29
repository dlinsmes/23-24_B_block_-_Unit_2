import java.util.Scanner;

public class LoopPractice {
    public static void main(String [] args) {

        //wu
        //prompt the user for 5 numbers,
        // then output the biggest and smallest numbers

        Scanner s = new Scanner(System.in);

        int biggest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < 5; i++) {
            System.out.println("enter a number");
            int num = s.nextInt();
            if (num > biggest) {
                biggest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        System.out.println("your smallest number is " + smallest);
        System.out.println("your biggest number is " + biggest);

        System.out.println();

        //the largest possible number an int can hold
        System.out.println(Integer.MAX_VALUE);

        //if you try to go beyond the range of [MIN, MAX]
        //unexpected values will be used
        System.out.println(Integer.MAX_VALUE + 10);

        //the smallest possible number an int can hold
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Integer.MAX_VALUE + 1);


        System.out.println(Integer.MIN_VALUE - 100);

    }
}
