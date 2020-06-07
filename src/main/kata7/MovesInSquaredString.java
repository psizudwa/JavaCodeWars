package main.kata7;

import java.util.function.Function;

public class MovesInSquaredString {
    private static StringBuilder tempString = new StringBuilder("");
    private static StringBuilder outputString = new StringBuilder("");

    public static String vertMirror (String strng) {
        for(String strTemp : strng.split("\n")){
            tempString.append(strTemp);
            tempString.reverse();
            if(!strTemp.equals(strng.substring(strng.lastIndexOf("\n")).replaceAll("\n",""))){
                tempString.append("\n");
            }
            outputString.append(tempString);
            tempString.setLength(0);
        }
        return outputString.toString();
    }

    public static String horMirror (String strng) {
        for(String strTemp : strng.split("\n")){
            tempString.append(strTemp);
            if(!strTemp.equals(strng.substring(0, strng.indexOf("\n")).replaceAll("\n",""))){
                tempString.append("\n");
            }
            outputString.insert(0, tempString);
            tempString.setLength(0);
        }
        return outputString.toString();
    }
    public static String oper(Function<String,String> func, String s) {
        return func.apply(s);
    }

    public static void main(String[] args) {
        String s = "abcd\nefgh\nijkl\nmnop";
        String r ="";
        System.out.println(MovesInSquaredString.oper(MovesInSquaredString::horMirror, s));
    }
}


