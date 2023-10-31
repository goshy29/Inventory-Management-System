package interfaces;

public abstract class AbstractItem implements Item, Categorizable, Sailable {
    public abstract String getItemDetails();
    public abstract double calculateValue();
    public abstract String getItemDescription();
}
