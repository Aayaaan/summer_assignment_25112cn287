import java.util.Scanner;

public class q03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Passenger Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Ticket Number: ");
        int ticketNo = sc.nextInt();

        System.out.print("Enter Number of Tickets: ");
        int tickets = sc.nextInt();

        int price = 500;
        int total = tickets * price;

        System.out.println("\n--- Ticket Details ---");
        System.out.println("Passenger Name: " + name);
        System.out.println("Ticket Number: " + ticketNo);
        System.out.println("Tickets Booked: " + tickets);
        System.out.println("Total Amount: " + total);

        sc.close();
    }
}