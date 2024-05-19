import java.util.Scanner;

public class EOFProblem {
    public static void main(String[] args) {

        Scanner  sc    = new Scanner(System.in);
        int i=1;
        while(sc.hasNext()){
            String value=sc.nextLine();
            System.out.println(i+" "+value);
            i++;
        }
        sc.close();
    }
}
