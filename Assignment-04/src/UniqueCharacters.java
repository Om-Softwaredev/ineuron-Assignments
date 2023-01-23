//7. WAP to find if String contains all unique characters.
public class UniqueCharacters {

	public static void main(String[] args) {
		String str = "Omprakash";
		boolean flag = true;

		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j))
					flag = false;
			}
		}
		if (flag == true) {
			System.out.println("\"" + str + "\" contains unique characters.");
		} else {
			System.out.println("\"" + str + "\" contains duplicate characters.");
		}
	}

}
