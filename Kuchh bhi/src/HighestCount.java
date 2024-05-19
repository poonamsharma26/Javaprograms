import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

import static java.lang.System.exit;


public class HighestCount {
    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);
        String word =in.nextLine();
        word = word.toUpperCase();
        int count=1;
        HashMap<Character,Integer> hashmap =new HashMap<>();

        if(word.split(" ").length>1){
            System.out.println("please give single word");
            exit(0);
        }
        else {
            char[] charArray= word.toCharArray();
            for(char i: charArray) {
                if (hashmap.containsKey(i)) {
                    hashmap.put(i, hashmap.get(i)+1 );
                } else {
                    hashmap.put(i,count);
                }}
        }

        Integer maxEntry = hashmap.entrySet().stream()
                .max(Map.Entry.comparingByValue()).get().getValue();


               List<Character> resultChars= hashmap.entrySet().stream()
                        .filter(a->a.getValue()==maxEntry)
                        .map(e -> e.getKey()).collect(Collectors.toList());


        System.out.println("Character with highest number of occurance are below ");
            for (Character j : resultChars) {

                System.out.println(j);
        }
    }
    }


