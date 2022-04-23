import java.util.*;

public class Level_01_09 {
	
	public static void main(String[] args) {
		
//		https://www.acmicpc.net/problem/10869
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(), b = sc.nextInt();
		if (a >= 1 & a <= 10000 & b >= 1 & b <= 10000) {
			System.out.println(a + b);
			System.out.println(a - b);
			System.out.println(a * b);
			System.out.println(a / b);
			System.out.println(a % b);
		}
		sc.close();
	}
}
