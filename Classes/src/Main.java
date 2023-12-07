
public class Main{
    public static void main(String[] args){
        ShoppingCart cart = new ShoppingCart();
        //Product toothbrush = new Product("electric toothbrush",3500);
       // Product baby alarm = new Product("baby alarm",4000);

        Product ElectricToothbrush = Catalogue.getProduct("Electrictoothbrush");
        Product BabyAlarm = Catalogue.getProduct("BabyAlarm");
      //  Product warAndPeace = Catalogue.getProduct("this is an e-book");

        //ShoppingCart cart = new ShoppingCart();

        cart.addLineItem(new LineItem(BabyAlarm, 1));
        cart.addLineItem(new LineItem(ElectricToothbrush, 1));
        //cart.addLineItem(new LineItem(warAndPeace, 1));


        System.out.println(cart);
        System.out.println("The final cost of the shopping cart is: "+ cart.getTotalCost());
            }
        }



        //Product distribution


        //Shopping cart


