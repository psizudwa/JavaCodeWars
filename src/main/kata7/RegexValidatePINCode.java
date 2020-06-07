package main.kata7;

public class RegexValidatePINCode {
    public static boolean validatePin(String pin) {
        char [] inputPIN = pin.toCharArray();
        String result = "";
        String dict ="0123456789";
        for (char ch : inputPIN){
            if (dict.contains(""+ch)){
                result += ch;
            }
        }
        return((result.length() == 4) | (result.length() == 6)) && result.equals(pin) ? true : false;
    }

    public static void main(String[] args) {
        System.out.println(RegexValidatePINCode.validatePin("12a34"));

    }
}
