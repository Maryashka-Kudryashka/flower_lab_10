package Main_pac;

import Decorators.*;
import Delivery.*;
import Payment.*;
import Observer.*;
import java.util.ArrayList;
import java.util.List;


import java.util.LinkedList;

public class Order implements Observable {

    LinkedList<Item> items = new LinkedList<Item>();
    IPayment payment;
    IDelivery delivery;
    private List<YourObserver> observers = new ArrayList<YourObserver>();

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

    @Override
    public void add_Item(YourObserver o) {
        observers.add(o);
    }

    @Override
    public void remove_Item(YourObserver o) {
        observers.remove(o);
    }

    public void notify_all_observers(){
        for (YourObserver user: observers){
            user.update();
        }
    }
}
