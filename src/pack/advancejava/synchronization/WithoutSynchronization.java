package pack.advancejava.synchronization;

class BookSeats{
    int totalSeats = 100;
    public void bookSeats(int seats){
        if(seats <= totalSeats){
            System.out.println(seats + " seats booked Successfully");
            totalSeats -= seats;
            System.out.println(totalSeats + " seats are available");
        }else{
            System.out.println(seats + " seats are not available");
            System.out.println(totalSeats + " seats are only available");
        }
    }
}

public class WithoutSynchronization extends Thread{
    static BookSeats bookSeats;
    int seats;

    public void run(){
        bookSeats.bookSeats(seats);
    }

    public static void main(String[] args) {
        bookSeats = new BookSeats();

        WithoutSynchronization s1 = new WithoutSynchronization();
        s1.seats = 80;
        s1.start();

        WithoutSynchronization s2 = new WithoutSynchronization();
        s2.seats = 60;
        s2.start();
    }
}
