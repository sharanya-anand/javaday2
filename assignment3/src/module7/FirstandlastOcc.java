package module7;
public class FirstandlastOcc {
    public static int FirstOcc(int[] arr, int key) {
        int s = 0;
        int e = arr.length - 1;
        int ans = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == key) {
                //Store the index & move to the extreme left for ist occ
                ans = mid;
                e = mid - 1;

            } else if (arr[mid] < key) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return ans;
    }
    public static int LastOcc(int[] arr,int key)
    {
        int s = 0;
        int e = arr.length - 1;
        int ans = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == key) {
                //Store the index & move to the extreme left for ist occ
                ans = mid;
                s= mid + 1;

            } else if (arr[mid] < key) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,3,4,5,6};
        int f=FirstOcc(arr,3);
        int l=LastOcc(arr,3);
        
        System.out.println("First Occrrence Index: "+ f);
        System.out.println("Last Occurrence Index: "+l);
       
    }
}


  