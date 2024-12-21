package streamcommons;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOdd {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNum = numbers.stream().filter(x -> x%2 == 0).collect(Collectors.toList());
        System.out.println(evenNum);

        int max = evenNum.stream().max(Integer::compare).get();
        System.out.println(max);

        int sum = evenNum.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);


    }
}