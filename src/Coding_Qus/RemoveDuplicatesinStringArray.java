package Coding_Qus;

import java.util.Arrays;
import java.util.List;
//Remove duplicates in List of Strings using java8
public class RemoveDuplicatesinStringArray {
	
	public static void main(String args[]) {
		List<String> stringArray =Arrays.asList("parvathi","surya","eshaan","parvathi");
		
		//using java8
		
		List<String> uniqueList = stringArray.stream().distinct().toList();
		System.out.println("Using Java8 "+uniqueList);
		
	}

}
