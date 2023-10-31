package order;

import item_operations.SortItems;
import itemtypes.InventoryItem;

import java.util.ArrayList;
import java.util.Scanner;

public class MakeOrder {
    public static void order(ArrayList<InventoryItem> items) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Electronic Items");
        System.out.println("2. Grocery Items");
        System.out.println("3. Fragile Items");
        System.out.print("Choose category: ");
        int categoryIndex = Integer.parseInt(sc.nextLine());
        SortItems.sort(items, categoryIndex);
        System.out.print("Choose Item: ");
        int itemIndex = Integer.parseInt(sc.nextLine());
        System.out.print("Choose Quantity: ");
        int quantity = Integer.parseInt(sc.nextLine());
        //var item = new InventoryItem();
        for (var item: items) {
            if (item.getId() == itemIndex) {
                System.out.println(item.getItemDescription());
            }
        }
    }
}
