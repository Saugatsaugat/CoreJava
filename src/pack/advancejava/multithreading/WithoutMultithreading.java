package pack.advancejava.multithreading;

class Good{
    void display(){
        for(int i = 0; i<5; i++){
            try{
                System.out.println("Good");
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}

class Morning{
    void display(){
        for(int i = 0; i<5; i++){
            try{
                System.out.println("Morning");
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
public class WithoutMultithreading {
    public static void main(String[] args) {
        Good good = new Good();
        Morning morning = new Morning();
        good.display();
        morning.display();
    }
}
