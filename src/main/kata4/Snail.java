package main.kata4;

import java.util.ArrayList;
import java.util.List;

public class Snail {
    public static int[] snail(int[][] array){
        List<Integer> resList = new ArrayList<Integer>();
        for(int i =0, j=array[0].length-1; i<array[0].length; i++, j--){
            for(int k=i; k<j; k++){
                resList.add(array[i][k]);
            }
            for(int k=i; k<j; k++){
                resList.add(array[k][j]);
            }
            for(int k=j; k>=i; k--){
                resList.add(array[j][k]);
            }
            for(int k=j-1; k>i; k--){
                resList.add(array[k][i]);
            }
        }
        return resList.stream().mapToInt(a->a).toArray();
    }

    public static void main(String[] args) {
        int[][] test = {
                {1,2,3},
                {4,5,6},
                {7,8,9}};
        int[] resTest = snail(test);
        for(int i : resTest){
            System.out.println(i);
        }
    }
}
