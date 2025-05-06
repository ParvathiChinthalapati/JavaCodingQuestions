package Coding_Qus;

/* Given a string with repeated char sequence and expected output would be 5A2B2C2A1B */
public class DuplicateCount_repeatedCharsSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 1;
		String input = "AAAAAABBCCAAB";
		char currentChar = input.charAt(0);
		StringBuilder sb = new StringBuilder();
		for(int i=1;i<input.length();i++) {
			if(currentChar == input.charAt(i)) {
				count++;
			}else {
				sb.append(count).append(currentChar);
				count=1;
				currentChar = input.charAt(i);
			}
		}
		sb.append(count).append(currentChar);
		System.out.println("result: "+sb);

	}

}
