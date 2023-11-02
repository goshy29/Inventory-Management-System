package item_operations;

import itemtypes.InventoryItem;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class UpdateItems {
    public static ArrayList<InventoryItem> update() {
        String path = "C:\\Users\\gdobromirov\\Desktop\\Spring Boot\\sir A\\IMSSerializable.txt";
        ArrayList<InventoryItem> items = new ArrayList<>();
        try (FileInputStream fis = new FileInputStream(path);
             ObjectInputStream oos = new ObjectInputStream(fis)) {
            items = (ArrayList<InventoryItem>) oos.readObject();
        }
        catch (IOException exc) {
            exc.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return items;
    }
}
