package itemtypes;

import interfaces.AbstractItem;

public class InventoryItem extends AbstractItem {

    private int id;
    private int quantity;

    public InventoryItem(String name, String category, String description, boolean breakable,
                         boolean perishable, double price, int id, int quantity) {
        super(name, category, description, breakable, perishable, price);
        this.id = id;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String getItemDetails() {
        return toString();
    }

    @Override
    public double calculateValue() {
        return getPrice() * quantity;
    }

    @Override
    public String getItemDescription() {
        return getDescription();
    }


    @Override
    public void sale(double price) {

    }
}
