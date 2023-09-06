package collections;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Arrays;

public class StreamRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        List<Integer> squares = numbers.stream().map(number -> number * number).collect(Collectors.toList());
        List<Integer> cubes = numbers.stream().map(number -> number * number * number).collect(Collectors.toList());

        System.out.println(numbers);
        System.out.println(squares);
        System.out.println(cubes);
    }
}
