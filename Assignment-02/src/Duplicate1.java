import java.util.Scanner;

//1. WAP to find the duplicates present in an array

public class Duplicate1 {

	public static void main(String[] args) {

		int[] array = {2,4,3,2,4,7,5,3,6,7,8,9};
		
//		Taking user input
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter Size of the Array");
//		int n = scan.nextInt();
//		
//		int[] array = new int[n];
//		System.out.print("Enter element of the array : ");
//		for (int i = 0; i < n; i++) {
//			array[i]=scan.nextInt();
//		}
		
		int flag =0;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				if (array[i]==array[j]) {
					flag++;
					if (flag==1) {
						System.out.print("Duplicate element present in Arrays: ");
					}
					System.out.print(array[j]+" ");
					
				}
			}
		}
		if (flag==0) {
			System.out.println("No duplicate elements are present in Array");
		}
	}

}
