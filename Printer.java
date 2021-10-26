
import java.util.Scanner;

public class Printer
{
   private int[] qty;
   private String[] items;
   private double tax = 0.07;
   private double[] price;
   private double subtotal;
   private double total;
   public Printer(int[] quantity, String[] stuffname, double Ttax, double[] Price, double Total, double Subtotal)
   {
      qty=quantity;
      items = stuffname;
      tax = Ttax;
      price = Price;
      total = Total;
      subtotal = Subtotal;
      
   }//Constructs variables from Kiosk java
   
   public void printreceipt()//method prints out header, qty, items, and price section 
   {
      
      System.out.println("\t **************************************** ");
      System.out.print("\n");
      System.out.println("\t \t" + " " +"Walmart of West Chester Ohio"); 
      System.out.print("\n");

      System.out.println("\t Qty \t Items \t \t" + " " + "\t Price");
      for(int i =0; i<5; i++)
      {
         System.out.println("\t" + qty[i] + "\t" + items[i] + "\t" + "\t" + price[i]*qty[i]);//Prints out the amount of items bought, the item name, and the item subtotal
         System.out.print("\n");
      }
      System.out.print("\n");
      System.out.println("\t" + "Subtotal: " + " " +subtotal);
      System.out.println("\t" + "Tax is: " + " " + subtotal*tax);
      System.out.println("\t" + "Total is " + " " + total);//Returns total


      System.out.print("\t **************************************** ");
      //next steps involve carrying over variables from the Kiosk file putting those into the printer file
      

     }
}
