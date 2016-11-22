package Payment;

public class CreditCardPaymentStrategy implements IPayment {

    public void pay(double price){
        System.out.println("You paid: " + price + "\n");
    }
}

