package valuablethanawat;

import java.util.Arrays;

public class ItemContainer {
    private final Item098[] items;
    private int itemCount;

    public ItemContainer() {
        this.items = new Item098[999];
        this.itemCount = 0;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Number of Item999: ").append(itemCount).append("\n");

        for (Item098 item : items) {
            if (item != null) {
                result.append(item.toString()).append("\n");
            }
        }

        return result.toString();
    }

    public boolean add(Item098 item) {
        if (itemCount >= items.length) {
            return false; // Array is full, cannot add more items
        }

        for (int i = 0; i < itemCount; i++) {
            if (items[i] != null && items[i].equals(item)) {
                // If the item already exists, replace it and return true
                items[i] = item;
                return true;
            }
        }

        // If the item does not exist, add it to the array and return true
        items[itemCount++] = item;
        return true;
    }

    public boolean remove(Item098 item) {
        for (int i = 0; i < itemCount; i++) {
            if (items[i] != null && items[i].equals(item)) {
                // If the item exists, remove it from the array and return true
                items[i] = null;
                itemCount--;
                return true;
            }
        }

        // If the item does not exist, return false
        return false;
    }
}

