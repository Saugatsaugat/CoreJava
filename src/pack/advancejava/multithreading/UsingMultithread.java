package pack.advancejava.multithreading;

class Good_ extends Thread{
    public void run(){
        for(int i = 0; i<5; i++){
            try{
                System.out.println("Good");
                Thread.sleep(1000);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}

class Morning_ extends Thread{
    public void run(){
        for(int i = 0; i<5; i++){
            try{
                System.out.println("Morning");
                Thread.sleep(1000);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
public class UsingMultithread {
    public static void main(String[] args) {
        Good_ good = new Good_();
        Morning_ morning = new Morning_();
        good.start();
//        try{
//            Thread.sleep(10);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
        morning.start();
    }
}
