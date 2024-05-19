import java.util.Scanner;

public class seriesProblem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int[] intArray = new int[100];

        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int sum=a+1*b;
            intArray[0]=sum;
            int value;
            for(int j=1;j<n;j++){
                int val= (int) Math.pow(2, j);
                intArray[j]=intArray[j-1]+(val*b);
             }
            for(int k=0;k<n;k++) {
                System.out.print(intArray[k]+" ");
            }
            System.out.println();
        }
    }
}
