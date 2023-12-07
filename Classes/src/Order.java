public class Order{
    private final Customer customer;
    private final ShoppingCart cart;
    private final Payment payment;

    public Order(Customer customer, ShoppingCart cart, Payment payment){
        this.customer = customer;
        this.cart = cart;
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "Order{" +
                "customer=" + customer +
                ", cart=" + cart +
                ", payment=" + payment +
                '}';
    }
}



/*/public class Customer{
    public Order checkout(ShoppingCart cart){
        Payment p =
        creditCard.mkPayment(cart.getTotalCost());
        return new Order(this, cart, p);
    }}
public class ShoppingCart{
    public Order checkout(Customer cust){
        Payment p =
        cust.getCard().mkPayment(getTotalCost());
        return new Order(cust, this, p);

    }}*/