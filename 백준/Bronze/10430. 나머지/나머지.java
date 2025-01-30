import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        if(A >= 2 && C <= 10000){
            System.out.println((A+B)%C);
            System.out.println(((A%C) + (B%C))%C);
            System.out.println((A*B)%C);
            System.out.println(((A%C) * (B%C))%C);
            sc.close();
        }else{
            sc.close();
            return;
        }
    }
}