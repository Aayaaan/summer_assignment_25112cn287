public class q04 {
    public static void main(String[] args) {

        String[] words = {"Java", "is", "very", "easy"};

        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {

                if (words[i].length() > words[j].length()) {

                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }

        System.out.println("Words sorted by length:");

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }
}