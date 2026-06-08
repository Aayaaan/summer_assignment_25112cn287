public class q04 {
    public static void main (String[] args) {
        int num = 5472, count = 1;
        while(num/10 != 0){
            num = num/10;
            count++;
        }
        System.out.println(count);
    }
}