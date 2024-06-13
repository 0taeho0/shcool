public class Bubble_sort {

	public static void main(String[] args) {
		int[] array = {7, 5, 4, 3, 1};
		
		int temp = 0;
		for(int i=1; i<array.length; i++) {
			System.out.println("");
			for(int j=0; j<array.length-i; j++) {
				if(array[j] > array[j+1]) {
					temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println();
		System.out.print("최종결과입니다 : ");
		for(int i=0; i<array.length ;i++) {
			System.out.print(array[i]+" ");
		}
	}

}
