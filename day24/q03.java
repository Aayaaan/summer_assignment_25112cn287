public class q03 {
    public static void main(String[] args) {

        String str = "Java is very easy";
        String[] words = str.split(" ");

        String longest = words[0];

        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > longest.length()) {
                longest = words[i];
            }
        }

        System.out.println("Longest Word = " + longest);
    }
}