package streamcommons;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EvenOdd {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNum = numbers.stream().filter(x -> x%2 == 0).collect(Collectors.toList());
        System.out.println(evenNum);

        int max = evenNum.stream().max(Integer::compare).get();
        System.out.println(max);

        int sum = evenNum.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);

        List<Integer> newList1 = IntStream.range(1, 20).filter(x -> x % 2 == 0).boxed().collect(Collectors.toList());
        System.out.println(newList1);

        List<Integer> primeList = IntStream.rangeClosed(1,50).filter(EvenOdd::isPrime).boxed().collect(Collectors.toList());

        System.out.println("Prime List in range : "+primeList);

    }

    public static boolean isPrime(int num){
        if(num<+1){
            return false;
        }
        else {
            return IntStream.rangeClosed(2, (int)Math.sqrt(num)).allMatch(n-> num%n != 0);
        }
    }
}