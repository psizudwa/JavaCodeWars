package main.kata5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PowerSumDigOpt {
    public static long powerSumDigTerm(int n) {
        long calculatedNumber = 0;
        List<Long> listOfSpecNumbers = new ArrayList<>();

        for (long sum =2; sum<200; sum++){
            for(int pow = 2; pow<10; pow ++){
                calculatedNumber = (long)Math.pow(sum, pow);
                if(sumDig(calculatedNumber) == sum){
                    listOfSpecNumbers.add(calculatedNumber);
                    Collections.sort(listOfSpecNumbers);
                    if(listOfSpecNumbers.size()==n){
                        System.out.println(listOfSpecNumbers);
                    }
                }
            }
        }
        return listOfSpecNumbers.get(n-1);
    }
    public static int sumDig(long number){
        int sum = 0;
        while(number != 0){
            sum += (number % 10);
            number/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n =15;
        System.out.println(PowerSumDigOpt.powerSumDigTerm(n));
    }
}
