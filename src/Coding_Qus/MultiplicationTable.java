package Coding_Qus;


public class MultiplicationTable {

	public static void main(String[] args) {
	
		//print multiple tables
		System.out.println(" Printing 1 to 10 multiplication tables");
		for(int number=1;number<=10;number++)
		{
		for(int i=1;i<=10;i++) {
			System.out.println(number +" * "+i+" = "+(number*i));
		}
		System.out.println("*******************");
		}
	}

}
