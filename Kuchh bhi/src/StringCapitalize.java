import java.io.IOException;
import java.util.Calendar;
import java.util.Scanner;


public class StringCapitalize {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int sum= A.length()+B.length();
        System.out.println(sum);
        int val=A.compareTo(B);
        if(val<=0) System.out.println("No");
        else {
            System.out.println("Yes");
        }

        A=A.substring(0,1).toUpperCase()+A.substring(1);
        B=B.substring(0,1).toUpperCase()+B.substring(1);
        System.out.println(A+" "+B);
    }
}
