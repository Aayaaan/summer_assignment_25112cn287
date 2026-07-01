import java.util.Scanner;

public class q04 {

    static String[] names = new String[3];
    static int[] marks = new int[3];

    static void addRecords() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter Student Name: ");
            names[i] = sc.nextLine();

            System.out.print("Enter Marks: ");
            marks[i] = sc.nextInt();
            sc.nextLine();
        }
    }

    static void displayRecords() {
        System.out.println("\n--- Student Records ---");

        for (int i = 0; i < 3; i++) {
            System.out.println("Name: " + names[i] + ", Marks: " + marks[i]);
        }
    }

    public static void main(String[] args) {

        addRecords();
        displayRecords();
    }
}