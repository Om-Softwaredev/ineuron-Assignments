//4. WAP to count the number of consonants, vowels, special characters in a String.
public class CountCVS4 {

	public static void main(String[] args) {
		String s1 = "om@ineuron";
		int cons = 0;
		int vow = 0;
		int spec = 0;

		for (int i = 0; i < s1.length(); i++) {

			char ch = s1.charAt(i);

			if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
				ch = Character.toLowerCase(ch);

				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
					vow++;
				else
					cons++;
			} else
				spec++;
		}
		System.out.println("Total no of consonents in \"" + s1 + "\" is:" + cons);
		System.out.println("Total no of vowels in \"" + s1 + "\" is:" + vow);
		System.out.println("Total no of special character in \"" + s1 + "\" is:" + spec);

	}

}
