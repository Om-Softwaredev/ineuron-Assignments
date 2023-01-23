//2. WAP to print Duplicates characters from the String.

public class DuplicateChar2 {

	public static void main(String[] args) {
		String str = "abcdeedcba";
		char[] ch = str.toCharArray();
		System.out.print("Duplicate character present in String : ");
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					System.out.print(ch[j] + " ");
					break;
				}
			}
		}
	}

}
