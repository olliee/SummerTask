import java.util.Scanner;  //package needed to read from keyboard
public class Exercise2
{
   public static void main (String[] args)
   {
       //declare Scanner and integer variables
       Scanner sc = new Scanner(System.in);
       int allMonths, years, partMonths;
       
       //ask for age in months
       System.out.print("Age in months: ");
       
       //set allMonths to value typed in
       allMonths = sc.nextInt();
       
       //System.out.print(allMonths); - debugging
       
       //calculate years from allMonths
       years = allMonths / 12;
       
       //calculate partMonths from allMonths
       partMonths = allMonths - (years * 12);
       
       //display message about calculated years and months
       System.out.print(allMonths + " = " + years + " years and " + partMonths + " months.");
   }//end main
}//end class
