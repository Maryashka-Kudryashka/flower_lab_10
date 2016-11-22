package Delivery;

import java.util.LinkedList;
import Decorators.*;

public class DHLDeliveryStrategy implements IDelivery {

    public String deliver(LinkedList<Item> items){
        String bouqette = "";
        for(Item bouqette1 : items){
            bouqette += bouqette1.getDescription();
        }
        return "Your bouqette was delivered by DHL." + "\n" + "\n" + bouqette ;
    }
}