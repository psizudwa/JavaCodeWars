package main.kata6;

import java.util.function.Function;

public class MovesInSquaredStrings3 {
    public static String diag1Sym(String strng) {
        String[] arrayStr = strng.split("\n");
        StringBuilder[] outputStr = new StringBuilder[strng.indexOf("\n")];
        StringBuilder result = new StringBuilder("");
        for(int i=0; i<strng.indexOf("\n");i++){
            outputStr[i]=new StringBuilder("");
            for(int j=0; j<strng.indexOf("\n");j++){
                outputStr[i].append(arrayStr[j].toCharArray()[i]);
            }
            result.append(outputStr[i].append("\n"));
        }
        return ""+result.deleteCharAt(result.length()-1);
    }
    public static String rot90Clock(String strng) {
        StringBuilder tempString = new StringBuilder("");
        StringBuilder outputString = new StringBuilder("");
        String inputStr = diag1Sym(strng);
        for(String strTemp : inputStr.split("\n")){
            tempString.append(strTemp);
            tempString.reverse();
            if(!strTemp.equals(inputStr.substring(inputStr.lastIndexOf("\n")).replaceAll("\n",""))){
                tempString.append("\n");
            }
            outputString.append(tempString);
            tempString.setLength(0);
        }
        return outputString.toString();
    }
    public static String selfieAndDiag1(String strng) {
        String[] strArray = strng.split("\n");
        String[] diagSymArray = diag1Sym(strng).split("\n");
        StringBuilder resStrBuilder = new StringBuilder("");
        for(int i=0; i<strArray[0].length();i++){
            resStrBuilder.append(strArray[i]).append("|").append(diagSymArray[i]).append("\n");
        }
        return ""+resStrBuilder.deleteCharAt(resStrBuilder.length()-1);
    }
    public static String oper(Function<String,String> func, String s) {
        // your code and complete ... before operator
        return func.apply(s);
    }

    public static void main(String[] args) {
        String s = "abcd\nefgh\nijkl\nmnop";
        System.out.println(MovesInSquaredStrings3.oper(MovesInSquaredStrings3::selfieAndDiag1,s));
    }

}
