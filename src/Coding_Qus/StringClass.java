package Coding_Qus;

public class StringClass {
    public static void main(String args[]) {
        String str1 = "Hello";
        String str2 = new String("Hello");
        String str3 = new String("Hello");
        String str4 = "Hello";
        System.out.println("str1 == str2 " + (str1 == str2));
        System.out.println("str2 == str3 " + (str2 == str3));
        System.out.println("str1 == str3 " + (str1 == str3));
        System.out.println("str1 == str4 " + (str1 == str4));
    }

}
