package pack.corejava;

public class ArrayDemo {
    public static void main(String[] args) {
        //array syntax: datatype[] variableName;
        // Array Declaration
        //int[] nums;
        //nums = new int[5];
        // or
        //int[] nums = new int[5];
        //or
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
        System.out.println(nums[3]);
        System.out.println(nums[4]);
//        System.out.println(nums[4]); // index out of range exception

        // accessing data using for loop
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        // using for each loop
        System.out.println("Using for each loop");
        for (int i : nums) {
            System.out.println(i);
        }

        // Using multi-array to print the multiplication
        final int ROWS = 10;
        final int COLS = 10;
        int[][] multiple = new int[ROWS][COLS];

        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                multiple[i][j] = (i + 1) * (j + 1);
            }
        }

        // print the multiplication table
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                System.out.print((i + 1) + " * " + (j + 1) + " = " + multiple[i][j]);
                System.out.println("\n");
            }
            System.out.println("\n");
        }

    }

}
