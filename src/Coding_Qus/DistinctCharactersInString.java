package Coding_Qus;

import java.util.Arrays;
import java.util.List;

public class DistinctCharactersInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "PARVATHI";
		String[] array = input.split("");
		List<String> inputList = Arrays.asList(array);
		
	 inputList.stream().distinct().toList().forEach(s -> System.out.println(s));


	}

}
