import java.util.Scanner;

public class sumof2nums {
    public static int sumof2(int a, int b){
        int sum = a+b;
        return sum;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = sumof2(a, b);

        System.out.println("sum:"+sum);


    }
}
