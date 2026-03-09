package module6;
public class Kadane {
    static int Kadane(int[] arr){
        int cMax = arr[0];
        int gMax = arr[0];
        for ( int i=1;i< arr.length;i++){
            cMax = Math.max(arr[i],cMax+arr[i]);
            gMax = Math.max(cMax,gMax);
        }
        return gMax;
    }
    public static void main(String[] args) {
        int[] arr1 = {0,-1,-2,-3,-4,-5};
        System.out.println(Kadane(arr1));
    }
}

        
        