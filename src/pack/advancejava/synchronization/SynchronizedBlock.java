package pack.advancejava.synchronization;
class BookSeatsBlockedMethod{
    int totalSeats = 100;
    public void bookSeats(int seats){
        synchronized (this) { // block synchronization
            if (seats <= totalSeats) {
                System.out.println(seats + " seats booked Successfully");
                System.out.println("---------------------------------------");
                totalSeats -= seats;
            } else {
                System.out.println("\n!!FAILED !!");
                System.out.println(totalSeats + " seats are only available");
                System.out.println("---------------------------------------");

            }
        }
    }
}



public class SynchronizedBlock extends Thread{
    static BookSeatsBlockedMethod bookSeat;
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

        bookSeat = new BookSeatsBlockedMethod();

        SynchronizedBlock s1 = new SynchronizedBlock();
        s1.seats = 80;
        System.out.println("\nTrying to book " + s1.seats + " seats");
        s1.start();

        try{
            Thread.sleep(1000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        SynchronizedBlock s2 = new SynchronizedBlock();
        s2.seats = 60;
        System.out.println("\nTrying to book " + s2.seats + " seats");
        s2.start();
    }

}
