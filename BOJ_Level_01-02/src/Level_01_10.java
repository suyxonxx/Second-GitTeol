import java.util.*;

public class Level_01_10 {
	
	public static void main(String[] args) {
		
//		https://www.acmicpc.net/problem/10926
		
		Scanner sc = new Scanner(System.in);
		
		String id = sc.next();
		wow : if(id.length() <= 50) {
			for (int i = 0; i < id.length(); i++) {
				if (id.charAt(i) < 97 || id.charAt(i) > 122)
					break wow;
			}
			System.out.println(id + "??!");
		}
		sc.close();
	}
}
