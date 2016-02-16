package Assignment4;

/**
 * Finish all the assignments. Try Bonus.
 * 
 * @author Yang
 */

public class Assignment4 {
	// Assignments
	/**
	 * 1. Given a string s consists of upper/lower-case alphabets and empty
	 * space characters ' ', return the length of last word in the string. If
	 * the last word does not exist, return 0. Note: A word is defined as a
	 * character sequence consists of non-space characters only.
	 */
	public int lengthOfLastWord(String str) {
		if (str == null) {
			return 0;
		}
		String[] ss = new String[str.length()];
		ss = str.split(" ");
		if (ss.length == 0) {
			return 0;
		} else {
			int i = ss[ss.length - 1].length();
			return i;
		}
	}

	/**
	 * 2. Reverse a string by letters. Do not use 'split' function. e.g.
	 * "I like soccer" --> "reccos ekil I"
	 */
	public String reverseString1(String str) {    //way 1
		if (str == null) {
			return null;
		}
		char[] array = str.toCharArray(); // String --> char[]
		int i = 0;
		int j = str.length() - 1;
		while (i < j) {
			char t = array[i];
			array[i] = array[j];
			array[j] = t;
			i++;
			j--;
		}
		return String.valueOf(array); // char[] --> String
	}
	/*public String reverseString1 (String str) {   //way 2
		if (str == null) {
			return null;
		}
		String result = "";
		for(int i=str.length()-1; i>=0; i--){
			result += str.charAt(i);
		}
		return result;
	}*/

	/**
	 * 3. Reverse a string by words. Do not use 'split' function. e.g.
	 * "I like soccer" --> "soccer like I"
	 */
	public String reverseString2(String str) { 

		if (str == null) {
			return null;
		}
		String result = "";
		int end = str.length() - 1;
		for (int begin = str.length() - 1; begin >= 0; begin--) {
			if (str.charAt(begin) != ' ' && begin != 0) {
				continue;
			}
			if (begin == 0) {
				result += " ";
			}
			for (int i = begin; i <= end; i++) {
				result += str.charAt(i);
			}
			end = begin - 1;
		}
		return result.trim();
	}

	/**
	 * 4. Count how many words in a string. Numbers are regarded as a word. Do
	 * not use 'split' function. e.g. "I like soccer" --> 3. "I have 15 dollars"
	 * --> 4
	 */
//input "hellow ", output 2. And think about ESC, what if input is "I am\nstudent".                -2
	public int countWords(String str) {
		if (str == null) {
			return 0;
		}
		if (str.trim().length() == 0) {
			return 0;
		} else {
			char[] array = str.toCharArray();
			int result = 0;
			for (int i = 0; i < array.length; i++)
				if (String.valueOf(array[i]).equals(" "))
					result++;
			return result + 1;
		}
	}

	/**
	 * 5. Capitalize the first letters of words in a String. Do not use 'split'
	 * function. e.g. "I like soccer" --> "I Like Soccer".
	 */
//if the input has a ' ' at the end, like "I like soccer     ", line 122 will have a 'out of bound' error.           -1
	public String capitalizeLetters(String str) {
		if (str == null) {
			return null;
		} else {
			char[] array = str.toCharArray();
			for (int i = 0; i < array.length; i++) {
				if (String.valueOf(array[i]).equals(" ")) {
					String temp = String.valueOf(array[i + 1]).toUpperCase();
					array[i + 1] = temp.charAt(0);
				}
			}
			return String.valueOf(array);
		}

	}

	/**
	 * 6. Use enum to represent the type of vehicles, like Bus, Motorcycle,
	 * Sedan, SUV, Truck...
	 */
	enum Type {
		Bus, Motorcycle, Sedan, SUV, Truck
	}

	/**
	 * 7. Define a vehicle class. Use suitable encapsulation. Use the enum you
	 * defined to represent the types. There is no standard answer for this
	 * question, but you need create necessary attributes for this class, and
	 * methods if needed.
	 */
	static class Vehicles { //because Vehicles is an inner class, so it needs to add the "static"
		private Type type;
		private Color color;
		private Volume volume;

		enum Color {
			Red, Bule, Yellow, Black
		}

		enum Volume {
			Small, Medium, Large, VeryLarge
		}
	}

	class Purchase {
		boolean isPotentialVIP(Guest guest, Vehicles vehicles) {
			Gender g = guest.gender;
			Assignment4.Vehicles.Color c = vehicles.color; // color is a default class in Java to set color of GUI or character
			Type t = vehicles.type;
			if (g == Gender.Female && c == Assignment4.Vehicles.Color.Red && t == Type.SUV) {
				return true;
			}
			return false;
		}
	}

	class Guest {
		private int money = 5000; // encapsulation
		Gender gender;

		int getMoney() { // getMoney
			return money;
		}
	}

	enum Gender {
		Male, Female
	}

	// Bonus
	/**
	 * 8. Count and Say. Count each character. e.g. "aabacbaa" --> "5a2b1c"
	 */
//please maintain the A~Z sequence. and try to find a faster algorithm.
	public String countAndSay(String str) {
		if (str == null) {
			return null;
		}
		String result = "";
		char[] ch = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			int counter = 0;
			char c = str.charAt(i);
			for (int j = 0; j < str.length(); j++) {
				if (c == ch[j]) {
					counter++;
					ch[j] = ' '; // count one, turn one into ' '
					// System.out.println(ch);
				}
			}
			if (counter > 0) {
				result += "" + counter;
				result += "" + c;
			}
		}
		return result;
	}

	/**
	 * 9. Compare version number. If equal, return 0. if larger, return 1. if
	 * smaller, return -1. You could use library functions of Integer and
	 * String, like parseInt, split. e.g. "1.2.3" VS "1.2.0" --> 1. "1.2" VS
	 * "1.2.0" --> 0. "100.200" VS "200.100" --> -1.
	 */
	public int compareVersion(String v1, String v2) {
		String[] v1s = v1.split("\\.");
		String[] v2s = v2.split("\\.");
		int length = Math.max(v1s.length, v2s.length);
		for (int i = 0; i < length; i++) {
			int v1Num = i < v1s.length ? Integer.parseInt(v1s[i]) : 0;
			int v2Num = i < v2s.length ? Integer.parseInt(v2s[i]) : 0;
			if (v1Num > v2Num) {
				return 1;
			}
			if (v1Num < v2Num) {
				return -1;
			}
		}
		return 0;
	}
}
