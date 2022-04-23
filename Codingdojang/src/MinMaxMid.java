
public class MinMaxMid {

	public static void main(String[] args) {
		
//		최대값, 최소값, 중위수 구하기
		
		int [] array = new int [100];
		
		for(int i = 0; i < array.length; i++)
			array[i] = (int)(Math.random() * 99) + 1;
		
		for(int i = 0; i < array.length ; i++) {
			if (i % 10 == 0 && i > 0)
				System.out.println("");
			System.out.print(array[i] + "\t");
		} System.out.println("\n");
		for (int i = 0; i < array.length; i++)
			for (int j = i + 1; j < array.length; j++)
				if(array[i] > array[j]) {
					int tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
				}
		
		int min = array[0];
		int max = array[array.length - 1];
		
		double mid = 0;
		if (array.length % 2 == 0)
			mid = (array[array.length / 2] + array[(array.length / 2) + 1]) / 2.0;
		else
			mid = array[array.length / 2];
		
		System.out.printf("제일 큰 값은 %d 입니다.\n", max);
		System.out.printf("제일 작은 값은 %d 입니다.\n", min);
		System.out.printf("중간값은 %.1f 입니다.\n", mid);
		
	}

}
