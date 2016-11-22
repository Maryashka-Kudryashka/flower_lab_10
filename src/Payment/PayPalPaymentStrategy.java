package Payment;

public class PayPalPaymentStrategy implements IPayment {

    public void pay(double price){
        System.out.println("You paid: " + price + "\n");
    }
}


