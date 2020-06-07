package main.kata7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FlattenAndSort {
    public static int[] flattenAndSort(int[][] array) {
        List<Integer> arrayList = new ArrayList<Integer>();
        for(int[] subArray : array){
            for (int iter : subArray){
                arrayList.add(iter);
            }
        }
        Collections.sort(arrayList);
        int[] arr = arrayList.stream().mapToInt(i->i).toArray();
        return arr;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    }
}
