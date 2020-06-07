package main.kata7;
import java.util.ArrayList;

public class PeopleInTheBus {
    public static int countPassengers(ArrayList<int[]> stops) {
        int result =0;
        for (int[] iter : stops) {
            result += iter[0] - iter [1];
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
