//반환타입 : int
//매개변수 최대값을 구할 배열 
public class Exercise6_23 {
	
	static int max(int[] arr) {
		if (arr.length == 0 || arr == null) {
			return -999999;
		}
		else {
			int max = 0;
			for(int i = 0; i < arr.length; i++) {
				
			}
			
			return 0;
		}
	} // end of max
	
	public static void main(String[] args) {
		int[] data = {3, 2, 9, 4, 7};
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값 : " + max(data));
		System.out.println("최대값 : " + max(null));
		System.out.println("최대값 : " + max(new int[] {})); //크기가 0인 배열
	}
}
