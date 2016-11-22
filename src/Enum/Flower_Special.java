package Enum;

public class Flower_Special {
    protected FlowerColor color;
    public double lenght;
    protected FlowerType type;

    public Flower_Special(FlowerColor color, double lenght, FlowerType type) {
        this.color = color;
        this.lenght = lenght;
        this.type = type;
    }

    public FlowerType getType() {
        return type;
    }


    public FlowerColor getColor() {
        return color;
    }
}