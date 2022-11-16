
//6. WAP to check whether an array is a subset of another array.

public class SubsetOfArray6 {

	public static void main(String args[]) {
		int array1[] = { 2, 9, 4, 7, 5, 3, 6, 8 };
		int array2[] = { 4, 7, 5 };

		int length1 = array1.length;
		int length2 = array2.length;

		if (isSubset(array1, array2, length1, length2))
			System.out.print("array2[] is subset of array1[] ");
		else
			System.out.print("array2[] is not a subset of array1[]");
	}

	static boolean isSubset(int array1[], int array2[], int m, int n) {
		int j = 0;
		for (int i = 0; i < n; i++) {
			for (j = 0; j < m; j++)
				if (array2[i] == array1[j])
					break;
			if (j == m)
				return false;
		}
		return true;
	}

}
