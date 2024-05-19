import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static java.lang.System.exit;


public class Palindrome {
    public static void main(String[] args) throws IOException {


        String str = "madam";
        List<Character> strA = new ArrayList();
        List<Character> strB = new ArrayList();

        for (int i = 0; i <=str.length()-1; i++) {
            strA.add(i, str.charAt(i));
        }

        for (int i = str.length() - 1, j = 0; i >= 0; i--, j++) {
            strB.add(j, str.charAt(i));
        }

        for(int k=0 ;k<=strA.size()-1;k++){
         if(strA.get(k)==strB.get(k)){
             continue;
         }else{
             System.out.println("No");
             exit(0);
         }

        }
        System.out.println("Yes");
    }
}

