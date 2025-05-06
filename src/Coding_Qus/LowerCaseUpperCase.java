package Coding_Qus;

import java.util.stream.IntStream;

/**
 * Write a program to convert first half of the String in lower case and second
 * half in upper case.
 **/

public class LowerCaseUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "PARVATHI";
		//Find the midpoint of the string
		int mid = input.length() / 2;

		// Split the string into two halves
		String firstHalf = input.substring(0, mid).toLowerCase();
		String secondHalf = input.substring(mid).toUpperCase();

		// Concatenate the modified halves
		String result = firstHalf + secondHalf;

		// Print the result
		System.out.println(result); // Output: parVATHI
		
		//java8
		String result1 = IntStream.range(0, input.length())
                .mapToObj(i -> {
                    if (i < mid) {
                        return Character.toLowerCase(input.charAt(i));
                    } else {
                        return Character.toUpperCase(input.charAt(i));
                    }
                })
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString();

		// Print the result
		System.out.println(result1); 
	}

}
