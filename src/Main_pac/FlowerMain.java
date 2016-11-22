package Main_pac;

import Enum.*;
import Flowers.*;
import Delivery.*;
import Decorators.*;
import Observer.CactusSupplierObserver;
import Payment.*;


public class FlowerMain {

    public static void main(String args[]) {
        FlowerBucket bucket = new FlowerBucket();

        Flower romashka = new Romashka(true, 12, FlowerColor.BLUE, 12.5, FlowerType.ROMASHKA);
        Flower cactus = new Cactus(true, 12, FlowerColor.WHITE, 12.5, FlowerType.CACTUS);

        bucket.addFlower(cactus);
        bucket.addFlower(romashka);

        PaperDecorator paper = new PaperDecorator(bucket);
        RibbonDecorator ribbon = new RibbonDecorator(bucket);
        BasketDecorator basket = new BasketDecorator(bucket);

        Order order = new Order();
        order.addItem(paper);
        order.addItem(ribbon);
        order.addItem(basket);
        order.setDeliveryStrategy(new PostDeliveryStrategy());
        order.setPaymentStrategy(new CreditCardPaymentStrategy());

        //order.processOrder();
        CactusSupplierObserver k = new CactusSupplierObserver(order);
        order.notify_all_observers();
    }
}
