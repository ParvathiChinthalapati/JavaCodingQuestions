package Coding_Qus;
/*Printing leap years from 1900 to 2050 */
public class LeapYear {

	public static void main(String[] args) {
		System.out.println("Printing leap years from 1900 to 2050");
		for(int i=1900;i<=2050;i++) {
			
			if(((i%4 == 0) && (i%100 != 0)) || (i%400 == 0)) {
				System.out.println(" "+i);
			}
			
		}
	}

}
