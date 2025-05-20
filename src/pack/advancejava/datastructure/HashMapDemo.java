package pack.advancejava.datastructure;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, String> states = new HashMap<>();
        states.put("TX", "Texas");
        states.put("AL", "Alabama");
        states.put("NJ", "New Jersey");
        states.put("CA", "California");

        System.out.println("Size: " + states.size() + "\n");
        System.out.println("Key: CA -> " + states.get("CA"));

        System.out.println("\n");
        for(String key: states.keySet()){
            System.out.println(key + "\t");
        }

        System.out.println("\n");
        for(String value: states.values()){
            System.out.println(value + "\t");
        }

        System.out.println("\n");
        for (String key: states.keySet()){
            System.out.println(key + " -> " + states.get(key));
        }

    }
}
