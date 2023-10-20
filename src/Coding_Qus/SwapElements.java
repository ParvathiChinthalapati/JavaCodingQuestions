package Coding_Qus;

public class SwapElements {
	/* Swap two elements with out temp variable */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 25;
		int b = 10;
		System.out.println("Before Swping a = " + a + ",b = " + b);
		// a = a + b - a;
		// b = a + b - b;
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After Swping a = " + a + ",b = " + b);
	}

}
