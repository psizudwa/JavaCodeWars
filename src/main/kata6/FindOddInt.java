package main.kata6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindOddInt {
    public static int findIt(int[] a) {
        int result =0;
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.stream(a).boxed().forEach(el -> map.put(el, map.getOrDefault(el,0)+1));
        for(int key : map.keySet()){
            if(map.get(key) % 2 !=0){
                result = key;
                return result;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] intArray = {20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5};
        System.out.println(FindOddInt.findIt(intArray));
    }
}
