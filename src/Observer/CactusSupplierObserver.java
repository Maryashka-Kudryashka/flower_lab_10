package Observer;
import Decorators.Item;
import Enum.*;
import Flowers.Cactus;
import Main_pac.*;

import java.util.LinkedList;

public class CactusSupplierObserver extends YourObserver {
    private Observable subject;
    public CactusSupplierObserver(Observable subject) {
        this.subject = subject;
        subject.add_Item(this);
    }

    @Override
    public void update() {
        System.out.println("Cactus123");
    }
}
