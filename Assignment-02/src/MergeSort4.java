import java.util.Arrays;

//4. WAP to sort an array using Merge Sort Algorithm.

public class MergeSort4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 9, 4, 7, 5, 3, 6, 8 };
		arr = mergeSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	static int[] mergeSort(int[] arr) {
		if (arr.length == 1) {
			return arr;
		}
		int mid = arr.length / 2;

		int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
		int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

		return merge(left, right);
	}

	private static int[] merge(int[] first, int[] second) {
//		 Mix Array to merge sorted array
		int[] mix = new int[first.length + second.length];

		int i = 0;
		int j = 0;
		int k = 0;

		while (i < first.length && j < second.length) {
			if (first[i] < second[j]) {
				mix[k] = first[i];
				i++;
			} else {
				mix[k] = second[j];
				j++;
			}
			k++;
		}
//	        it may be possible that one of the array is not complete added in mix array.
		while (i < first.length) {
			mix[k] = first[i];
			i++;
			k++;
		}

		while (j < second.length) {
			mix[k] = second[j];
			j++;
			k++;
		}
		return mix;
	}
}