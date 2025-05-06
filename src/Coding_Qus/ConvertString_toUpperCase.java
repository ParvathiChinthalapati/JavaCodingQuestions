package Coding_Qus;

import java.util.ArrayList;
import java.util.List;

//Convert list of strings to Upper case/ Lower case using java8

public class ConvertString_toUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strList = new ArrayList<>();
		strList.add("parvathi");
		strList.add("surya");
		strList.add("eshaan");

		List<String> uppercaseList = strList.stream().map(name -> name.toUpperCase()).toList();
		System.out.println("uppercaseList " + uppercaseList);
		
		List<String> lowercaseList = uppercaseList.stream().map(String::toLowerCase).toList();
		System.out.println("lowercaseList " + lowercaseList);
	}

}
