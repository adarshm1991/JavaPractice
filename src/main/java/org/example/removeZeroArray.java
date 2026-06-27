package org.example;

import java.util.Arrays;

public class removeZeroArray {
    public static void main(String[] args) {
        //System.out.println("Hello World");

        int[] zeroArr = {1,0,58,2,0,0,25};
        int[] arr = getRemoveZeroArray(zeroArr);

        System.out.println(Arrays.toString(arr));

    }
    static int[] getRemoveZeroArray(int[] zeroArr) {
        int zero_index = -1;
        int nonzero_index = -1;
        int swap = 0;

        for (int i =0 ; i < zeroArr.length;i++) {
            if(zeroArr[i] == 0) {
                zero_index = i;
            }
            if(zeroArr[i] > 0){
                nonzero_index = i;
            }
            if(zero_index != -1 && nonzero_index != -1 && zero_index < nonzero_index) {
                zeroArr[zero_index] = zeroArr[nonzero_index];
                zeroArr[nonzero_index] = 0;
                zero_index = -1;
                nonzero_index = -1;
                i = nonzero_index;
            }
        }

        return zeroArr;
    }
}
