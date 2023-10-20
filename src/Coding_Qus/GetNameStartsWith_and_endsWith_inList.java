package Coding_Qus;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

//In list of strings get a unique string which starts with character "p" ends with character "i" using java8.
public class GetNameStartsWith_and_endsWith_inList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> namesList = new ArrayList<String>();
		
		namesList.add("parvathi");
		namesList.add("sai");
		namesList.add("eshaan");
		namesList.add("parvathi");
		
		List<String> finalList = namesList.stream().distinct().filter(c->c.startsWith("p") && c.endsWith("i")).collect(Collectors.toList());
		System.out.println(finalList);
		

	}

}
