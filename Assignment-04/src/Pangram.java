//6. WAP to implement Pangram Checking with least inbuilt methods being used.

public class Pangram {

	public static void main(String[] args) {
		boolean hyder = false;
		String s1 = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";

		s1 = s1.replace(" ", "");

		char[] ch = s1.toCharArray();

		int[] ar = new int[26];

		for (int i = 0; i < ch.length; i++) {
			int index = ch[i] - 65;
			ar[index]++; // ar[19]++ --> 0++ --> 1++ --->2
			// ar[ch[i]-65]++;
		}
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == 0) {
				System.out.println("It's not pangram");
				hyder = true;
			}
		}
		if (hyder == false) {
			System.out.println("It's pangram");
		}
	}

}
