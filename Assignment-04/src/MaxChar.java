//8. WAP to find the maximum occurring character in a String.
public class MaxChar {

	public static void main(String[] args) {
		String str = "ineuron";
		int len = str.length();

		int count[] = new int[256];
		for (int i = 0; i < len; i++)
			count[str.charAt(i)]++;

		int max = -1; // Initialize max count
		char ch = ' '; // Initialize result

		for (int i = 0; i < len; i++) {
			if (max < count[str.charAt(i)]) {
				max = count[str.charAt(i)];
				ch = str.charAt(i);
			}
		}

		System.out.println("Maximum occuring character in \"" + str + "\" is: " + ch);
	}

}
