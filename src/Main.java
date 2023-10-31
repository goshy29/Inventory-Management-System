import itemtypes.ElectronicsItem;
import itemtypes.FragileItem;
import itemtypes.GroceryItem;
import itemtypes.InventoryItem;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<InventoryItem> items = new ArrayList<>();
        items.add(new ElectronicsItem("Laptop", "Electronics", "The best laptop ever",
                true, false, 2000.00, 1, 100));
        items.add(new ElectronicsItem("Monitor", "Electronics", "The best monitor ever",
                true, false, 500.00, 2, 500));
        items.add(new GroceryItem("Pasta", "Grocery", "The best pasta ever",
                false, true, 20.00, 3, 1000));
        items.add(new GroceryItem("Spaghetti", "Grocery", "The best spaghetti ever",
                false, true, 15.00, 4, 1200));
        items.add(new FragileItem("Porcelain", "Fragile", "The strongest porcelain ever",
                false, true, 20.00, 5, 1000));
        items.add(new FragileItem("Glass Cups", "Fragile", "The strongest cups ever",
                false, true, 15.00, 6, 1200));
        System.out.println("Welcome to the E-commerce Console Application!");
        boolean isRunning = true;
        while (isRunning) {
            displayMenu();
            int menuIndex = Integer.parseInt(sc.nextLine());
            switch (menuIndex) {
                case 1:
                    for (var item: items) {
                        System.out.println(item.getItemDetails());
                    }
                    menuIndex = backMenu();
                    if (menuIndex == 9){
                        isRunning = false;
                    }
                    break;
                case 2:
                    System.out.println("Enter Item id, name, category, description, isBreakable, isPerishable, price and quantity separated by comma!");
                    String[] input = sc.nextLine().trim().split(",");
                    System.out.println("8. Save");
                    System.out.println("9. Cancel");
                    menuIndex = Integer.parseInt(sc.nextLine());
                    if (menuIndex == 8) {
                        if (input[2].equals("Electronics")) {
                            items.add(new ElectronicsItem(input[1], input[2], input[3], Boolean.parseBoolean(input[4]),
                                    Boolean.parseBoolean(input[5]), Double.parseDouble(input[6]), Integer.parseInt(input[0]), Integer.parseInt(input[7])));
                        }
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
        System.out.println("2. Add Items to List");
        System.out.println("3. Show by Category");
        System.out.println("4. Order");
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

