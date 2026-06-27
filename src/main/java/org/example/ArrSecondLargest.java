package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ArrSecondLargest {
    public static void main(String[] args) {
         int[] array = {1,40,15,9,24,96};

         int secondLargest = findSecondLargest(array);

         System.out.println("Second Largest Element of Array is "+ secondLargest);
        }

        static int findSecondLargest(int[] array) {
          int max =0,secMax = 0;
          if (array[0] < array[1]) {
              max = array[1];
              secMax = array[0];
          } else {
              max = array[0];
              secMax = array[1];
          }
          int arrLen = array.length;

           for (int i =2; i < arrLen ; i++) {
               if (max < array[i]) {
                   secMax = max;
                   max = array[i];
               } else if (array[i] > secMax && array[i] < max) {

                   secMax = array[i];
               } else {
                   continue;
               }
           }
           return secMax;

        }
    }
