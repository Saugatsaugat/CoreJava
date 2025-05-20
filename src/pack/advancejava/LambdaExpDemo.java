package pack.advancejava;

import java.util.ArrayList;

public class LambdaExpDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.forEach((x) -> {System.out.println(x);});
    }
}
