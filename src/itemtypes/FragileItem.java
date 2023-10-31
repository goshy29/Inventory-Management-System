package itemtypes;

import interfaces.Breakable;

import java.io.Serializable;

public class FragileItem extends InventoryItem implements Breakable, Serializable {
    private String name;
    private String category;
    private String description;
    private boolean breakable;
    private boolean perishable;
    private double price;
    public FragileItem(String name, String category, String description, boolean breakable,
                           boolean perishable, double price, int id, int quantity) {
        super(id, quantity);
        this.name = name;
        this.category = category;
        this.description = description;
        this.breakable = breakable;
        this.perishable = perishable;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getCategory() {
        return category;
    }

    @Override
    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean isBreakable() {
        return breakable;
    }

    public void setBreakable(boolean breakable) {
        this.breakable = breakable;
    }

    public boolean isPerishable() {
        return perishable;
    }

    public void setPerishable(boolean perishable) {
        this.perishable = perishable;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
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
        return this.description;
    }
}
