package pack.advancejava.multithreading;

public class SleepMethod extends Thread {
    public void run() {
        for(int i=0; i<5; i++){
            try{
                Thread.sleep(5000); // 5000 milliseconds
                System.out.println(i);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        SleepMethod s1 = new SleepMethod();
        SleepMethod s2 = new SleepMethod();
        s1.start();
        s2.start();
    }
}
