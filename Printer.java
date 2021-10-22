
import java.util.Scanner;

public class Printer
{
   private int []qty;
   private String []items;
   private double tax = 0.07;
   private double price = 1.25;
   private double price2= 2.2;
   private double price3 = 3.3;
   private double price4 = 4.4;
   private double price5=5.5;
   private double subtotal;
   private double total;
   public Printer(int[]quantity, String[]stuffname, double Ttax, double Price, double Price2, double Price3, double Price4, double Price5, double Total, double Subtotal)
   {
      qty=quantity;
      items = stuffname;
      tax = tTax;
      price = Price;
      price2 = Price2;
      price3 = Price3;
      price4 = Price4;
      price5 = Price5;
      Total = total;
      Subtotal = subtotal;
      
   }
   
   public void printreceipt()//method prints out header, qty, items, and price section 
   {
      public 
      System.out.println("\t **************************************** ");
      System.out.print("\n");
      System.out.println("\t \t" + " " +"Walmart of West Chester Ohio"); 
      System.out.print("\n");

      System.out.println("\t Qty \t Items \t \t" + " " + "\t Price");
      for(int i =0; i<5; i++)
      {
         System.out.println("\t" + qty[i] + "\t" + items[i]);
      }
      System.out.print("\t **************************************** ");
      //next steps involve carrying over variables from the Kiosk file putting those into the printer file
      

     }
}
