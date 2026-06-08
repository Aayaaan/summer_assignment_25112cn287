public class q04 {
    public static void main(String[] args){
        int num = 555,rev=0,original;
        original = num;
        while(num != 0){
            rev = rev * 10 + (num % 10);
            num = num / 10;}
        System.out.println(rev);
        if(rev == original){
            System.out.println("Palindrome");
  }      else{
            System.out.println("Not Palindrome");
        }
    }}