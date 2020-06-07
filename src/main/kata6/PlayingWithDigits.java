package main.kata6;

public class PlayingWithDigits {
    public static long digPow(int n, int p) {
        String str = ""+n;
        long result =0;
        for(char ch: str.toCharArray()){
            result += Math.pow(Character.getNumericValue(ch),p);
            p++;
        }
        return result%n==0 ? result/n : -1;
    }

    public static void main(String[] args) {
        System.out.println(PlayingWithDigits.digPow(89,1));
    }
}
