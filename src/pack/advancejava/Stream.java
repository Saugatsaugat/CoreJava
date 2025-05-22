/*
Stream:
 - introduced in java8
 - Lazy
 - Doesn't store data
 - is used with the collections( list, map, set)
 */

package pack.advancejava;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Stream {
    public static void main(String[] args) {
        String[] cities = {"New York", "Chicago", "Denver", "Atlanta", "Dallas"};
        // converting the array to list so that we can use Stream API
        List<String> arrayList = Arrays.stream(cities).map(String::toUpperCase).collect(Collectors.toList());
        for (String str : arrayList) {
            System.out.print(str + "\t");
        }

        // creating list
        ArrayList<String> states = new ArrayList<>();
        states.add("Virginia");
        states.add("Texas");
        states.add("Maryland");
        states.add("Maine");
        states.add("Washington");
        states.add("Colorado");

        List<String> filteredStateByStartingWithM = states.stream()
                .filter(x -> x.startsWith("M"))
                .collect(Collectors.toList());
        System.out.println("\n\nFiltering the list starting with letter M: ");
        for (String str : filteredStateByStartingWithM) {
            System.out.print(str + "\t");
        }

        // example of map function
        List<String> mapStateWithUppercase =
                states.stream()
                        .map(String::toUpperCase)
                        .collect(Collectors.toList());
        System.out.println("\n\nMapping the list with upper case: ");
        for (String str : mapStateWithUppercase) {
            System.out.print(str + "\t");
        }

        // example of sorted
        List<String> sortedList =
                states.stream()
                        .sorted()
                        .collect(Collectors.toList());
        System.out.println("\n\nSorted list Using Sort() : ");
        for (String str : sortedList) {
            System.out.print(str + "\t");
        }


        // Loop through elements
        System.out.println("\n\nUsing stream and for each to loop through elements: ");
        states.stream().forEach(s -> {
            System.out.print(s + "\t");
        });

        // count the state whose length is greater than 3
        long count = states.stream()
                .filter(x -> (x.length() > 3))
                .count();
        System.out.println("\n\nState length > 3, total is: " + count);

        System.out.println("\n\n");
        Optional<String> first = states.stream().findFirst();
        System.out.println("First: " + first);


        //
        boolean hasMatch = states.stream().anyMatch(x -> x.startsWith("M"));
        System.out.println("\nMatched?: " + hasMatch);

        // reduced
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println("\nSum : " + sum);

        // primitive streams
        int[] num = {1, 2, 3, 4, 5};
        int total = IntStream.of(num).sum();
        System.out.println("\nTotal: "+ total);

        // join strings
        List<String> stringList = List.of("Ap", "pl", "e.");
        String str = stringList.stream().collect(Collectors.joining());
        System.out.println("Joined String: " + str);

        // group by
        List<String> fruits = List.of("Apple", "Orange", "Grape", "Pineapple", "Mango", "Avocado", "Banana");
        Map<Integer, List<String>> groupByLength =
                fruits.stream()
                        .collect(Collectors.groupingBy(String::length));

        groupByLength.forEach((integer, strings) -> {
            System.out.print(integer+": ");
            strings.stream().forEach(x->System.out.print(x + " "));
            System.out.println("\n");
        });

    }
}
