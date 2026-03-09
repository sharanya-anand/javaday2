package module6;
import java.util.*;

public class LongSubarray {
    public static void main(String[] args) {

        int[] arr = {1,2,3,1,1,1,1};
        int k = 3;

        HashMap<Integer,Integer> map = new HashMap<>();

        int sum = 0;
        int maxLen = 0;
        int start = -1;
        int end = -1;

        for(int i = 0; i < arr.length; i++){

            sum += arr[i];

            if(sum == k){
                maxLen = i + 1;
                start = 0;
                end = i;
            }

            if(map.containsKey(sum - k)){
                int prev = map.get(sum - k);

                if(i - prev > maxLen){
                    maxLen = i - prev;
                    start = prev + 1;
                    end = i;
                }
            }

            if(!map.containsKey(sum))
                map.put(sum, i);
        }

        System.out.print("Longest Subarray: ");
        for(int i = start; i <= end; i++){
            System.out.print(arr[i] + " ");
        }
    
    }
}
     