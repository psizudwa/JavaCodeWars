package main.kata7;

public class VowelCount {
    public static int getCount(String str) {
        int vowelsCount = 0;
        char[] inputString = str.toCharArray();
        String dict = "aeiou";
        for (char ch : inputString){
            if (dict.contains(""+ch)){
                vowelsCount++;
            }
        }
        return vowelsCount;
    }

    public static void main(String[] args) {
        System.out.println(VowelCount.getCount("abaerc"));

    }
}
