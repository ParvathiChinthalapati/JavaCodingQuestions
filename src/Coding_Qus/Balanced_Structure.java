package Coding_Qus;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/* Check if given List of strings is balanced structure or un balanced structure
 * balanced means open braces should match with closed braces even its not following in sequence
 * if open braces not matched with closed braces then consider its an unbalanced structure
 * 
 * System.out.println(isBalanced(("{","{","{","}","}","}") ? "YES" : "NO"); // YES
 * System.out.println(isBalanced("{","}","{","}","{","}") ? "YES" : "NO"); // Yes 
 * System.out.println(isBalanced("{","{","{","}","{","}") ? "YES" : "NO"); // No 
 * System.out.println(isBalanced("{","}","{","}","{","{") ? "YES" : "NO"); // NO
 */
public class Balanced_Structure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> inputList = Arrays.asList("{", "}", "{", "}", "{", "{");

		Stack<String> stack = new Stack<String>();

		for (int i = 0; i < inputList.size(); i++) {
			stack.push(inputList.get(i));
		}
		boolean isBalanced = isBalanced(inputList);
		System.out.println("isBalanced " + isBalanced);
	}

	public static boolean isBalanced(List<String> inputList) {
		Map<String, String> braces = new HashMap<>();

		braces.put("{", "}");

		Stack<String> halfBraces = new Stack<String>();
		// travel halfBraces until openings are found and compare with
		// remaining if the closings matches

		for (int i = 0; i < inputList.size(); i++) {
			if (braces.containsKey(inputList.get(i))) {
				halfBraces.push(braces.get(inputList.get(i)));
			}
			// if stack is empty or if closing bracket is not equal to top of stack,
			// then braces are not balanced
			else if (halfBraces.isEmpty() || inputList.get(i) != halfBraces.pop()) {
				return false;
			}
		}
		return halfBraces.isEmpty();
	}
}
