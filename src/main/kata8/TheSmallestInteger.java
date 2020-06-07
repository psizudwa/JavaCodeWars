package main.kata8;

public class TheSmallestInteger {
    public static int findSmallestInt(int[] args) {
        int minInt= args[0];
        for(int i = 1; i<args.length; i++){
            if(args[i]<minInt){
                minInt = args[i];
            }
        }
        return minInt;
    }

    public static void main(String[] args) {
    }
}
