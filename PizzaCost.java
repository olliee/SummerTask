import java.util.Scanner;

public class PizzaCost
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many pizzas? ");
        int pizzas = sc.nextInt();
        
        System.out.print("Cost of one pizza: ");
        String priceRaw = sc.next();
        
        String priceClean = priceRaw.replaceAll("[^\\d.]", ""); // remove anything thats not a number. Could use substring but that's dirty.
        double price = Double.parseDouble(priceClean);
   
        System.out.print("How many sharing: ");
        int people = sc.nextInt();
        
        double finalPrice, TotalPizzaCost;
        TotalPizzaCost = price * pizzas;
        finalPrice = TotalPizzaCost / people;
        
        
        System.out.print("Each pays £" + finalPrice + " for their share.");
        
    }
}
