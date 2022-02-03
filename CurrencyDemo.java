import java.util.Scanner;
import java.util.Locale;
import java.text.NumberFormat;

public class CurrencyDemo {
  public static void main(String[] args) {
    int items;
    double itemCost, total;

    Scanner input = new Scanner(System.in);
    System.out.print("# items");
    items = input.nextInt();
    System.out.print("Cost per item");

    itemCost = input.nextDouble();
    total = items * itemCost;
    System.out.println();

    System.out.println("Unformatted total: " + total);
    NumberFormat currencyFmt = NumberFormat.getCurrencyInstance(Locale.FRANCE);
    System.out.println("Formatted Total: " + currencyFmt.format(total));





  }

}
