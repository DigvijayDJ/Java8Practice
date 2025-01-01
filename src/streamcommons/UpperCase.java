package streamcommons;

import java.util.*;
import java.util.stream.Collectors;

public class UpperCase {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ram", "Shyam", "Mohan");
        List<String> upper = names.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(upper);
        List<String> sortedNames = names.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted Names List : "+sortedNames);

        List<Integer> iList = Arrays.asList(1,2,3,4,5,6,7,8,9);
        long count = iList.stream().filter(n -> n>2).count();
        System.out.println("Count of numbers greater then 2 : "+count);

        List<Integer> ranList = Arrays.asList(1,2,1,2,6,6,9,8,0);
        List<Integer> collect = ranList.stream().distinct().collect(Collectors.toList());
        System.out.println("Distinct Elements in List   :: "+collect);

//        Find duplicate elements in list using stream
        Set<Integer> seen = new HashSet<>();
        List<Integer> duplicateElements = ranList.stream().filter(n -> !seen.add(n)).collect(Collectors.toList());
        System.out.println("Duplicate Elements : "+duplicateElements);

        List<String> fullNames = Arrays.asList("Alice Johnson", "Bob Harris",
                "Charlie Lou");
        List<String> firstNamelist = fullNames.stream().map(s -> s.split(" ")[0]).collect(Collectors.toList());
        System.out.println("First Name substrings : "+firstNamelist);


//        Count Occurrences of Each Word in a String
        String input = "apple orange banana apple apple orange banana";
        String[] inputWords = input.split(" ");

        Map<String, Long> wordCount = Arrays.stream(inputWords).collect(Collectors.groupingBy(word -> word, Collectors.counting()));
        System.out.println(wordCount);
    }
}
