import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int h = s.nextInt();
		int m = s.nextInt();
		int time = s.nextInt();
		
		int mTime = (h * 60) + m + time; // 분으로 통일
		h = mTime / 60; // 시
		m = mTime % 60; // 분
		
		if(h >= 24) {
			h = h - 24;
		}
		System.out.print(h + " " + m);
	}
}