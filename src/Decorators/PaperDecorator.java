package Decorators;

public class PaperDecorator extends ItemDecorator {

    public PaperDecorator(Item itm) {
        super(itm);
    }

    public String  getDescription(){
        return "This is paper decorator: " + item.toString();
    }

    public double price(){
        return 13 + item.price();
    }
}