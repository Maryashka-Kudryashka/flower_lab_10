package Observer;
import Decorators.Item;
import Main_pac.*;

public abstract class YourObserver{

    protected Observable subject;

    public abstract void update(FlowerBucket flower);
}