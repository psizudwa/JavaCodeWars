package main.kata6;

public class LongestAlphabeticalSubstring {

    public static String longestAlpabeticalSubstring(String text) {
        StringBuilder longestString = new StringBuilder("");
        StringBuilder tempString = new StringBuilder("");
        char[] inputText = text.toCharArray();
        for(int i=0; i<inputText.length; i++){
            if(i == 0){
                tempString.append(inputText[i]);
            } else {
                if (inputText[i] >= inputText[i - 1]) {
                    tempString.append(inputText[i]);
                } else {
                    if (longestString.length() < tempString.length()) {
                        longestString.setLength(0);
                        longestString.append(tempString);
                        tempString.setLength(0);
                        tempString.append(inputText[i]);
                    } else {
                        tempString.setLength(0);
                        tempString.append(inputText[i]);
                    }
                }
            }
        }
        return longestString.length()>=tempString.length() ? longestString.toString() : tempString.toString();
    }


    public static void main(String[] args) {
        String s ="abcdeapbcdef";
        System.out.println(LongestAlphabeticalSubstring.longestAlpabeticalSubstring(s));
    }
}
