package org.example.array;

public class FrequencyElementArray {
    public static void main(String[] args) {
        int[] sortedArray = {10,10,10,10,10,10,10};

        printElementFrequencyArray(sortedArray);
    }
    static void printElementFrequencyArray(int[] sortedArray) {
        int freq = 1;
        int len = sortedArray.length;
        int i = 0;

        while ( i < len-1) {
            if( sortedArray[i] == sortedArray[i+1]) {
                ++freq;

            }
            if(sortedArray[i] != sortedArray[i+1]) {
                System.out.println(sortedArray[i] + ": element Frequency : " + freq);
                freq = 1;
            }
            ++i;
        }
        if(sortedArray[len-2] != sortedArray[len-1]) {
            freq = 1;
            System.out.println(sortedArray[len-1]+ ": element Frequency : "+freq);
        }
        if(sortedArray[len-2] == sortedArray[len-1]) {
            System.out.println(sortedArray[len-1]+ ": element Frequency : "+freq);
        }

    }
}
