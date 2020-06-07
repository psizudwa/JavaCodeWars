package main.kata6;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SimpleTransposition {
    public static String simpleTransposition(String text) {
        char[] inputText = text.toCharArray();
        StringBuilder str1 = new StringBuilder("");
        StringBuilder str2 = new StringBuilder("");
        for(int i=0; i<inputText.length; i++){
            if (i % 2 == 0){
                str1.append(inputText[i]);
            } else{
                str2.append(inputText[i]);
            }
        }
        return str1.toString()+str2.toString();
    }

    public static void main(String[] args) {
        String s = "Sample text";
        System.out.println(SimpleTransposition.simpleTransposition(s));
    }
}
