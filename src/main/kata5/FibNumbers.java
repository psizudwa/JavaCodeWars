package main.kata5;

import java.util.ArrayList;
import java.util.List;

public class FibNumbers {
    public static long[] productFib(long prod) {
        int n=1;
        List<Long> resultFibList = new ArrayList();
        resultFibList.add((long) 0);
        resultFibList.add((long) 1);
        if (prod == 1) {
            return new long[] {1, 1, 1};
        }
        while (resultFibList.get(n) < prod){
            resultFibList.add(resultFibList.get(n-1)+resultFibList.get(n));
            if (resultFibList.get(n)*resultFibList.get(n+1)==prod){
                return new long[]{resultFibList.get(n), resultFibList.get(n + 1), (long)1};
            } else if (resultFibList.get(n)*resultFibList.get(n+1)>prod){
                return new long[]{resultFibList.get(n), resultFibList.get(n + 1), (long)0};
            }else
                n++;
        }
        return new long[0];
    }

    public static void main(String[] args) {
        System.out.println(FibNumbers.productFib(1)[0]);
    }
}
