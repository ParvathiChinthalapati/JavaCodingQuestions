package Coding_Qus;

public class ExceptionWithReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		a=get(a);
		System.out.println(a);
		}

		static int get(int a) {
			try {
				a=20;
				System.out.println("TRY");
				return a;
				}
			catch(Exception e) {
				a=80;
				System.out.println("CATCH");
				return a;
			}
			finally {
				a=90;
				System.out.println("FINALLY");
				//return a;
			}

	}

}
