package Delivery;

import Decorators.*;
import java.util.LinkedList;

public interface IDelivery {
    public String deliver(LinkedList<Item> items);
}