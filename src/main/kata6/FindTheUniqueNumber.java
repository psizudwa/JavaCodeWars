package main.kata6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindTheUniqueNumber {
    public static double findUniq(double arr[]) {
        double result = 0;
        List<Double> dList = Arrays.stream(arr).boxed().collect(Collectors.toList());
        for(Double dnum : dList){
            if(dList.indexOf(dnum) == dList.lastIndexOf(dnum)){
                result = dnum;
                return result;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        double[] d = { 1, 1, 1, 2, 1, 1 };
        System.out.println(FindTheUniqueNumber.findUniq(d));
    }
}
