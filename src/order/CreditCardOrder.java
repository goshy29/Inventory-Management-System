package order;

import itemtypes.InventoryItem;
import payment.CreditCardPayment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CreditCardOrder {
    public static void finish(ArrayList<InventoryItem> items, HashMap<String, Integer> orderMap){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter card holder name: ");
        String name = sc.nextLine();
        System.out.print("Enter card number: ");
        int cardNumber = Integer.parseInt(sc.nextLine());
        System.out.print("Enter card security number: ");
        int cardSecurityNumber = Integer.parseInt(sc.nextLine());
        CreditCardPayment creditCardPayment =
                new CreditCardPayment(name, cardSecurityNumber, cardNumber);
        System.out.print("Pres 1 to continue: ");
        int pressOne = Integer.parseInt(sc.nextLine());
        System.out.println("===========");
        System.out.println("Order:");
        double totalSumForPayment = 0.0;
        for (HashMap.Entry<String, Integer> entry : orderMap.entrySet()) {
            for (var item : items) {
                if (item.getName() == entry.getKey()) {
                    System.out.printf("Item: %s%nQuantity: %s%n", entry.getKey(), entry.getValue());
                    totalSumForPayment += (item.getPrice() * entry.getValue());
                }
            }
        }
        System.out.printf("Total Sum for Payment: %.2f%n", totalSumForPayment);
        System.out.printf("Type of payment: Credit/Debit Card; User: %s%n", creditCardPayment.getName());
        System.out.print("Pres 1 to Order: ");
        pressOne = Integer.parseInt(sc.nextLine());
        System.out.println("Your order has been placed successfully!");
        System.out.println("===========");
    }
}
