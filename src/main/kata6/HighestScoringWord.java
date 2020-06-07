package main.kata6;

import java.util.*;
import java.util.stream.Stream;

public class HighestScoringWord {
    public static String high(String s) {
        HashMap<Character, Integer> scoreCharsTable = new HashMap<>();
        int i=1;
        for(char ch ='a'; ch<='z';ch++,i++){
            scoreCharsTable.put(ch,i);
        }
        List<String> inputList = new ArrayList<String>(Arrays.asList(s.split(" ")));
        List<Long> scoreList = new ArrayList<Long>();

        Long score;
        for(String str : inputList){
            score = 0L;
            for(char ch : str.toCharArray()){
                score+= scoreCharsTable.get(ch);
            }
            scoreList.add(score);
        }
        return inputList.get(scoreList.indexOf(Collections.max(scoreList)));
    }

    public static void main(String[] args) {
        String s = "what time are we    zzzzzzzzzzzzzzzzzzzzzzzclimbing up to the volcano";
        System.out.println(HighestScoringWord.high(s));
    }
}
