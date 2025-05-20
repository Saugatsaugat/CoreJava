package pack.advancejava.datastructure;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args){
        HashSet<String> cities = new HashSet<>();
        cities.add("New York");
        cities.add("Houston");
        cities.add("Montgomery");
        cities.add("Destin");
        cities.add("New York");

        System.out.println("Size :" + cities.size());

        System.out.println("\n");
        for(String city : cities){
            System.out.println(city);
        }

        cities.remove("New York");
        System.out.println("\n");
        for(String city : cities){
            System.out.println(city);
        }

        cities.add("New York");
        System.out.println("\n");
        for(String city : cities){
            System.out.println(city);
        }
        System.out.println("\n");
        System.out.println(cities.contains("New York"));

        cities.clear();
        System.out.println("\nCleared HashSet");
        for(String city : cities){
            System.out.println(city);
        }

    }
}
