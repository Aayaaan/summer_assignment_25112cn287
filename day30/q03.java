import java.util.Scanner;

public class q03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] names = new String[3];
        double[] salary = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter Employee Name: ");
            names[i] = sc.nextLine();

            System.out.print("Enter Salary: ");
            salary[i] = sc.nextDouble();
            sc.nextLine();
        }

        System.out.println("\n--- Employee Records ---");

        for (int i = 0; i < 3; i++) {
            System.out.println("Name: " + names[i] + ", Salary: " + salary[i]);
        }

        sc.close();
    }
}