package Coding_Qus;
/* Result Explanation: In Java, when you create an Integer object using autoboxing for small integers, like in your code where 
 * num1 and num2 are set to 100, or num3 and num4 are set to 500, the JVM uses a cache for frequently 
 * used values in the range from -128 to 127 (inclusive). 
 * This is why num1 and num2 refer to the same cached object for the integer 100, resulting in the first 
 * if condition being true. However, for values outside this cached range, as in the case of 500, 
 * new objects are created, so num3 and num4 refer to different objects, causing the second if 
 * condition to be false.
 * 
 * In Java, there is a concept called "boxing" and "caching" of certain primitive values when they are wrapped in their corresponding wrapper classes. This caching mechanism is done for performance reasons to improve memory usage and execution speed.

 * The range from -128 to 127 is a common optimization range used by the JVM for caching Integer 
 * objects. This means that Integer objects in this range are effectively reused, and when you 
 * create an Integer object within this range, the JVM will give you a reference to an existing 
 * object rather than creating a new one. This is also true for other primitive wrapper types like 
 * Byte, Short, Long, Character, and Boolean.
 * */
 
public class Guess_Output3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer num1 = 100;
		Integer num2 = 100;
		Integer num3 = 500;
		Integer num4 = 500;
		
		if(num1 == num2) {
			System.out.println("num1==num2");
		}else {
			System.out.println("num1!=num2");
		}
		if(num3 == num4) {
			System.out.println("num3==num4");
		}else {
			System.out.println("num3!=num4");
		}

	}

}
