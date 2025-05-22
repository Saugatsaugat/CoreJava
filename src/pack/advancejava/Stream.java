/*
Stream:
 - introduced in java8
 - Lazy
 - Doesn't store data
 - is used with the collections( list, map, set)
 */

package pack.advancejava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
        System.out.println("/n Filtering the list starting with letter M: \n");
        for (String str : filteredStateByStartingWithM) {
            System.out.print(str + "\t");
        }

        // example of map function
        List<String> mapStateWithUppercase =
                states.stream()
                        .map(String::toUpperCase)
                        .collect(Collectors.toList());
        System.out.println("/n Mapping the list with upper case: \n");
        for (String str : mapStateWithUppercase) {
            System.out.print(str + "\t");
        }

    }
}
