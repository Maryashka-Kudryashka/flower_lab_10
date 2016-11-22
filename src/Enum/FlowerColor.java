package Enum;

public enum FlowerColor {
    RED, WHITE, PURPLE, BLUE;
    public String toString(){
        switch (this){
            case RED:
                return "Red";
            case WHITE:
                return "White";
            case PURPLE:
                return "Purple";
            case BLUE:
                return "Blue";
            default:
                return "Non color flower";
        }
    }
}