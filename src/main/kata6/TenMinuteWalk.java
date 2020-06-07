package main.kata6;

public class TenMinuteWalk {
    public static boolean isValid(char[] walk) {
        int x = 0;
        int y = 0;
        for (char ch : walk){
            switch (ch){
                case 'n': y++;
                break;
                case 's': y--;
                break;
                case 'w': x--;
                break;
                case 'e': x++;
                break;
            }
        }
        return (x == 0) && (y == 0) && (walk.length == 10);
    }

    public static void main(String[] args) {
        System.out.println(TenMinuteWalk.isValid(new char[] {'n','s','n','s','n','s','n','s','n','s'}));
    }
}
