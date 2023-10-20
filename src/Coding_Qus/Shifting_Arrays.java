package Coding_Qus;

/*consider array of integers. Integer position would shift by defined number
 * if shifyBy is 2 then last 2 numbers comes first & rest follows
 */

public class Shifting_Arrays {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		int shiftBy = 3;

		// Display the original array
		System.out.print("Original array: ");
		for (int element : array) {
			System.out.print(element + " ");
		}

		// Create a temporary array to store the shifted elements
		int[] shiftedArray = new int[array.length];

		// Shift elements to the right by 'shiftBy' positions
		for (int i = 0; i < array.length; i++) {
			int newPosition = (i + shiftBy) % array.length;
			shiftedArray[newPosition] = array[i];
		}

		// Copy the shifted array back to the original array
		System.arraycopy(shiftedArray, 0, array, 0, array.length);

		System.out.println(); // Move to a new line
		// Display the shifted array
		System.out.print("Shifted array: ");
		for (int element : array) {
			System.out.print(element + " ");
		}
	}
}