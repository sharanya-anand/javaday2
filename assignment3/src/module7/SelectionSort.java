
package module7;

import java.util.Arrays;

public class SelectionSort {
 
    public static void SelectionSort(int[] arr){
        for (int i=0;i< arr.length-1;i++){
            int minIndex = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            if(minIndex != i){
                int temp = arr[i];
                arr[i]=arr[minIndex];
                arr[minIndex]=temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,7,3,7,9,4};
        System.out.println(Arrays.toString(arr));
        SelectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

    