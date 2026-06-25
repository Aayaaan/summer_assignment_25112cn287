public class q02 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 3, 3, 4};

        int maxFreq = 0;
        int element = arr[0];

        for (int i = 0; i < arr.length; i++) {

            int count = 1;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > maxFreq) {
                maxFreq = count;
                element = arr[i];
            }
        }

        System.out.println("Element = " + element);
        System.out.println("Frequency = " + maxFreq);
    }
}
