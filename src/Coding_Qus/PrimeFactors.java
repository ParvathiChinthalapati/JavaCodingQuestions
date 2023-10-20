package Coding_Qus;
//Print all the prime factors of a given number

public class PrimeFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inputNumber = 121;
		System.out.println("Prime factors of given number are ");
		primeFactors(inputNumber);
	}

	private static void primeFactors(int n) {
		// TODO Auto-generated method stub
		while (n % 2 == 0) {
			System.out.println(" " + 2);
			n /= 2;
		}
		for (int i = 3; i <= Math.sqrt(n); i ++) {
			if (n % i == 0) {
				System.out.println(" " + i);
				n /= i;
			}
		}
		if (n > 1) {
			System.out.println(" " + n);
		}
	}

}
