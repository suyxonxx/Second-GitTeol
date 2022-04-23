import java.util.*;

public class EncryptNumber {

	public static void main(String[] args) {
		
//		자연수 암호화
		
		System.out.println("*ENCRYPT YOUR NUMBER*\nPress number (ONLY NATURAL NUMBER) ▼"
							+ "\n※If you want to exit, press '0'");
		
		for (;;) {
			Scanner sc = new Scanner(System.in);
			int user = sc.nextInt();
			
			if (user > 0) {
				int lock = (int)(Math.sqrt(user) * 1000) - 2;
				System.out.println(lock);
			}
			else if (user == 0) {
				System.out.println("Exit");
				break;
			}
			else
				System.out.println("Please recheck your input data");
			
		}//end of for
		
	}//end of main
	
}//end of class
