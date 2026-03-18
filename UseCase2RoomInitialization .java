public abstract static class Room{
        protected int numberOfBeds;
        protected int squareFeet;
        protected double pricePerNight;
        protected int available;
    public Room(int numberOfBeds, int squareFeet, double pricePerNight, int available){
    this.numberOfBeds = numberOfBeds;
    this.squareFeet = squareFeet;
    this.pricePerNight = pricePerNight;
    this.available = available;
    }
     public void displayRoomDetails() {
         System.out.print("Beds: " + numberOfBeds);
         System.out.print("Size: " + squareFeet);
         System.out.print("Price Per Night: " + pricePerNight);
         System.out.print("Available: " + available);
     }
     }
         public class Singleroom extends Room{
             public Singleroom(){ super (1,250,1500.0,5);
            }
     public class Doubleroom extends Room{
          public Doubleroom(){ super (2,400,2500.0,3);
        }
    public class Suiteroom extends Room{
              public Suiteroom(){ super(3,750,5000.0,2);
    }
public class UseCase2RoomInitialization {
    public static void main(Strings[] args) {
        System.out.print("Hotel Room initialization");
        System.out.print("Single Room: ");
        SingleRoom single= new Singleroom();
        single.displayRoomDetails();
        System.out.print("Double Room: ");
        SingleRoom double= new Doubleroom();
        double.displayRoomDetails();
        System.out.print("Suite Room: ");
        SuiteRoom suite= new Suiteroom();
        suite.displayRoomDetails();
    }
}
