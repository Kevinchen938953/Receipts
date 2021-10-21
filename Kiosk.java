import java.io*;
Import java.util*;
Import java.util.Scanner;

Kiosk.java

public class Kiosk
{
    public static void main(String[] args){
         String store = “walmart”;
         System.out.println(“\t Welcome to” + “ “ + store + “!”);
         System.out.println(“\t Happy Halloween! It’s spooky season!”);
         String item = “oranges”;
         String item2 = “can of soup”;
         String item3 = “frozen hamburger”;
         String item4 = “vegetables”;
         String item5 = “clothes”;
         int qty;
         int qty2;
         int qty3;
         int qty4;
         int qty5;
         double price = 0.50;
         double price2 = 1.25;
         double price3 = 1.50;
         double price4 = 2.25;
         double price5 = 3.00;
         double tax = 0.07;
         Scanner getqty = new Scanner(System.in);
         double subtot;
         double tot;
         do{
                  System.out.print(“oranges qty?”);
                  qty = getqty.nextInt();
                  System.out.print(“soups qty?”);
                  qty2 = getqty.nextInt();
                  System.out.print(“burgers qty?”);
                  qty3 = getqty.nextInt();
                  System.out.print(“vegetables qty?”);
                  qty4 = getqty.nextInt();
                  System.out.print(“clothes qty?”);
                  qty5 = getqty.nextInt();
             }while(qty>9|| qty2>9 || qty3>9 || qty4>9|| qty5>9)
          public void returnsubandtot()
        {
              subtot = sub1+sub2+sub3+sub4+sub5;
              tot = subtot +(subtot*tax);

        }

        public class Printer{
           Kiosk store = Kiosk();
           store.main();
        }

