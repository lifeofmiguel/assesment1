package question1;

public class Main {
        public static void getTotal (String product, int miles, int qty, double price){
            if(miles >= 0 && miles <= 4){
                double totalPrice = qty*price+2;
                System.out.println("Product: " + product);
                System.out.println("Qty: " + qty);
                System.out.println("Price: $" + price);
                System.out.println("Miles: " + miles);
                System.out.println("=============");
                System.out.println("Total: $" + totalPrice);
                System.out.println(" ");
            }else if(miles >= 5 && miles <= 15){
                double totalPrice = qty*price+5;
                System.out.println("Product: " + product);
                System.out.println("Qty: " + qty);
                System.out.println("Price: $" + price);
                System.out.println("Miles: " + miles);
                System.out.println("=============");
                System.out.println("Total: $" + totalPrice);
                System.out.println(" ");
            }
            else if(miles >= 16 && miles <= 25){
                double totalPrice = qty*price+10;
                System.out.println("Product: " + product);
                System.out.println("Qty: " + qty);
                System.out.println("Price: $" + price);
                System.out.println("Miles: " + miles);
                System.out.println("=============");
                System.out.println("Total: $" + totalPrice);
                System.out.println(" ");
            }
            else if(miles >= 25 && miles <= 50){
                double totalPrice = qty*price+15;
                System.out.println("Product: " + product);
                System.out.println("Qty: " + qty);
                System.out.println("Price: $" + price);
                System.out.println("Miles: " + miles);
                System.out.println("=============");
                System.out.println("Total: $" + totalPrice);
                System.out.println(" ");
            }
            else if(miles >= 50){
                double totalPrice = qty*price+20;
                System.out.println("Product: " + product);
                System.out.println("Qty: " + qty);
                System.out.println("Price: $" + price);
                System.out.println("Miles: " + miles);
                System.out.println("=============");
                System.out.println("Total: $" + totalPrice);
                System.out.println(" ");
            }
        }

    public static void main(String[] args) {
        getTotal("Rice", 10, 20, 5.0);
        getTotal("Beans", 30, 10, 2.0);
    }
}
/*

    ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	     Distance 	   = Fee
    +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	     0 -  4 miles  = $2
	     5 - 15 miles  = $5
	    16 - 25 miles  = $10
	    26 - 50	miles  = $15
	More than 50 miles = $20


     Given the data below. Your should should return the value below
         ________________________________________________

Invoke the method twice with the sample data below in the exact format!

Product:Rice
Qty:20
Price $5.0
Miles:10
===============
Total: $105.0

Product:Beans
Qty:10
Price $2.0
Miles:30
===============
Total: $35.0


 */