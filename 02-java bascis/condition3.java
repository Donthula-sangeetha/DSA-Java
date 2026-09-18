import java.util.Scanner;

public class condition3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>0){
            System.out.println("positive");
        }else if(n==0){
            System.out.println("Zero");
        }else if(n<0){
            System.out.println("negative");
        }

    }
}
