package main.kata7;

import java.util.HashSet;
import java.util.Set;

public class Isograms {
    public static boolean  isIsogram(String str) {
        HashSet<String> tempSet = new HashSet<>();
        //str.toLowerCase().chars().distinct().count(); через stream
        for(char ch : str.toLowerCase().toCharArray()){
            tempSet.add(""+ch);
        }
        return str.length() == tempSet.size();
    }

    public static void main(String[] args) {
        System.out.println(Isograms.isIsogram("Dermatoglyphic"));
    }
}
