
import java.util.Scanner;

public class Kiosk
{
 
    public static void main(String[] args)
     {
       String store = "Walmart";
       System.out.println("\t Welcome to" + " " + store "!");
       int []qty = new int[5];
       String []items = new String[5];
       double tax = 0.07;
       int price = 1;
       int price2= 2;
       int price3 = 3;
       int price4 = 4;
       int price5=5;
       int qtys;
       String item;
       double total;

       int subtotal;
        //declare all arrays, tax percentage, and also quantity and items
        

       for(int x =0; x<5; x++)//Loops the length of the items array. Asks user input five times for item names and stores the responses in the array
       { 
          Scanner getitem = new Scanner(System.in);
          

          System.out.print("What do you want to buy?");

          item = getitem.nextLine();
          
      
          items[x]=item;
       }
       for(int i =0; i<5; i++) //Does the same thing as previous loop but stores qtys inputs into array qty
       {
          Scanner scan = new Scanner(System.in);
          System.out.print("How many" +items[i]+ "you want?");
          qtys = scan.nextInt();
          qty[i] = qtys;
          
          
       }
       subtotal = (qty[0]*price + qty[1]*price2+qty[2]*price3+qty[3]*price4 + qty[4]*price5);
       total = subtotal + (subtotal * tax);
       
       

    }


}
