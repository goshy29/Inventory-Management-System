import item_operations.AddItems;
import item_operations.ReadItems;
import item_operations.SortItems;
import itemtypes.InventoryItem;
import order.MakeOrder;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<InventoryItem> items = new ArrayList<>();
        AddItems.addItemsToList(items);
        System.out.println("Welcome to the E-commerce Console Application!");
        boolean isRunning = true;
        while (isRunning) {
            displayMenu();
            int menuIndex = Integer.parseInt(sc.nextLine());
            switch (menuIndex) {
                case 1:
                    ReadItems.read();
                    menuIndex = backMenu();
                    if (menuIndex == 9){
                        isRunning = false;
                    }
                    break;
                case 2:
                    System.out.println("Input Item id, name, category(Electronics, Grocery, Fragile), description,");
                    System.out.println("isBreakable, isPerishable, price and quantity separated by comma!");
                    String[] input = sc.nextLine().trim().split(",");
                    System.out.println("8. Save");
                    System.out.println("9. Cancel");
                    menuIndex = Integer.parseInt(sc.nextLine());
                    if (menuIndex == 8) {
                        AddItems.addNewItemToList(items, input);
                    }
                    menuIndex = backMenu();
                    if (menuIndex == 9){
                        isRunning = false;
                    }
                    break;
                case 3:
                    System.out.println("1. Electronic Items");
                    System.out.println("2. Grocery Items");
                    System.out.println("3. Fragile Items");
                    menuIndex = Integer.parseInt(sc.nextLine());
                    SortItems.sort(items, menuIndex);
                    menuIndex = backMenu();
                    if (menuIndex == 9){
                        isRunning = false;
                    }
                    break;
                case 4:
                    MakeOrder.order(items);
                    menuIndex = backMenu();
                    if (menuIndex == 9){
                        isRunning = false;
                    }
                    break;
                case 9:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid command. Please try again.");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("Menu:");
        System.out.println("1. List of Items");
        System.out.println("2. Add Item to List");
        System.out.println("3. Show by Category");
        System.out.println("4. Make Order");
        System.out.println("9. Exit");
    }

    private static int backMenu() {
        System.out.println("8. Back");
        System.out.println("9. Exit");
        Scanner sc = new Scanner(System.in);
        int menuIndex = Integer.parseInt(sc.nextLine());
        return menuIndex;
    }
}

