package main.kata5;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;



public class WeightSort {
    public static String orderWeight(String strng) {
        return  Arrays.stream(strng.split(" "))
                .sorted(Comparator
                        .comparing(WeightSort::sumDigits)
                        .thenComparing(String::compareTo))
                .collect(Collectors.joining(" "));
        }

    private static Integer sumDigits(String s) {
        return s.chars().map(c -> c - 48).sum();
    }

    public static void main(String[] args) {
        String s = "1 2 200 4 4 6 6 7 7 18 27 72 81 9 91 425 31064 7";
        System.out.println(WeightSort.orderWeight(s));
    }
}
