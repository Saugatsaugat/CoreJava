package pack.advancejava.multithreading;

public class ThreadUsingRunnable implements Runnable {
    public void run() {
        System.out.println("The thread (created using runnable interface) is running: " + Thread.currentThread().getName());
    }

    public static void main(String[] args){
        ThreadUsingRunnable t1 = new ThreadUsingRunnable();
        Thread t2 = new Thread(t1);
        t2.start();
    }
}
