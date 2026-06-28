public class q03 {
    public static void main(String[] args) {

        String[] names = {"Ravi", "Aman", "Neha", "Kiran"};

        for (int i = 0; i < names.length - 1; i++) {
            for (int j = i + 1; j < names.length; j++) {

                if (names[i].compareTo(names[j]) > 0) {

                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }

        System.out.println("Sorted Names:");

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}