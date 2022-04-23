import java.util.*;

public class Level_02_04 {

	public static void main(String[] args) {
		
//		https://www.acmicpc.net/problem/14681
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt(), y = sc.nextInt();
		
		if (x >= -1000 & x <= 1000 & x != 0 & y >= -1000 & y <= 1000 & y != 0) {
			if (x > 0 & y > 0)
				System.out.println(1);
			else if (x < 0 & y > 0)
				System.out.println(2);
			else if (x < 0 & y < 0)
				System.out.println(3);
			else
				System.out.println(4);
		}
		sc.close();
	}
	
}
