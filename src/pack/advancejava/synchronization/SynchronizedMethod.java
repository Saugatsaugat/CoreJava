package pack.advancejava.synchronization;

class BookSeats_{
    int totalSeats = 100;
    synchronized public void bookSeats(int seats){
        if(seats <= totalSeats){
            System.out.println(seats + " seats booked Successfully");
            System.out.println("---------------------------------------");
            totalSeats -= seats;
        }else{
            System.out.println("\n!!FAILED !!");
            System.out.println(totalSeats + " seats are only available");
            System.out.println("---------------------------------------");

        }
    }
}

public class SynchronizedMethod extends Thread{
    static BookSeats_ bookSeat;
    int seats;

    public void run(){
        bookSeat.bookSeats(seats);
    }

    public static void main(String[] args) {
        System.out.println("### Seat Booking System ####");
        System.out.println("\n Loading................");

        try{
            Thread.sleep(1000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        bookSeat = new BookSeats_();

        SynchronizedMethod s1 = new SynchronizedMethod();
        s1.seats = 80;
        System.out.println("\nTrying to book " + s1.seats + " seats");
        s1.start();

        try{
            Thread.sleep(1000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        SynchronizedMethod s2 = new SynchronizedMethod();
        s2.seats = 60;
        System.out.println("\nTrying to book " + s2.seats + " seats");
        s2.start();
    }
}
