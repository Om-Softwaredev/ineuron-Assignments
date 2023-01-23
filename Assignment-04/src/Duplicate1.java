// 1. WAP to remove Duplicates from a String.(Take any String ex with duplicates character)
public class Duplicate1 {

	public static void main(String[] args) {
		String str = "abbcadcbefgacd";
		String str2 = "";
		System.out.println("String with Duplicate: " + str);
		for (int i = 0; i < str.length(); i++) {
			int flag = 0;
			for (int j = 0; j < str2.length(); j++) {
				if (str.charAt(i) == str2.charAt(j)) {
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				str2 += str.charAt(i);
			}
		}
		System.out.println("String without Duplicate: " + str2);
//		System.out.println(str2);

	}

}
