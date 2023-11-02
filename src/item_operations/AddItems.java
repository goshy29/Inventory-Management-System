package item_operations;

import itemtypes.ElectronicsItem;
import itemtypes.FragileItem;
import itemtypes.GroceryItem;
import itemtypes.InventoryItem;

import java.io.*;
import java.util.ArrayList;

public class AddItems {
    public static void addItemsToList(ArrayList<InventoryItem> items) {
        items.add(new ElectronicsItem("Laptop", "Electronics", "The best laptop ever",
                true, false, 2000.00, 1, 100));
        items.add(new ElectronicsItem("Monitor", "Electronics", "The best monitor ever",
                true, false, 500.00, 2, 500));
        items.add(new GroceryItem("Pasta", "Grocery", "The most delicious pasta ever",
                false, true, 20.00, 3, 1000));
        items.add(new GroceryItem("Spaghetti", "Grocery", "The most delicious spaghetti ever",
                false, true, 15.00, 4, 1200));
        items.add(new FragileItem("Porcelain", "Fragile", "The strongest porcelain ever",
                false, true, 30.00, 5, 1000));
        items.add(new FragileItem("Glass Cups", "Fragile", "The strongest cups ever",
                false, true, 25.00, 6, 1200));

        add(items);
    }

    public static void addNewItemToList(ArrayList<InventoryItem> items, String[] input) {
        items = UpdateItems.update();
        if (input[2].equals("Electronics")) {
            items.add(new ElectronicsItem(input[1], input[2], input[3], Boolean.parseBoolean(input[4]),
                    Boolean.parseBoolean(input[5]), Double.parseDouble(input[6]), Integer.parseInt(input[0]), Integer.parseInt(input[7])));
        } else if (input[2].equals("Grocery")) {
            items.add(new ElectronicsItem(input[1], input[2], input[3], Boolean.parseBoolean(input[4]),
                    Boolean.parseBoolean(input[5]), Double.parseDouble(input[6]), Integer.parseInt(input[0]), Integer.parseInt(input[7])));
        } else {
            items.add(new ElectronicsItem(input[1], input[2], input[3], Boolean.parseBoolean(input[4]),
                    Boolean.parseBoolean(input[5]), Double.parseDouble(input[6]), Integer.parseInt(input[0]), Integer.parseInt(input[7])));
        }

        add(items);
    }

    private static void add(ArrayList<InventoryItem> items) {
        String path = "C:\\Users\\gdobromirov\\Desktop\\Spring Boot\\sir A\\IMSSerializable.txt";
        try (FileOutputStream fos = new FileOutputStream(path);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(items);
        } catch (IOException exc) {
            exc.printStackTrace();
        }
    }
}
