import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithSumK {

    public static void main(String[] args){
        int[] arr = {10,5,2,7,1,-10} ;
        int k= 15;

        int res = 0;
        int prefixSum = 0;
        Map<Integer,Integer> map = new HashMap<>();

        for( int i=0; i< arr.length; i++){
            prefixSum+=arr[i];

            if(prefixSum == k ){
                res = i+1;
            }
            else if( map.containsKey(prefixSum-k) ){
                res = Math.max(res, i-map.get(prefixSum-k));
            }
           if(!map.containsKey(prefixSum-k) ){
              map.put(prefixSum, i);
           }
        }
        System.out.println(res);
    }
}
