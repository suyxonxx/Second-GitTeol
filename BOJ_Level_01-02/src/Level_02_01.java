import java.util.*;

public class Level_02_01 {
	
	public static void main(String[] args) {
		
//		https://www.acmicpc.net/problem/1330

		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt(), B = sc.nextInt();
		
		if(A >= -10000 & A <= 10000 & B >= -10000 & B <= 10000) {
			if (A > B)
				System.out.println(">");
			else if (A < B)
				System.out.println("<");
			else System.out.println("==");
		}
		sc.close();
	}
	
}
