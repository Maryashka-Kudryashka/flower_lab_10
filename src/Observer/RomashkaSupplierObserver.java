package Observer;

import Flowers.Romashka;
import Main_pac.*;

public class RomashkaSupplierObserver extends YourObserver {
    private Observable subject;
    public RomashkaSupplierObserver(Observable subject) {
        this.subject = subject;
        subject.add_Item(this);
    }

    @Override
    public void update(FlowerBucket bouqette) {
        System.out.println("We need: " + bouqette.search_new(new Romashka(false, 2,null,3, null)).length+ " romashka");
    }

}
