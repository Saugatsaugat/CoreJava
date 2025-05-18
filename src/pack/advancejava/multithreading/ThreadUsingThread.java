package pack.advancejava.multithreading;

public class ThreadUsingThread extends Thread{
    public void run() {
        System.out.println("The thread is running");
    }
    public static void main(String[] args){
        ThreadUsingThread thread = new ThreadUsingThread();
        thread.start();
    }
}
