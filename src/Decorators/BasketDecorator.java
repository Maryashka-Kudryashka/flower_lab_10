package Decorators;

public class BasketDecorator extends ItemDecorator {

    public BasketDecorator(Item itm) {
        super(itm);
    }

    public String  getDescription(){
        return "This is basket decorator: " + item.toString();
    }

    public double price(){
        return 4 + item.price();
    }
}