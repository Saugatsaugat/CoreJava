package pack.advancejava.generics;

public class GenericDemoLoopThroughItem {
    public static <T> void display(T[] items){
        for(T item : items){
            System.out.print(item + " ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args){
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        display(numbers);

        String[] cities = {"New York", "Boston", "Dallas", "San Jacinto", "Raleigh"};
        display(cities);
    }
}
