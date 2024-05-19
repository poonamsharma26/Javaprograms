import java.util.Scanner;

public class ExceptionProblem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int breadth = sc.nextInt();
        int height = sc.nextInt();
        try {
            if (breadth < 0 || height < 0) {
                throw new Exception("Breadth and height must be positive");
            } else {
                System.out.print(breadth * height);
            }
        } catch (Exception e) {
            System.out.print(e);
        }
    }
}
