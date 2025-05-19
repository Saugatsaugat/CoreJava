package pack.advancejava.synchronization;

class BookSeatsUsingStaticSynchronization {
    static int totalSeats = 100; // if static not used???

    public void bookSeats(int seats){
        if(totalSeats >= seats){
            totalSeats -= seats;
            System.out.println(seats + " Seat booked successfully");
            System.out.println("----------------------------------------");
        }else{
            System.out.println("!! Insufficient Seats");
            System.out.println(totalSeats + " Seat are only available");
            System.out.println("----------------------------------------");
        }
    }
}

class Thread1 extends Thread{
    BookSeatsUsingStaticSynchronization b1;
    int seats;
    public Thread1(BookSeatsUsingStaticSynchronization b1, int seats){
        this.b1 = b1;
        this.seats = seats;
    }
    public void run(){
        b1.bookSeats(seats);
    }
}

class Thread2 extends Thread{
    BookSeatsUsingStaticSynchronization b2;
    int seats;
    public Thread2(BookSeatsUsingStaticSynchronization b2, int seats){
        this.b2 = b2;
        this.seats = seats;
    }
    public void run(){
        b2.bookSeats(seats);
    }
}


public class StaticSynchronization extends Thread {
    public static void main(String[] args) {
        System.out.println("\n\n*******************************************");
        System.out.println("\n\n\t\t Seat Booking System");
        System.out.println("\n\n*******************************************");

        try{
            Thread.sleep(1000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println("\nTrying to book 50 seats");
        BookSeatsUsingStaticSynchronization b1 = new BookSeatsUsingStaticSynchronization();
        Thread1 t1 = new Thread1(b1, 50);
        t1.start();

        try{
            Thread.sleep(1000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println("\nTrying to book 80 seats");
        BookSeatsUsingStaticSynchronization b2 = new BookSeatsUsingStaticSynchronization();
        Thread1 t2 = new Thread1(b2, 80);
        t2.start();


    }
}
