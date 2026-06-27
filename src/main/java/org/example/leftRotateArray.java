package org.example;

import java.util.Arrays;

public class leftRotateArray {
    public static void main(String[] args) {
        int[] arrLeft = {1,2,3,4,5};
        int leftRotBy = 2;

        System.out.println(Arrays.toString(getLeftRotateArray(arrLeft,leftRotBy)));
    }

    static int[] getLeftRotateArray(int[] arrLeft, int leftRotBy){
        reverse(arrLeft,0,leftRotBy-1);
        reverse(arrLeft,leftRotBy, arrLeft.length-1);
        reverse(arrLeft,0, arrLeft.length-1);
        return arrLeft;

    }

    static void reverse(int[] arrLeft, int startIndex, int endIndex) {
         int swap = -1;
         while(startIndex < endIndex) {
             swap = arrLeft[startIndex];
             arrLeft[startIndex] = arrLeft[endIndex];
             arrLeft[endIndex] = swap;
             ++startIndex;
             --endIndex;
         }
    }
}
