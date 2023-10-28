package interfaces;

public abstract class AbstractItem implements Item, Categorizable, Sailable {
    private String name;
    private String category;
    private String description;
    private boolean breakable;
    private boolean perishable;
    private double price;

    public AbstractItem(String name, String category, String description, boolean breakable, boolean perishable, double price) {
        this.name = name;
        this.category = category;
        this.description = description;
        this.breakable = breakable;
        this.perishable = perishable;
        this.price = price;
    }

    public abstract String getItemDetails();
    public abstract double calculateValue();
    public abstract String getItemDescription();

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
