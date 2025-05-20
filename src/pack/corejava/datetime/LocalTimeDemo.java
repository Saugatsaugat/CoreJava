package pack.corejava.datetime;

import java.time.LocalTime;

public class LocalTimeDemo {
    public static void main(String[] args){
        LocalTime currTime = LocalTime.now();
        System.out.println("Current time: " + currTime);
    }
}
