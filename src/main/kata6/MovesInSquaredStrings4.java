package main.kata6;

import java.util.Arrays;
import java.util.function.Function;

public class MovesInSquaredStrings4 {
    public static String rot90Counter(String strng) {
        String[] inputStrArray = strng.split("\n");
        int n = inputStrArray[1].length();
        StringBuilder result = new StringBuilder("");
        StringBuilder[] tempStrBuilderArray = new StringBuilder[n];
        for(int i =0; i<n;i++) {
            tempStrBuilderArray[i] = new StringBuilder("");
        }
        for(int i =0; i<n;i++) {
            for(int j=0; j<n; j++){
                tempStrBuilderArray[j].append(inputStrArray[i].toCharArray()[n-1-j]);
            }
        }
        for(StringBuilder str: tempStrBuilderArray){
            result.append(str).append("\n");
        }
        return result.deleteCharAt(result.length()-1).toString();
    }

    public static String diag2Sym(String strng) {
        String[] inputStrArray = rot90Counter(strng).split("\n");
        int n = inputStrArray[1].length();
        StringBuilder result = new StringBuilder("");
        StringBuilder[] tempStrBuilderArray = new StringBuilder[n];
        for(int i =0; i<inputStrArray.length; i++){
            tempStrBuilderArray[i] = new StringBuilder(inputStrArray[i]);
            tempStrBuilderArray[i].reverse().append("\n");
            result.append(tempStrBuilderArray[i]);
        }
        return result.deleteCharAt(result.length()-1).toString();
    }

    public static String selfieDiag2Counterclock(String strng) {
        String[] rawStrArray = strng.split("\n");
        String[] rot90CounterArray = rot90Counter(strng).split("\n");
        String[] diag2SymArray = diag2Sym(strng).split("\n");
        StringBuilder result = new StringBuilder("");
        for(int i=0; i<rawStrArray.length; i++){
            result.append(rawStrArray[i]).append("|")
                    .append(diag2SymArray[i]).append("|")
                    .append(rot90CounterArray[i]).append("\n");
        }
        return result.deleteCharAt(result.length()-1).toString();
    }

    public static String oper(Function<String,String> func, String s) {
        return func.apply(s);
    }

    public static void main(String[] args) {
        String s = "abcd\nefgh\nijkl\nmnop";
        System.out.println(MovesInSquaredStrings4.oper(MovesInSquaredStrings4::selfieDiag2Counterclock,s ));
    }

}
