import java.util.*;
import java.util.Locale;
import java.text.NumberFormat;

public class currencyFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        printCurrency(payment);
        scanner.close();
    }

    static void printCurrency(double payment) {
        Locale locale = new Locale("en", "US");
        NumberFormat formatter = NumberFormat.getCurrencyInstance(locale);
        String currency = formatter.format(payment);
		System.out.println("US: " + currency);
		
		locale = new Locale("en", "IN");
		formatter = NumberFormat.getCurrencyInstance(locale);
        currency = formatter.format(payment);
		 System.out.println("India: " + currency);
		 
		locale = Locale.CHINA;
        formatter = NumberFormat.getCurrencyInstance(locale);
        currency = formatter.format(payment);
		System.out.println("China: " + currency);
		
		locale = Locale.FRANCE;
        formatter = NumberFormat.getCurrencyInstance(locale);
        currency = formatter.format(payment);
		System.out.println("France: " + currency);
    }
}