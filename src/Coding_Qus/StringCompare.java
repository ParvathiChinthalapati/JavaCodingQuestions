package Coding_Qus;

public class StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abc";
        String s2 = new String("abc");
        String s3 = "abc";
        String s4 = new String("abc");
        String s5 = new String("abc").intern();
        System.out.println(" s1 == s2 "+(s1==s2));
        System.out.println(" s1 == s3 "+(s1==s3));
        System.out.println(" s3 == s4 "+(s3==s4));
        System.out.println(" s4 == s5 "+(s4==s5));
        System.out.println(" s1 == s5 "+(s1==s5));
	}

}
