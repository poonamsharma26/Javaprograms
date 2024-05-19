import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class StringOperation {
    public static void main(String[] args) throws IOException {
        String smallest = "";
        String largest = "";

        String str = "welcometojava";

        List<String> evenNumbers = new ArrayList<>();


        for (int i = 0; i < str.length(); i++) {
            if (i + 3 <= str.length()) {
                evenNumbers.add(str.substring(i, i + 3));
            }
        }

             System.out.println(evenNumbers.get(0));
             System.out.println(evenNumbers.get(evenNumbers.size()-1));
        }


    }

