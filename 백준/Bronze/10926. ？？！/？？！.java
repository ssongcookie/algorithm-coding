import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        /**
        * [AS-IS]
        * 
        * Scanner sc = new Scanner(System.in);
        * String id = sc.next();
        * 
        * if(id != null){
        *     System.out.print(id + "??!");
        * }

        /**
        * [TO-BE]
        * 1. 입력 체크 생략
        * 2. 간결성
        * 3. 자원 관리: sc.close()를 추가하여 자원을 해제합니다.
        **/

        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        System.out.print(id + "??!");
        sc.close();
    }
}
