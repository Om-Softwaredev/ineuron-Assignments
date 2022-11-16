import java.util.Arrays;

//3. WAP to sort an array using Bubble Sort Algorithm

public class BubbleSort3 {

	public static void main(String[] args) {
		int[] array = { 2, 9, 4, 7, 5, 3, 6, 8 };
		bubble(array);
		System.out.println(Arrays.toString(array));

	}

	static void bubble(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			boolean swapped = false;
			// for each step, max item will come at the last respective index.
			for (int j = 1; j < arr.length - i; j++) {
				// swap if the item is smaller than the previous item.
				if (arr[j] < arr[j - 1]) {

					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
					swapped = true;
				}
			}
			// if you did not swap for a particular value of i, it means the array is sorted
			// hence stop the program.
			if (swapped == false) {
				break;
			}
		}
	}

}
