package Coding_Qus;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
/* Convert given string into uppercase & lower case & print each charecter count */
public class Test {

	public static void main(String[] args) {
		String str = "Welcome In CapgeminI";
		
		List<Character> upperCase = str.chars().mapToObj(c->(char)c).filter(c->Character.isUpperCase(c)).collect(Collectors.toList());
		System.out.println("upperCase "+upperCase);
		
		List<Character> lowerCase = str.chars().mapToObj(c->(char)c).filter(c->Character.isLowerCase(c)).collect(Collectors.toList());
		System.out.println("lowerCase "+lowerCase);
		
		Map<Character, Long> countMap = str.chars().mapToObj(c->(char)c).filter(Character::isLetter).collect(Collectors.groupingBy(c->c, Collectors.counting()));
		
		Iterator<Entry<Character, Long>> itr = countMap.entrySet().iterator();
		while(itr.hasNext()) {
			Entry<Character, Long> entry = itr.next();
			System.out.println("char "+entry.getKey()+" ="+entry.getValue());
		}

	}

}
