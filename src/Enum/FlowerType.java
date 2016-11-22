package Enum;

public enum FlowerType {
    ROMASHKA, MAK, CACTUS, TULPAN;
    public String toString(){
        switch (this){
            case ROMASHKA:
                return "Flowers.Romashka";
            case MAK:
                return "Mak";
            case CACTUS:
                return "Flowers.Cactus";
            case TULPAN:
                return "Tulpan";
            default:
                return "Non type flower";
        }
    }


}