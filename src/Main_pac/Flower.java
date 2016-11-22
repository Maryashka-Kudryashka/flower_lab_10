package Main_pac;

import Enum.*;
public abstract class Flower {

    protected Flower_Special special;
    protected boolean fresh;
    protected double price;


    public Flower(boolean fresh, double price, FlowerColor color, double lenght, FlowerType type) {
        this.special = new Flower_Special(color, lenght, type);
        this.fresh = fresh;
        this.price = price;

    }

    public FlowerType getType() {
        return special.getType();
    }

    public double getPrice() {
        return price;
    }
    public double getLenght() {
        return special.lenght;
    }
    public FlowerColor getColor() {
        return special.getColor();
    }
    public boolean isFresh() {
        return fresh;
    }


    public String toString() {
        return "Type: " + getType() + " price is " + String.valueOf(getPrice()) + " its color is " + getColor() + " fresh leve is " + String.valueOf(isFresh()) + " its height " + String.valueOf(getLenght());
    }

}