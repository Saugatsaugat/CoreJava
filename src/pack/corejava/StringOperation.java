package pack.corejava;

public class StringOperation {
    public static void main(String[] args) throws InterruptedException {
        String string = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println(string.length());
        System.out.println(string.toLowerCase());
        System.out.println(string.charAt(6));
        System.out.println(string.endsWith("XYYZ"));
        System.out.println(string.endsWith("XYZ"));
//        System.out.println(string.intern());//
        System.out.println(string.strip()); // Java 11+
        System.out.println(string.trim()); // Pre Java 11
        int total = 50;

        for (int i = 0; i <= total; i++) {
            int percent = (i * 100) / total;
            String bar = "=".repeat(i) + " ".repeat(total - i);

            // \r moves the cursor to the start of the line
            System.out.print("\r[" + bar + "] " + percent + "%");

            Thread.sleep(100); // Simulate work
        }

        System.out.println("\nDone!");
    }
}
