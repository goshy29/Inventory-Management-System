package item_operations;

import itemtypes.InventoryItem;

import java.util.ArrayList;

public class SortItems {
    public static void sort(ArrayList<InventoryItem> items, int menuIndex) {
        if (menuIndex == 1) {
            for (var item: items) {
                if (item.getCategory().equals("Electronics")) {
                    System.out.println(item.getItemDetails());
                }
            }
        } else if (menuIndex == 2) {
            for (var item: items) {
                if (item.getCategory().equals("Grocery")) {
                    System.out.println(item.getItemDetails());
                }
            }
        }
        else {
            for (var item: items) {
                if (item.getCategory().equals("Fragile")) {
                    System.out.println(item.getItemDetails());
                }
            }
        }
    }
}
