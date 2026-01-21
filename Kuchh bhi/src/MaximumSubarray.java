import java.util.*;

public class MaximumSubarray {


//    Deque rules:
//
//    Remove indices out of the current window
//
//    Remove smaller elements from the back
//
//    Front of deque = maximum of current window

// example [2,1,5,1,3,2] k=3  output = [ 5,5,5,3]

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 1, 4, 5, 2, 3, 6};
        int k = 3;

        int[] output = new int[arr.length-k+1];

        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < arr.length; i++) {

            //remove the indexes that are out of current window from the front
           while( deque.size()>0 && deque.peekFirst()<= i-k){
               deque.pollFirst();
           }

            while( deque.size()>0 && arr[deque.peekLast()]< arr[i]){
                deque.pollLast();
            }
            //insert the element
            deque.offerLast(i);

            //once you got the window remove the elemnt and store in array
            if(i>=k-1){
                output[i-k+1] = arr[deque.peekFirst()];
            }
        }

        System.out.println(Arrays.toString(output));
    }
}
