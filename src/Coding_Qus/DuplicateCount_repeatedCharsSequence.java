package Coding_Qus;

/* Given a string with repeated char sequence and expected output would be 5A2B2C2A1B */
public class DuplicateCount_repeatedCharsSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 1;
		String duplicate = "AAAAAABBCCAAB";
		char currentChar = duplicate.charAt(0);
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < duplicate.length(); i++) {
			if (duplicate.charAt(i) == currentChar) {
				count++;

			} else {
				sb.append(count).append(currentChar);
				currentChar = duplicate.charAt(i);
				count = 1;
			}

		}
		sb.append(count).append(currentChar);
		System.out.println("" + sb);
	}

}
