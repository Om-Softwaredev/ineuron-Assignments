import java.util.Arrays;

//5. WAP to sort an array using Selection Sort Algorithm.

public class SelectionSort5 {

	public static void main(String[] args) {
		int[] array = { 2, 9, 4, 7, 5, 3, 6, 8 };
		selection(array);
		System.out.println(Arrays.toString(array));
	}

	static void selection(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			// find the max item in the remaining array and swap with correct index.
			int last = arr.length - i - 1;
			int max = 0;
			for (int j = 0; j <= last; j++) {
				if (arr[max] < arr[j]) {
					max = j;
				}
			}

			int temp = arr[max];
			arr[max] = arr[last];
			arr[last] = temp;
		}

	}

}
