package pack.advancejava.FileIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {
    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;
        try{
            String rootDir = System.getProperty("user.dir"); // this will gives you the working directory
//            System.out.println(rootDir);
            in = new FileInputStream(rootDir + "/src/staticfiles/test1.txt");
            out = new FileOutputStream(rootDir + "/src/staticfiles/test2.txt");

            int c;
            while((c = in.read()) != -1){
                out.write(c);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            if(in != null){
                in.close();
            }
            if (out != null){
                out.close();
            }
        }
    }

}
