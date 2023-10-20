package Coding_Qus;
/*Guess the output */
public class Guess_Output2 {

	int a;

	public Guess_Output2(int a) {

		this.a = a;

	}

	public int add()

	{

		a = a + 10;

		try

		{

			a = a + 10;

			try

			{

				a = a * 10; // a=300

				throw new Exception();

			} catch (Exception e) {

				a = a - 10;
				System.out.println("a " + a);

			}

		} catch (Exception e)

		{

			a = a - 10;

		}

		return a;

	}

	public static void main(String args[])

	{

		Guess_Output2 c = new Guess_Output2(10);

		int result = c.add();

		System.out.println("result = " + result);

	}

}


