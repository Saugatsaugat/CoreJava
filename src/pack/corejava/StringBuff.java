/*
 * Demonstration of mutable 
 */
package pack.corejava;

public class StringBuff {
    public static void main(String ar[]){
        String myName = "Saugat";
        StringBuffer buffer = new StringBuffer(myName);
        buffer.append(" Thapa");

        System.out.println(buffer);

    }
    
}
