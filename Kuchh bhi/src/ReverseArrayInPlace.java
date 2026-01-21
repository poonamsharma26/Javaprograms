import java.util.Arrays;

public class ReverseArrayInPlace {

    public static void main(String[] args){
        int[] arr = {1, 2,2,3,4};
        int j=arr.length-1;
        for(int i=0;i<=j ; i++){
            int temp1 = arr[i];
            int temp2 = arr[j];
            arr[i]=temp2;
            arr[j]=temp1;
            j--;
        }

        System.out.println(Arrays.toString(arr));
    }
}
