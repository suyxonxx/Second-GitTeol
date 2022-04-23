import java.util.*;

public class Level_02_07 {

	public static void main(String[] args) {
		
//		https://www.acmicpc.net/problem/2480
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), max;
		
		if (a >= 1 & a <= 6 & b >= 1 & b <= 6 & c >= 1 & c <= 6) {
			if (a == b & b == c)
				System.out.println(10000 + a * 1000);
			else if (a == b & b != c)
				System.out.println(1000 + a * 100);
			else if (b == c & c != a)
				System.out.println(1000 + b * 100);
			else if (c == a & a != b)
				System.out.println(1000 + c * 100);
			else {
				if (a < b) {
					if (b < c) max = c;
					else max = b;
				}
				else {
					if (a < c) max = c;
					else max = a;
				}
				System.out.println(max * 100);
			}
				
		}
			sc.close();
	}
	
}
