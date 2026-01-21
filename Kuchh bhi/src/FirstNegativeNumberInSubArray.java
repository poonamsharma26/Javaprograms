import java.util.*;

public class FirstNegativeNumberInSubArray {
    public static void main(String[] args) {

//        Deque rules:
//
//        Add index if current element is negative
//        Remove index if it goes out of window
//        Front of deque = first negative in current window

        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;

        ArrayList<Integer> result = new ArrayList<>();
        Deque<Integer> dq = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {

            // 1️⃣ Add index if element is negative
            if (arr[i] < 0) {
                dq.offerLast(i);
            }

            // 2️⃣ Remove indices out of window
            if (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            // 3️⃣ Window complete → add answer
            if (i >= k - 1) {
                if (dq.isEmpty()) {
                    result.add(0);
                } else {
                    result.add(arr[dq.peekFirst()]);
                }
            }
        }

        System.out.println(result);
    }
}
