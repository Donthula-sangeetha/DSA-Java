import java.util.Scanner;
public class evenodd {
    public static void main(String[] args){
        int s = 0;
        int h = 0;
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        for(int i =1;i<=n;i++){
            if(i%2==0){
                s+=1;
            }else{
                h+=1;
            }

        }
        System.out.println("even:"+s);
        System.out.println("odd:"+h);



    }
}
