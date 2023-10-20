package Coding_Qus;
//Guess the output
public class PassByValue {
	public static void modifyValue(int num) {
	    num = 10;
	}

	public static void main(String[] args) {
	    int x = 5;
	    modifyValue(x);
	    System.out.println(x); // Output: 5 (unchanged)
	}

}
