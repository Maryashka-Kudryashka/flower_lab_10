package Main_pac;

import Decorators.*;
import Delivery.*;
import Payment.*;

import java.util.LinkedList;

public class Order {

    LinkedList<Item> items = new LinkedList<Item>();
    IPayment payment;
    IDelivery delivery;

    public Order(){
    }

    public void setPaymentStrategy(IPayment _payment){
        payment = _payment;
    }

    public void setDeliveryStrategy(IDelivery _delivery){
        delivery = _delivery;
    }

    public double calculateTotalPrice(){
        double price1 = 0;
        for(int i =0; i < items.size(); i++){
            price1 += items.get(i).price();
        }
        return price1;
    }

    public void processOrder(){
        payment.pay(calculateTotalPrice());
        System.out.println(delivery.deliver(items));
    }

    public void addItem(Item b){
        items.add(b);
    }

    public void removeItem(Item b){
        items.remove(b);
    }
}
