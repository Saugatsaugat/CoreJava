package pack.advancejava.FileIO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyCharacters {
    public static void main(String[] args) throws IOException {
        FileReader in = null;
        FileWriter out = null;

        try{
            String workingDir = System.getProperty("user.dir");
            in = new FileReader(workingDir + "/src/staticfiles/test1.txt");
            out = new FileWriter(workingDir + "/src/staticfiles/test3.txt");
            int c;

            while( (c = in.read()) != -1){
                out.write(c);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally{
            if(in!=null){
                in.close();
            }
            if(out!=null){
                out.close();
            }
        }
    }
}
