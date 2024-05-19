import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class longestCharacterReplacement {
    public static void main(String[] args)  {
        String s = "PXQXYXA";
        int k=2;

        int[] occurence = new int[26];
        int left=0,right, maxoccurence =0, ans=0;

        for ( right=0; right<s.length()-1; right++){

            maxoccurence = Math.max(maxoccurence , ++occurence[s.charAt(right)-'A']);
            if(right-left+1 - maxoccurence > k ){
                left++;
                occurence[s.charAt(left)-'A']--;
            }
            ans= Math.max(ans, right-left+1);
        }
            System.out.println("sting length" +ans);
        }
    }

