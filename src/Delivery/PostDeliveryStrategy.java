package Delivery;

import Decorators.*;
import java.util.LinkedList;

public class PostDeliveryStrategy implements IDelivery {

    public String deliver(LinkedList<Item> items){
        String bouqette = "";
        for(Item bouqette1 : items){
            bouqette += bouqette1.getDescription();
        }
        return "Your bouqette was delivered by post." + "\n" + "\n" + bouqette;
    }
}