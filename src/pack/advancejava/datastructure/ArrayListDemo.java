package pack.advancejava.datastructure;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("CA");
        list.add("IL");
        list.add("TX");
        list.add("VA");

        //size of the list
        int size = list.size();
        System.out.println("Size of List: " + size);
        // display each item using loop
        System.out.println("\nThe elements in the list are:\n");
        for (int i = 0; i < size; i++) {
            System.out.print(list.get(i) + " "); // list.get(index)
        }

        // for each loop
        System.out.println("\nUsing for each loop to display the elements in the list\n");
        for (String str : list) {
            System.out.print(str + " ");
        }

        // place the item at position 0
        list.set(0, "MD");
        System.out.println("\nadded element is: " + list.get(0));

        for (String str : list) {
            System.out.print(str + " ");
        }
//        list.remove(0);

        Collections.sort(list);
        System.out.println("\nAfter sorting the list\n");
        for (String str : list) {
            System.out.print(str + " ");
        }

    }
}
