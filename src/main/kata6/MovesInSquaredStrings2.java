package main.kata6;

import main.kata7.MovesInSquaredString;

import java.util.Arrays;
import java.util.function.Function;

public class MovesInSquaredStrings2 {
    public static String rot(String strng) {
        String[] outputString = strng.split("\n");
        StringBuilder stringBuilder = new StringBuilder("");
        Arrays.stream(outputString)
                .map(streamElement -> new StringBuilder(streamElement).reverse().toString())
                .forEach(s -> stringBuilder.insert(0, s+"\n"));
        return stringBuilder.toString().substring(0,stringBuilder.toString().lastIndexOf("\n"));
    }
    public static String selfieAndRot(String strng) {
        StringBuilder stringBuilder = new StringBuilder("");
        StringBuilder dots = new StringBuilder("");
        for(int i=0; i < strng.indexOf("\n"); i++){
            dots.append(".");
        }
        for(String subString : strng.split("\n")) {
            stringBuilder.append(subString).append(dots).append("\n");
        }
        for(String subString : rot(strng).split("\n")) {
            stringBuilder.append(dots).append(subString);
            if(!subString.equals(rot(strng).substring(strng.lastIndexOf("\n")).replaceAll("\n",""))){
                stringBuilder.append("\n");
            }
        }
        return stringBuilder.toString();
    }
    public static String oper(Function<String,String> func, String s) {
        return func.apply(s);
    }

    public static void main(String[] args) {
        String s = "abcd\nefgh\nijkl\nmnop";
        System.out.println(MovesInSquaredStrings2.rot(s));
    }
}
