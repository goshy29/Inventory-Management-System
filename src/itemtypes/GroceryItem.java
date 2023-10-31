package itemtypes;

import interfaces.Perishable;

import java.io.Serializable;

public class GroceryItem extends InventoryItem implements Perishable, Serializable {
    public GroceryItem(String name, String category, String description, boolean breakable,
                       boolean perishable, double price, int id, int quantity) {
        super(name, category, description, breakable, perishable, price, id, quantity);
    }

    @Override
    public String getItemDetails() {
        return String.format("%d. Item: %s, Category: %s, Price: %.2f",
                getId(), getName(), getCategory(), getPrice());
    }

    @Override
    public double calculateValue() {
        return calculateValue();
    }

    @Override
    public String getItemDescription() {
        return getItemDescription();
    }
}
