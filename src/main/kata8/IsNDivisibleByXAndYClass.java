package main.kata8;

public class IsNDivisibleByXAndYClass {

    public static boolean isDivisible(long n, long x, long y) {

        return (n % x == 0) && (n % y == 0);
    }

    public static void main(String[] args) {
        System.out.println(IsNDivisibleByXAndYClass.isDivisible(12,5,4));
    }
}

