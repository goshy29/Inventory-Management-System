package itemtypes;

import interfaces.AbstractItem;

import java.io.Serializable;

public class InventoryItem extends AbstractItem implements Serializable {

    private int id = 1;
    private int quantity;
    public InventoryItem() {

    }

    public InventoryItem(int id, int quantity) {
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
    public String getName() {
        return "";
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
        return "inventory item descr";
    }

    @Override
    public void sale(double price) {

    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public void setCategory(String category) {

    }

    @Override
    public String getCategory() {
        return null;
    }
}
