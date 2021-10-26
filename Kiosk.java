


import java.util.Scanner;


public class Kiosk
{
 
    public static void main(String[] args)
     {
       System.out.println("\t Welcome to Walmart of West Chester!");
       System.out.print("\n");
       System.out.println("\t It's Spooky Season! Get your savings on!");//User interface
       int []qty = new int[5];
       String []items = new String[5];
       double tax = 0.07;
       double []price = new double[5];
       double Pricespe;
       int qtys;
       String item;
       double total;
       
     
       
       


       double subtotal=0;
        //declare all arrays, tax percentage, and also quantity and items
      
        

       for(int x =0; x<5; x++)//Loops the length of the items array. Asks user input five times for item names and stores the responses in the array
       { 
          Scanner getitem = new Scanner(System.in);
          

          System.out.print("What do you want to buy?");

          item = getitem.nextLine();
          
      
          items[x]=item;
       }
       for(int n =0; n<5; n++)
       {
		   Scanner getprice = new Scanner(System.in);
		   System.out.print("What's the price of" + " " +items[n]);
		   Pricespe = getprice.nextDouble();
		   price[n] = Pricespe;
		}
		   
		   
       for(int i =0; i<5; i++) //Does the same thing as previous loop but stores qtys inputs into array qty
       {
          do
          {
            Scanner scan = new Scanner(System.in);
            System.out.print("How many" + " " + items[i]+ " " + "you want?");
            qtys = scan.nextInt();
            qty[i] = qtys;
          }while(qty[0]>9 || qty[1]>9 || qty[2]>9 || qty[3]>9 || qty[4]>9);//limits the input to less than 9
          
          
       }
       
       subtotal = qty[0]*price[0]+qty[1]*price[1]+qty[2]*price[2]+qty[3]*price[3]+qty[4]*price[4];// calculates the subtotal
       
       System.out.println(subtotal);
       total = subtotal + (subtotal*tax);
       Printer print = new Printer(qty, items, tax, price, total, subtotal);//Brings variables from Printer java
       print.printreceipt();// initialize and call method from printer class
      
       

    }


}
//
