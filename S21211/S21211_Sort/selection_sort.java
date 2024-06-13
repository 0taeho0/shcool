public class selection_sort {

	public static void main(String[] args) {
		int[] dim = {4, 5, 7, 2, 3, 1};
		
		System.out.println("Array Length : "+dim.length);
		System.out.print("souce : ");
		System.out.println(java.util.Arrays.toString(dim));
		
		for(int i=0; i<dim.length; i++) {
			int min = i;
			for(int j=i+1; j<dim.length; j++) {
				if(dim[j] < dim[min]) {
					min = j;
				}
		}
			int temp = dim[i];
			dim[i] = dim[min];
			dim[min] = temp;
			System.out.print("pass-" + i+" : ");
			System.out.println(java.util.Arrays.toString(dim));
		}
		System.out.print("result : ");
		System.out.println(java.util.Arrays.toString(dim));
	}

}
