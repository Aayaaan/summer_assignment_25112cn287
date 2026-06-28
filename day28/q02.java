import java.util.Scanner;

public class q02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Balance: ");
        double balance = sc.nextDouble();

        System.out.println("\n--- Bank Account Details ---");
        System.out.println("Account Number: " + accNo);
        System.out.println("Account Holder: " + name);
        System.out.println("Balance: " + balance);

        sc.close();
    }
}