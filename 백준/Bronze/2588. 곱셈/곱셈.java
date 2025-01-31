import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int one = b % 10;
        int ten = (b / 10) % 10;
        int hun = b / 100;
        int total = a * b;
        
        System.out.println(a * one);
        System.out.println(a * ten);
        System.out.println(a * hun);
        System.out.println(total);
    }
}