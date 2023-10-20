package Coding_Qus;

//Check weather the given string is palindrome or not. 
//Palindrome meaans String reverse equals to original String.
public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "racecar";
		int first = 0;
		int last = input.length() - 1;
		boolean status = checkPalindrome(input, first, last);
		if (status == true) {
			System.out.println("Given String palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
		
		
		//use predefined function
		String revString = new StringBuilder(input).reverse().toString();
		System.out.println("reverse string "+revString);
		if(input.equals(revString)){
			System.out.println("Given String palindrome");
		} else {
			System.out.println("Not Palindrome");
		
		}
	}

	private static boolean checkPalindrome(String input, int first, int last) {
		while (first < last) {
			if (input.charAt(first) != input.charAt(last)) {
				return false;
			} else {
				first++;
				last--;
				return true;
			}
		}
		return false;
	}

}
