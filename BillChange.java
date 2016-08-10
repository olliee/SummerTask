import java.text.DecimalFormat;
import java.util.Scanner;

public class BillChange
{
    
    public static void main (String[] args)
    {
        DecimalFormat df = new DecimalFormat("##0.00");
        Scanner sc = new Scanner(System.in); // requires System.in
        double bill = Math.random() * 100;
        System.out.println("bill = $" + df.format(bill));
        System.out.print("payment: $"); //looks tidy without the new line.
        double payment = sc.nextDouble(); // needs to be defined as a double
        System.out.println("change = $" + df.format(payment - bill)); // minus bill from payment, not plus.
    }
    
}