package pack.corejava;

public class CommandLine {
    public static void main(String args[]){
        int count = args.length;
        System.out.println("The total number of parameters are: "+count);
        for(int i = 0; i < count; ++i){
            System.out.println(i+" : "+"Java is "+args[i]);
        }
    }
}
