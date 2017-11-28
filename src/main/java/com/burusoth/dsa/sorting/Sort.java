package com.burusoth.dsa.sorting;

public class Sort {
    public static void main(String[] args) {
        int[] array = new int[]{5, 4, 8, 1, 2, 7};
        Sort sort = new Sort();
        for(int i :sort.bubbleSort(array)){
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i :sort.modifiedBubbleSort(array)){
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i :sort.selectionSort(array)){
            System.out.print(i + " ");
        }
    }

    private int[] selectionSort(int[] array) {
        for(int i = 0; i < array.length - 1; i++){
            int index = i;
            for(int j = i + 1;j < array.length; j++){
                if(array[i] < array[index]){
                    index = j;
                }
            }
            int smallest = array[index];
            array[index] = array[i];
            array[i] = smallest;
        }
        return array;
    }

    private int[] modifiedBubbleSort(int[] array) {
        int temp = 0;
        for(int i =0; i < array.length; i++){
            boolean isSorted = true;
            for(int j=1; j < (array.length - i); j++){
                if(array[j-1] > array[j]){
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                    isSorted = false;
                }
            }
            if(isSorted)
                break;
        }
        return array;
    }

    private int[] bubbleSort(int[] array) {
        int temp = 0;
        for(int i =0; i < array.length; i++){
            for(int j=1; j < (array.length - i); j++){
                if(array[j-1] > array[j]){
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
