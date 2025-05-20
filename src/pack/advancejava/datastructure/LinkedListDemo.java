package pack.advancejava.datastructure;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Asia");
        list.add("North America");
        list.add("South America");

        for (String str : list) {
            System.out.println(str + " ");
        }
        System.out.println("\n");

        // same as arraylist
        // trying new shorcuts
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        list.addFirst("Australia");
        System.out.println("\n");
        for (String str : list) {
            System.out.println(str + " ");
        }

        list.addLast("Antarctica");
        System.out.println("\n");

        for (String str : list) {
            System.out.println(str + " ");
        }

        list.removeFirst();
        System.out.println("\n");

        for (String str : list) {
            System.out.println(str + " ");
        }

        list.removeLast();
        System.out.println("\n");

        for (String str : list) {
            System.out.println(str + " ");
        }
    }
}
