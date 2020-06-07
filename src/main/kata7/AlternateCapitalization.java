package main.kata7;

import java.util.Arrays;

public class AlternateCapitalization {
    public static String[] capitalize(String s){
        String[] strArray = new String[]{"",""};
        for(int i=0; i<s.length();i++){
            if(i%2==0){
                strArray[0] += s.toUpperCase().toCharArray()[i];
                strArray[1] += s.toLowerCase().toCharArray()[i];
            }else{
                strArray[0] += s.toLowerCase().toCharArray()[i];
                strArray[1] += s.toUpperCase().toCharArray()[i];
            }
        }
        return strArray;
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
