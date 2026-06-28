import java.util.Scanner;
import java.util.Random;

public class q01 {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int number = random.nextInt(10) + 1;
        int guess;

        System.out.println("Guess a number between 1 and 10:");

        do {
            guess = sc.nextInt();

            if (guess > number)
                System.out.println("Too High");
            else if (guess < number)
                System.out.println("Too Low");
            else
                System.out.println("Correct Guess!");

        } while (guess != number);

        sc.close();
    }
}