import java.util.Scanner;

public class q02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("1. Display Array");
        System.out.println("2. Find Sum");
        System.out.println("3. Find Largest");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.print("Array: ");
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }
                break;

            case 2:
                int sum = 0;
                for (int i = 0; i < arr.length; i++) {
                    sum += arr[i];
                }
                System.out.println("Sum = " + sum);
                break;

            case 3:
                int max = arr[0];
                for (int i = 1; i < arr.length; i++) {
                    if (arr[i] > max)
                        max = arr[i];
                }
                System.out.println("Largest = " + max);
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}
