import java.util.Optional;

public class Customer {
    private final String name;
    private CreditCard creditcard;
    public Customer(String name, long ccNumber){
        this.name = name;
        this.creditcard = new CreditCard((ccNumber));
    }
    public Optional<Order> checkout(ShoppingCart cart){
        Optional<Payment> payment=creditcard.mkPayment(cart.getTotalCost());
        return payment.map(p -> new Order(this, cart,p));
    }
    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", creditcard=" + creditcard +
                '}';
    }
}