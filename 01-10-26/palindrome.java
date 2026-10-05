public class palindrome {
    public static String revNum(int n) {
        int temp = n;
        int rev = 0;
        while (n != 0) {
            int rem = n%10;
            rev = rev * 10 +rem;
            n = n/10;
        }
        if(temp == rev){
          return "palindrome";
        }else{
            return "Not palindrome";
        }
    }
    public static void main(String args[]){
        String ans = revNum(10);
        System.out.println(ans);


    }

}
