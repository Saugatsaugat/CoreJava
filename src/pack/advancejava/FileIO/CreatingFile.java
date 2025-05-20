package pack.advancejava.FileIO;

import java.io.File;
import java.io.IOException;

public class CreatingFile {
    public static void main(String[] args){
        File file = new File("file1.txt");
        try{
            if(file.createNewFile()){
                System.out.println("File created");
            }else{
                System.out.println("File already exists");
            }

            if(file.delete()){
                System.out.println("File deleted");
            }else {
                System.out.println("File not deleted");
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
