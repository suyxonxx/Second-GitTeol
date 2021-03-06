import java.util.*;

public class Level_02_06 {

	public static void main(String[] args) {
		
//		https://www.acmicpc.net/problem/2525
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt();
		
		if (A >= 0 & A <= 23 & B >= 0 & B <= 59 & C >= 0 & C <= 1000) {
			int H = (A + (C / 60)) % 24;
			int M = B + (C % 60);
			
			if (M > 59) {
				if (H == 23)
					System.out.println(0 + " " + (M - 60));
				else
					System.out.println((H + 1) + " " + (M - 60));
			}
			else System.out.println(H + " " + M);
		}
			sc.close();
	}
	
}
