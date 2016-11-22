package Main_pac;

import Decorators.*;
import Enum.*;

import java.util.ArrayList;

public class FlowerBucket implements Item {
    private int defaultSize = 10;

    private int insertIndex = 0; // insert, or better create method length()
    private Flower[] a = new Flower[defaultSize];

    public void addFlower(Flower nw) {
        checkSize();
        a[insertIndex] = nw;
        insertIndex ++;
    }

    private void checkSize(){
        if (insertIndex == defaultSize - 1) {
            defaultSize *= 2;
            Flower[] b = new Flower[defaultSize];
            for (int i = 0; i <= insertIndex; i ++) {
                b[i] = a[i];
            }
            a = b;
        }
    }
    public void sortByPrice() {
        for (int i = 1; i < insertIndex; i ++) {
            Flower tmp = a[i];
            int j = i - 1;
            while (j >= 0 && (a[i].getPrice() < a[j].getPrice())) {
                a[i] = a[j];
                j --;
            }
            a[j + 1] = tmp;
        }
    }
    public String toString() {
        String s = "";
        for (int i = 0; i < insertIndex; i ++) {
            s += a[i].toString() + "\n";
        }
        return s + "\n";
    }

    public double price() {
        double sum = 0;
        for (int i = 0; i < insertIndex; i ++) {
            sum += a[i].getPrice();
        }
        return sum;
    }
    public Flower[] selectFlowersByItsLength(double start, double end) {
        int tmpSize = 0;
        for (int i = 0; i < insertIndex; i++) {
            if (a[i].getLenght() <= end && a[i].getLenght() >= start ) {
                tmpSize ++;
            }
        }
        Flower[] tmpPart = new Flower[tmpSize];
        int tmpIndex = 0;
        for (int i = 0; i < insertIndex; i++) {
            if (a[i].getLenght() <= end && a[i].getLenght() >= start ) {
                tmpPart[tmpIndex] = a[i];
                tmpIndex ++;
            }
        }
        return tmpPart;
    }

    public ArrayList<Flower> getFlower(Flower_Special typ){

        ArrayList<Flower> tmp = new ArrayList<>();
        for (int i = 0; i < insertIndex; i++) {
            if (a[i].getType().equals(typ.getType())) {
                tmp.add(a[i]);
            }
        }

        return tmp;
    }

    public Flower searchFlower(Flower flower){

        ArrayList<Flower> tmp = new ArrayList<Flower>();
        for (int i = 0; i < insertIndex; i++) {
            if (a[i].getType() != flower.getType())
                continue;
            if (a[i].getColor() != flower.getColor())
                continue;
            if (a[i].getLenght() != flower.getLenght())
                continue;
            return a[i];
        }

        return null;
    }

    public Flower[] search_new(Flower flower){
        Flower[] tmp = new Flower[a.length];
        for (int i = 0; i < a.length; i++){
            if ()
        }
    }

    public String  getDescription(){
        return "This is flower bouqette ";
    }
}