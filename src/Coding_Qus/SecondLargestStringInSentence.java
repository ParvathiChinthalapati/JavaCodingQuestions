package Coding_Qus;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class SecondLargestStringInSentence {
    public static void main(String args[]){
        String input = "Hello! I am learning java programming.";
        String inputArr[] = input.split(" ");
        List<String> inputList = Arrays.asList(inputArr);
        HashMap<String,Long> wordMap = new HashMap<>();
        for(int i=0;i<inputList.size();i++){
            wordMap.put(inputList.get(i), (long) inputList.get(i).length());
        }
        wordMap.entrySet().stream()
                .sorted((a,b) -> b.getValue().compareTo(a.getValue()))
                .skip(1)
                .findFirst()
                .ifPresent(entry -> System.out.println("Second largest string is: " + entry.getKey()));
    }

}
