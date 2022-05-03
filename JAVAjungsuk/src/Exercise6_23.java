public class Exercise6_23 {
	
	static int max(int[] arr) {
//		아래 if문의 조건문에서 유의할 점 : 'arr == null || arr.length == 0'의 순서로 작성하면 정상적으로 컴파일되지만
//		'arr.length == 0 || arr == null'의 순서로 작성하면 오류 메세지(Exception in thread)가 뜸.
//		--> 메모리, 연산 순서를 잘 고려할 것.
		if (arr == null || arr.length == 0) {
			return -999999;
		} else {
			int max = 0;
			for(int j = 0; j < arr.length; j++) {
				if(arr[j] > max)
					max = arr[j];
			} return max;
		}
	} //end of max
	
	public static void main(String[] args) {
		int[] data = {3, 2, 9, 4, 7};
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값 : " + max(data));
		System.out.println("최대값 : " + max(null));
		System.out.println("최대값 : " + max(new int[] {})); //크기가 0인 배열
	} //end of main
}
