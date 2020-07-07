package com.company;

public class Main {
    public static void main(String[] args) {
        int []arr = {4, 12, 7, 8, 1, 6, 9};
        int index = minValue(arr);
        System.out.println("The smallest element in the array is: " + arr[index]+ " At position " + (index + 1));
    }

    public static int minValue(int[] array){
        int min = array[0];
        int indexMin = 0;
        for (int i = 0;i < array.length;i++) {
            if (min > array[i]) {
                indexMin = i;
            }
        }
        return indexMin;
    }
}
