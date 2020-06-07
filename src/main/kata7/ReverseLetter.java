package main.kata7;

public class ReverseLetter {
    public static String reverseLetter(final String str) {
        StringBuffer stringBuffer = new StringBuffer(str);
        return stringBuffer.reverse().toString().replaceAll("\\d|\\W|_","");
    }

    public static void main(String[] args) {
        System.out.println(ReverseLetter.reverseLetter("ultr53o?n"));
    }
}
