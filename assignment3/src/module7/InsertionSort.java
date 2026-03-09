package module7;

import java.util.Arrays;

public class InsertionSort {

 
    public static void Insertionsort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int temp = arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>temp){
                 
                arr[j+1] = arr[j];
              j--;
            }
            arr[j+1] =temp;
        }
    }
    public static void main(String[] args) {
        int arr[]={5,7,3,7,9,4};
        System.out.println(Arrays.toString(arr));
        Insertionsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    }


