import java.io.IOException;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;


public class CurrencyFormatter {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        System.out.println("US: " + NumberFormat.getCurrencyInstance(Locale.US).format(payment));
        System.out.println("India: " + NumberFormat.getCurrencyInstance(new Locale("en","in")).format(payment));
        System.out.println("China: " + NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment));
        System.out.println("France: " + NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment));
    }
}
