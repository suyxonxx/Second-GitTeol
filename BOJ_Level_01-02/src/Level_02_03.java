import java.util.Scanner;

public class Level_02_03 {

	public static void main(String[] args) {
		
//		https://www.acmicpc.net/problem/2753
		
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		
		if (year >= 1 & year <= 4000) {
			if ((year % 4 == 0 & year % 100 != 0) || year % 400 == 0)
				System.out.println(1);
			else
				System.out.println(0);
		}
		sc.close();
	}
	
}
