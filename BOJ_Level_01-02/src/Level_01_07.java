import java.util.*;

public class Level_01_07 {
	
	public static void main(String[] args) {
		
//		https://www.acmicpc.net/problem/10998
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(), b = sc.nextInt();
		if (a > 0 & a < 10 & b > 0 & b < 10) {
			System.out.println(a * b);
		}
		
		sc.close();
		
	}
}
