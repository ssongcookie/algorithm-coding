import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt(); //총금액
        int n = sc.nextInt(); //종류
        int sum = 0;       
        
        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            sum += a * b;      
        }
        
        if(sum == x){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
        
    }
}