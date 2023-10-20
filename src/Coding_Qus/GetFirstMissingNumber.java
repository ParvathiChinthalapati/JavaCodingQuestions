package Coding_Qus;

import java.util.ArrayList;
import java.util.List;
/*1. Find missing number in  input Array where array of elements incremented by 1.
 * 2.compare two arrays & print missing elements in main array
 */
public class GetFirstMissingNumber {

	public static void main(String[] args) {
	
		getFirstMissingPositiveNumber();
		getMissingNumberOfArray();

	}

	private static void getMissingNumberOfArray() {
		// TODO Auto-generated method stub
		int[] mainArray = { 1, 2, 3, 4, 5, 7, 8 };
		int[] subArray = { 3, 4, 5, 7 };
		List<Integer> subArrayList = new ArrayList<Integer>();
		List<Integer> missingArrayList = new ArrayList<Integer>();

		for(int i:subArray)
			subArrayList.add(i);

		for(int i:mainArray) {
			if(!subArrayList.contains(i)) {
				missingArrayList.add(i);
			}
		}
		
		System.out.println("Missing ArrayList "+missingArrayList);
			
	}

	public static void getFirstMissingPositiveNumber() {

		int[] arr = { 1, 2, 3, 4, 5, 7, 8 };
		int n = arr.length + 1;// including missing number
		int expectedSum = (n * (n + 1)) / 2;
		int actualSum = 0;

		for (int i = 0; i < arr.length; i++) {
			actualSum += arr[i];
		}
		System.out.println("Missing Number " + (expectedSum - actualSum));

	}

}
