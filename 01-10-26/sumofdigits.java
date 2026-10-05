public class sumofdigits {
    public static int digitsum(int n) {
        int sum = 0;
        while(n!=0){
            int rem = n%10;
            sum = sum + rem;
            n = n / 10;
        }
        return sum;
    }

    public static void main(String args[]){
        int ans = digitsum(568);
        System.out.println(ans);

    }
}
