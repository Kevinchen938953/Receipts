

import java.util.Scanner;

public class Kiosk
{
 
    public static void main(String[] args)
     {
       int []qty = new int[5];
       String []items = new String[5];
       double tax = 0.07;
       double price = 1.25;
       double price2= 2.2;
       double price3 = 3.3;
       double price4 = 4.4;
       double price5=5.5;
       int qtys;
       String item;
       double total;
 

       double subtotal;
        //declare all arrays, tax percentage, and also quantity and items
       String store = "Walmart";
       System.out.println("\t Welcome to" + " " + store + "!");
        

       for(int x =0; x<5; x++)//Loops the length of the items array. Asks user input five times for item names and stores the responses in the array
       { 
          Scanner getitem = new Scanner(System.in);
          

          System.out.print("What do you want to buy?");

          item = getitem.nextLine();
          
      
          items[x]=item;
       }
       for(int i =0; i<5; i++) //Does the same thing as previous loop but stores qtys inputs into array qty
       {
          do
          {
            Scanner scan = new Scanner(System.in);
            System.out.print("How many" + " " + items[i]+ " " + "you want?");
            qtys = scan.nextInt();
            qty[i] = qtys;
          }while(qty[0]>9 || qty[1]>9 || qty[2]>9 || qty[3]>9 || qty[4]>9);
          
          
       }
       
      

       subtotal = (qty[0]*price + qty[1]*price2+qty[2]*price3+qty[3]*price4 + qty[4]*price5);
       System.out.print(subtotal);
       total = subtotal + (subtotal*tax);
       
       

    }


}
