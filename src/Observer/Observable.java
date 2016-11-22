package Observer;

public interface Observable {

    public void add_Item(YourObserver o);

    public void remove_Item(YourObserver o);

    public void notify_all_observers();
}
