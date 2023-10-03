public class NestedLoops {
    public static void main(String [] args) {

        int count = 0;

        //nested loops - put loops inside of other loops
        for (int i = 0; i < 5; i++) {

            //IMPORTANT - use a different variable for an inner loop
            for (int j = 0; j < 10; j++) {
                count++; //will run 50 times

                //hi should print 50 times - 5 * 10
                System.out.println(count + " hi - i is " + i + ", j is " + j);
            }

            //for every value of i, the j loop starts over and runs to completion

        }


        //nested loops can be used to print 2d grids
        //outer loops controls how many rows there are
        for (int i = 0; i < 4; i++) {

            System.out.print("Row " + i + ": ");

            //inner loop controls the quantity of elements per row
            for (int j = 0; j < 8; j++) {
                //use print() in the inner loop for the row
                System.out.print('x');
            }

            //use println() after the inner loop to make a line break
            //for the next row
            System.out.println();
        }


        for (int i = 0; i < 10; i++) {

            //inner loop (quantity of numbers per row) depends on the i value
            //which changes as the outer loop iterates
            for (int j = 0; j < i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();

        //same but i counts down from 10 to 1 instead of counting up
        for (int i = 10; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        for (int i = 0; i < 10; i++) {

//            for (int j =)

        }
    }
}
