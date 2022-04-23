import java.util.*;

public class Level_02_05 {

	public static void main(String[] args) {
		
//		https://www.acmicpc.net/problem/2884
		
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt(), M = sc.nextInt();
		
		if (H >= 0 & H <= 23 & M >= 0 & M <= 59) {
			if (M < 45) {
				if (H == 0)
					System.out.println(23 + " " + (M + 15));
				else
					System.out.println((H - 1) + " " + (M + 15));
			}
			else System.out.println(H + " " + (M - 45));
			
		}
		sc.close();
	}
	
}
