import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArraysDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> list = findDuplicates(new int[]{3 ,1 ,2});
        System.out.println(list);
    }

    public static ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        Arrays.sort(arr);
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : arr){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        ArrayList<Integer> listOfDuplicates = new ArrayList<>();

        for(Integer key: map.keySet()){
            if(map.get(key)>=2){
                listOfDuplicates.add(key);
            }
        }
        return listOfDuplicates;
    }
}
