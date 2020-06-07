package main.kata5;

import java.util.ArrayList;
import java.util.List;

public class PowerSumDig {
    public static long powerSumDigTerm(int n) {
        int sum = 0;
        double lCalculated = 0;
        long upperLimit = (long)Math.pow(10, n+1);
        List<Long> listOfSpecNumbers = new ArrayList<>();

        for(long l = 80; l<=upperLimit; l++){
            sum = sumDig(l);
            lCalculated = Math.pow(sum, Math.round(Math.log(l)/Math.log(sum)));

            if((l == lCalculated) && (sum != 1)){
                listOfSpecNumbers.add(l);
                if(listOfSpecNumbers.size()==n){
                    System.out.println(listOfSpecNumbers);
                    return listOfSpecNumbers.get(n-1);
                }
            }
        }
        return 0;
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
        int n = 10;
        long l = 27512614111L;
        long sum = sumDig(l);
        long d = (long)Math.pow(sum, Math.round(Math.log(l)/Math.log(sum)));
        System.out.println(sum);
        System.out.println(d);
        //System.out.println(powerSumDigTerm(17));
    }
}
