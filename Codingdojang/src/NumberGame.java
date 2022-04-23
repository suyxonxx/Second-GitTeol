import java.util.*;

public class NumberGame {

	public static void main(String[] args) {
		
//		컴퓨터가 1~100 숫자(정수 범위) 중 하나를 랜덤으로 정합니다. (이를 알려주지 않습니다.)
//		사용자는 이 숫자를 맞추어야 합니다.
//		입력한 숫자보다 정답이 크면 → "UP" 출력,
//		입력한 숫자보다 정답이 작으면 → "DOWN" 출력.
//		정답을 맞추면 → "정답"을 출력하고, 지금까지 숫자를 입력한 횟수를 알려줍니다.
		
		System.out.println("★숫자 맞추기 게임★\n아래에 1 이상 100 이하의 정수를 입력해주세요.");
		Scanner sc = new Scanner(System.in);

		int com = (int)(Math.random() * 99) + 1;
		
		for(int i = 1; ; i++) {
			int user = sc.nextInt();
			
			if (com > user)
				System.out.println("UP");
			else if (com < user)
				System.out.println("DOWN");
			else if (com == user) {
				System.out.printf("정답\n총 입력횟수 : %d\n", i);
				break;
			}
			
		}//end of for
		sc.close();
	}//end of main
	
}//end of class
