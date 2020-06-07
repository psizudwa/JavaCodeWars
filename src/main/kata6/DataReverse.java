package main.kata6;

import java.util.*;

public class DataReverse {
    public static int[] DataReverse(int[] data) {
        int dataLength = data.length;
        int[] reserved = new int[dataLength];
        for(int i=0; i<dataLength;i+=8){
            System.arraycopy(data, i, reserved, dataLength-8-i, 8);
        }
        return reserved;
    }

    public static void main(String[] args) {
        int[] data = {1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,1,0,1,0,1,0};
        System.out.println(Arrays.toString(DataReverse.DataReverse(data)));
    }
}
