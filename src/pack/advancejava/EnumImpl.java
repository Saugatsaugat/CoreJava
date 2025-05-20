package pack.advancejava;

public class EnumImpl {
    public static void main(String[] args) {
        for(EnumDemo day: EnumDemo.values()) {
            System.out.println(day + ": " + day.getDayName());
        }
    }
}
