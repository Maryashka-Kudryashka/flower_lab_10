package Observer;

import Flowers.Cactus;
import Main_pac.*;

public class CactusSupplierObserver extends YourObserver {
    private Observable subject;
    public CactusSupplierObserver(Observable subject) {
        this.subject = subject;
    }

    @Override
    public void update(FlowerBucket bouqette) {
        System.out.println("We need: " + bouqette.search_new(new Cactus(false, 2,null,3, null)).length+ " cactuses");
    }

}
