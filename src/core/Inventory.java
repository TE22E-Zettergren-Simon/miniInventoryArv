package core;

import items.Item;

import java.util.ArrayList;

public class Inventory {
    private ArrayList<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public void display() {
        for (Item item : items) {
            item.display();
        }
    }
}
