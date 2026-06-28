public class q02 {
    public static void main(String[] args) {

        String str1 = "apple";
        String str2 = "plane";

        System.out.print("Common Characters: ");

        for (int i = 0; i < str1.length(); i++) {

            char ch = str1.charAt(i);

            for (int j = 0; j < str2.length(); j++) {

                if (ch == str2.charAt(j)) {
                    System.out.print(ch + " ");
                    break;
                }
            }
        }
    }
}