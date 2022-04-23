import java.util.*;

public class Level_01_12 {
	
	public static void main(String[] args) {
		
//		https://www.acmicpc.net/problem/10430
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt();
		
		if(A >= 2 & A <= 10000 & B >= 2 & B <= 10000 & C >= 2 & C <= 10000) {
			System.out.println((A + B) % C);
			System.out.println(((A % C) + (B % C)) % C);
			System.out.println((A * B) % C);
			System.out.println(((A % C) * (B % C)) % C);
		}
		sc.close();
	}
	
}
