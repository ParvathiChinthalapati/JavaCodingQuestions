package Coding_Qus;

import java.util.*;
import java.util.stream.Collectors;

/*
Let's Consider the sentence "My Name is Parvathi. My Company is Techblocks.
print each word with frequency.
output would be My - 2, Name - 1, is - 2, parvathi - 1, company - 1, Techblocks - 1
 */
public class PrintWordsCount {
    public static void main(String args[]) {
        String inputStatement = "My Name is Parvathi. My Company is Techblocks.";
        StringTokenizer str = new StringTokenizer(inputStatement, " ");
        List<String> wordsList = new ArrayList<>();
        HashMap<String, Integer> countMap = new HashMap<>();

        while (str.hasMoreTokens()) {
            wordsList.add(str.nextToken());
        }

        //before java8
        for (String token : wordsList) {
            if (countMap.containsKey(token)) {
                countMap.put(token, countMap.get(token) + 1);
            } else {
                countMap.put(token, 1);
            }
        }
        for (Map.Entry entry : countMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
        System.out.println("************* Using Java8 *********************");
        //Using Java8
        Map<String, Long> countMap1 = wordsList.stream().collect(Collectors.groupingBy(word -> word, Collectors.counting()));
        for (Map.Entry entry : countMap1.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
