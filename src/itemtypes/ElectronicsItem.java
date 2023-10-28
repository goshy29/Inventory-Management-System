package itemtypes;

import interfaces.Breakable;

public class ElectronicsItem extends InventoryItem implements Breakable {
    public ElectronicsItem(String name, String category, String description, boolean breakable,
                           boolean perishable, double price, int id, int quantity) {
        super(name, category, description, breakable, perishable, price, id, quantity);
    }

    @Override
    public String getItemDetails() {
        return super.getItemDetails();
    }

    @Override
    public double calculateValue() {
        return super.calculateValue();
    }

    @Override
    public String getItemDescription() {
        return super.getItemDescription();
    }
}
