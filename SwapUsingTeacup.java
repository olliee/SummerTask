import java.util.Scanner;

public class SwapUsingTeacup
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x, y, temp;
        System.out.print("int x: ");
        x = sc.nextInt();
        System.out.print("int y: ");
        y = sc.nextInt();
        
        temp = x;
        x = y;
        y = temp;
        
        System.out.print("After swap, x = " + x + " and y = " + y);
    }
}