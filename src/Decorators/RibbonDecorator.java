package Decorators;

public class RibbonDecorator extends ItemDecorator {

    public RibbonDecorator(Item itm) {
        super(itm);
    }

    public String  getDescription(){
        return "This is ribbon decorator: " + item.toString() ;
    }

    public double price(){
        return 40 + item.price();
    }
}
