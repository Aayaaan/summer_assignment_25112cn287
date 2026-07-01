import java.util.Scanner;

public class q01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] name = new String[3];
        int[] marks = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter Student Name: ");
            name[i] = sc.nextLine();

            System.out.print("Enter Marks: ");
            marks[i] = sc.nextInt();
            sc.nextLine();
        }

        System.out.println("\n--- Student Records ---");

        for (int i = 0; i < 3; i++) {
            System.out.println("Name: " + name[i] + ", Marks: " + marks[i]);
        }

        sc.close();
    }
}