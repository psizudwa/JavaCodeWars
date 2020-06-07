package main.kata6;

public class BinaryToText {
    public static String binaryToText(String binary) {
        StringBuilder outputString = new StringBuilder("");
        for (int i = 0, pos = 0; i < binary.length() / 8; i++, pos += 8) {
            outputString.append((char) Integer.parseInt(binary.substring(pos, pos + 8), 2));
        }
        return outputString.toString();
    }

    public static void main(String[] args) {
        String s = "0100100001100101011011000110110001101111";
        System.out.println(BinaryToText.binaryToText(s));
    }
}