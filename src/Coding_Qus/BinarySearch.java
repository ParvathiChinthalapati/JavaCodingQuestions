package Coding_Qus;

import java.util.Arrays;
/*
 * Here's a step-by-step explanation of how binary search works:

1.Start with the entire sorted collection.

2.Find the middle element of the collection.

3.Compare the middle element with the target element you're looking for.

4.If the middle element is equal to the target element, you've found your element, and the search is complete.

5.If the middle element is greater than the target element, narrow your search to the left half of the collection because the target element, if it exists, must be on the left side.

6.If the middle element is less than the target element, narrow your search to the right half of the collection because the target element, if it exists, must be on the right side.

7.Repeat steps 2-6 until the element is found or the search interval becomes empty (i.e., there are no more elements to search).
*/

public class BinarySearch {

	public static void main(String[] args) {

		int[] inputArray = { 56, 23, 90, 41, 678, 21, 19, 10, 28 };
		System.out.println("Before sorting ");
		for (int i = 0; i < inputArray.length; i++) {
			System.out.print(inputArray[i] + ",");
		}
		Arrays.sort(inputArray);
		System.out.println("After sorting ");
		for (int i = 0; i < inputArray.length; i++) {
			System.out.print(inputArray[i] + ",");
		}

		int searchEle = 90;

		int elePosition = binarySearch(inputArray, 0, inputArray.length, searchEle);

		if (elePosition <= 0) {
			System.out.println("Element not found");
		} else {
			System.out.println(searchEle + " found at position " + elePosition);
		}
	}

	public static int binarySearch(int[] inputArray, int start, int end, int searchEle) {
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (inputArray[mid] == searchEle)
				return mid;
			else if (inputArray[mid] < searchEle) {
				start = mid + 1;
			} else
				end = mid - 1;
		}
		return -1;

	}

}
