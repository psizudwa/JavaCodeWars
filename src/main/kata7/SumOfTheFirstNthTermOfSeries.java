package main.kata7;

import java.math.BigDecimal;

public class SumOfTheFirstNthTermOfSeries {
    public static String seriesSum(int n) {
        if (n == 0) return "0.00";
        else {
            float result = 0;
            for (int i = 0; i < n; i ++) {
                result += (1 / (float) (1 + i*3));
            }
            BigDecimal result2 = new BigDecimal(0);
            result2 = BigDecimal.valueOf(result);

            return ""+ result2.setScale(2, BigDecimal.ROUND_HALF_UP);
        }
    }

    public static void main(String[] args) {
        System.out.println(SumOfTheFirstNthTermOfSeries.seriesSum(18));
    }
}
