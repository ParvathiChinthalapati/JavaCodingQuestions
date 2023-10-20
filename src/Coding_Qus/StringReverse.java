package Coding_Qus;

public class StringReverse {
//Print Revere string without predefined functions
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "parvathi";
		char nameArr[] = name.toCharArray();
		StringBuffer reverseName = new StringBuffer();

		for (int i = nameArr.length - 1; i >= 0; i--) {

			reverseName.append(nameArr[i]);
			

		}
		System.out.println("reverese " + reverseName);
	}

}
