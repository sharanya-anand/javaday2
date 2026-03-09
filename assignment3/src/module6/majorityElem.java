package module6;
public class majorityElem {

       
    public static void main(String[] args) {
        int[] arr ={2,2,7,7,7,7,2};
        int candiadte = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(count==0){
                candiadte = arr[i];
            }
            if(arr[i]==candiadte){
                count++;
            }else{
                count--;
            }
        }
        System.out.println("majority element: "+ candiadte);
    }
}

  