package order;

import item_operations.SortItems;
import itemtypes.InventoryItem;
import payment.CreditCardPayment;

import javax.security.auth.login.CredentialException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MakeOrder {
    public static int order(ArrayList<InventoryItem> items, HashMap<String, Integer> orderMap) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Electronic Items");
        System.out.println("2. Grocery Items");
        System.out.println("3. Fragile Items");
        System.out.print("Select Category: ");
        int categoryIndex = Integer.parseInt(sc.nextLine());
        SortItems.sort(items, categoryIndex);
        System.out.print("Select Item: ");
        int itemIndex = Integer.parseInt(sc.nextLine());
        System.out.print("Select Quantity: ");
        int quantity = Integer.parseInt(sc.nextLine());
        //var item = new InventoryItem();
        System.out.println("1. Add to Cart");
        int menuIndex = backMenu();
        if (menuIndex == 1) {
            for (var item : items) {
                if (item.getId() == itemIndex) {
                    System.out.println("Your Cart:");
                    System.out.printf("You just add to your cart %s%nQuantity: %d%nSum for payment: %.2f%n",
                            item.getItemDescription(), quantity, item.getPrice() * quantity);
                    if (orderMap.size() == 0) {
                        orderMap.put(item.getName(), quantity);
                    } else if (orderMap.containsKey(item.getName())) {
                        orderMap.put(item.getName(), orderMap.get(item.getName()) + quantity);
                    } else  {
                        orderMap.put(item.getName(),  quantity);
                    }
                }
            }
        }

        System.out.println("1. Finish the Order");
        System.out.println("2. Continue the Order");
        menuIndex = backMenu();
        if (menuIndex == 1) {
            System.out.println("1. Credit/Debit Card");
            System.out.println("2. PayPal");
            int paymentMethod = Integer.parseInt(sc.nextLine());
            if (paymentMethod == 1) {
                CreditCardOrder.finish(items, orderMap);
            }
            if (paymentMethod == 2) {
                PayPalOrder.finish(items, orderMap);
            }
        }

        if (menuIndex == 2) {
            order(items, orderMap);
        }
        return menuIndex;
    }

    private static int backMenu() {
        System.out.println("8. Back");
        System.out.println("9. Exit");
        Scanner sc = new Scanner(System.in);
        int menuIndex = Integer.parseInt(sc.nextLine());
        return menuIndex;
    }
}

