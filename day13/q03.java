public class q03 {
    public static void main(String[] args) {

        int[] arr = {10, 20, 5, 40, 30};

        int largest = arr[0];
        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > largest)
                largest = arr[i];

            if (arr[i] < smallest)
                smallest = arr[i];
        }

        System.out.println("Largest = " + largest);
        System.out.println("Smallest = " + smallest);
    }
}