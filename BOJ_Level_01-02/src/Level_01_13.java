import java.util.*;

public class Level_01_13 {
	
	public static void main(String[] args) {
		
//		https://www.acmicpc.net/problem/2588
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(), b = sc.nextInt();
		
		if(a >= 100 & a <= 999 & b >= 100 & b <= 999) {
			System.out.println(a * (b % 10));
			System.out.println(a * ((b / 10) % 10));
			System.out.println(a * ((b / 100) % 10));
			System.out.println(a * b);
		}
		sc.close();
	}
	
}
