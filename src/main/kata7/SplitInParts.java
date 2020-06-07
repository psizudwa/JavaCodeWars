package main.kata7;

public class SplitInParts {
    public static String splitInParts(String s, int partLength) {
        StringBuilder inputStr = new StringBuilder(s);
        StringBuilder resStr = new StringBuilder();
        while (inputStr.length()!=0){
            if (inputStr.length() > partLength) {
                resStr.append(inputStr.substring(0, partLength)+" ");
                inputStr.delete(0, partLength);
            } else {
                resStr.append(inputStr.substring(0, inputStr.length()));
                return ""+resStr;
            }
        }
        return ""+resStr;
    }

    public static void main(String[] args) {
        System.out.println(SplitInParts.splitInParts("supercalifragilisticexpialidocious",3));
    }
}
