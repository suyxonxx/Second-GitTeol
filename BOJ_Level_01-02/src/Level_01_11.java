import java.util.*;

public class Level_01_11 {
	
	public static void main(String[] args) {
		
//		https://www.acmicpc.net/problem/18108
		
		Scanner sc = new Scanner(System.in);
		
		int y = sc.nextInt();
		
		if (y >= 1000 & y <= 3000) {
			System.out.println(y - 543);
		}
		sc.close();
	}
	
}