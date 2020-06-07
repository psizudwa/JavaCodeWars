package main.kata6;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateEncoder {
    static String encode(String word){
        String inputString = word.toLowerCase();
        return inputString.chars()
                .mapToObj(a-> (char)a)
                .map(a-> inputString.indexOf(a) == inputString.lastIndexOf(a) ? "(" : ")")
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        String s = "recede";
        System.out.println(DuplicateEncoder.encode(s));
    }
}
