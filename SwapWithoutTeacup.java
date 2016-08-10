import java.util.Scanner;

public class SwapWithoutTeacup
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x,y;
        System.out.print("int x: ");
        x = sc.nextInt();
        
        System.out.print("int y: ");
        y = sc.nextInt();
        
        x = x + y;
        y = x - y;
        x = x - y;
        
        System.out.println("After swap, x = " + x + " and y = " + y);
        
    }
}