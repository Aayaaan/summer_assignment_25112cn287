import java.util.Scanner;

public class q04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        System.out.println("\n--- Inventory Details ---");
        System.out.println("Product ID: " + id);
        System.out.println("Product Name: " + name);
        System.out.println("Quantity: " + quantity);

        sc.close();
    }
}
