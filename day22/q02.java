public class q02 {
    public static void main(String[] args) {

        String str = "Java is easy";
        int words = 1;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ')
                words++;
        }

        System.out.println("Number of words = " + words);
    }
}