import java.util.Scanner;

class HotelRoom {
    String type;
    boolean booked;

    HotelRoom(String type) {
        this.type = type;
        this.booked = false;
    }
}

public class HotelReservationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HotelRoom standard = new HotelRoom("Standard");
        HotelRoom deluxe = new HotelRoom("Deluxe");

        while (true) {
            System.out.println("\n1. Book Room");
            System.out.println("2. Cancel Booking");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Choose room (1-Standard / 2-Deluxe): ");
                int room = sc.nextInt();

                if (room == 1 && !standard.booked) {
                    standard.booked = true;
                    System.out.println("Standard room booked successfully.");
                } 
                else if (room == 2 && !deluxe.booked) {
                    deluxe.booked = true;
                    System.out.println("Deluxe room booked successfully.");
                } 
                else {
                    System.out.println("Room not available.");
                }
            } 
            else if (choice == 2) {
                System.out.print("Cancel which room (1-Standard / 2-Deluxe): ");
                int room = sc.nextInt();

                if (room == 1 && standard.booked) {
                    standard.booked = false;
                    System.out.println("Standard room booking cancelled.");
                } 
                else if (room == 2 && deluxe.booked) {
                    deluxe.booked = false;
                    System.out.println("Deluxe room booking cancelled.");
                } 
                else {
                    System.out.println("No booking found.");
                }
            } 
            else {
                break;
            }
        }
    }
}

