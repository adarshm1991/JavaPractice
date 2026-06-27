package org.example.array;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class SecondLargestElementArray {
    public static void main(String[] args) {
         int[] array = {1,2,6,4,5,3};

         int largest = findLargest(array);

         System.out.println("Largest Element of Array is "+ largest);
        }

        static int findLargest(int[] array) {
           int max = array[0];
           int arrLen = array.length;

           for (int i =1; i < arrLen ; i++) {
               if (max < array[i]) {
                   max = array[i];
               }
           }
           return max;

        }
    }
