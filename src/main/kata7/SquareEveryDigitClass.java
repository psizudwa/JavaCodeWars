package main.kata7;

//    Welcome. In this kata, you are asked to square every digit of a number.
//    For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1.
//    Note: The function accepts an integer and returns an integer

public class SquareEveryDigitClass {

    public int squareDigits(int n) {
        String s = "" + n;
        StringBuilder s2 = new StringBuilder();
        char [] c = s.toCharArray();
        int temp;
        for (char value : c) {
            temp = Integer.parseInt(String.valueOf(value));
            s2.append(temp*temp);
        }
        return Integer.parseInt(String.valueOf(s2));
    }

    public static void main(String[] args) {
        SquareEveryDigitClass squareEveryDigitClass = new SquareEveryDigitClass();
        System.out.println(squareEveryDigitClass.squareDigits(9119));
    }


}

