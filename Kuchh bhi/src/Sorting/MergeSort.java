package Sorting;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args){
        int[] array = {25,10 ,2,8,15};

        merge(array,0,array.length-1 );
        System.out.println(Arrays.toString(array));
    }

    private static void merge(int[] array, int low, int heigh) {
        if(low<heigh) {
            int mid = (low + heigh) / 2;

            merge(array, low, mid);
            merge(array, mid + 1, heigh);
            mergeSort(array, 0, heigh, mid);
        }
    }

    private static void mergeSort(int[] array, int low, int heigh, int mid) {

        int i=0;
        int j=mid+1;
        int k=0;
        int[] temp=new int[array.length];
        while(i<=mid && j<=heigh){
            if(array[i]<array[j]){
                temp[k++]= array[i];
                i++;
            }
            else{
                temp[k++]= array[j];
                j++;
            }
        }

        while(i<=mid){
            temp[k++]= array[i];
            i++;
        }
        while(j<heigh){
            temp[k++]= array[j];
            j++;
        }

        for(int l=0; l<=temp.length;l++){
            array[l]=temp[l];
        }
    }
}
