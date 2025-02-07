public class Basic {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Programming");

        // add, subtract, multiply
        int x = 10;
        int y = 20;
        System.out.println("Sum: " + (x+y));
        System.out.println("Sub: " + (x-y));
        System.out.println("Multiply: " + (x*y));


        //array
        int[] numerical = {0,1,2,3,4,5,6,7,8,9};
        System.out.println(numerical.length);
        System.out.println(numerical[0]);

        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.println("Using for loop");
        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i]);
        }

        System.out.println("Using for each loop");
        for (String str: days) {
            System.out.println(str);
        }

        // multiplication table 10 by 10.
        for (int i = 1; i <= 10; i++){
            System.out.println("Multiplication Table of: "+i);
            for (int j = 1; j<=10; j++){
                System.out.println(i+" x "+ j + " = "+(i*j));
            }
        }

        // Print Matrix
        final int ROWS = 10;
        final int COLUMNS = 10;
        int counter = 1;
        int[][] table = new int[ROWS][COLUMNS];

        for (int i = 0; i<ROWS; i++){
            for (int j = 0; j<COLUMNS; j++){
                table[i][j] = counter;
                counter++;
            }
        }

        for(int i=0; i<ROWS; i++){
            for(int j=0; j<COLUMNS; j++){
                System.out.print(table[i][j]+" ");
            }
            System.out.println();
        }



    }
}
