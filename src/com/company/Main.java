package com.company;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] array = {4, -5, 0, 6, 8};
        int max = array[0], min = array[0], maxIndex = 0, minIndex = 0;
        for (int i = 0; i< array.length; i++){
            if (max<array[i]){
                max = array[i];
                maxIndex = i;
            }
            else if (min>array[i]) {
                min = array[i];
                minIndex = i;
            }
        }
        array[maxIndex] = min;
        array[minIndex] = max;
        System.out.println(Arrays.toString(array));
    }
}