package item_operations;

import itemtypes.InventoryItem;

import java.io.*;
import java.util.ArrayList;

public class ReadItems {
    public static void read() {
        String path = "C:\\Users\\gdobromirov\\Desktop\\Spring Boot\\sir A\\IMSSerializable.txt";
        try (FileInputStream fis = new FileInputStream(path);
             ObjectInputStream oos = new ObjectInputStream(fis)) {
            ArrayList<InventoryItem> items = (ArrayList<InventoryItem>) oos.readObject();
            for (InventoryItem item : items) {
                System.out.println(item.getItemDetails());
            }
        }
        catch (IOException exc) {
            exc.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
