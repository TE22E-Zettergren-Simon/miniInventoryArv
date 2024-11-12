package core;

import items.Item;

public class Character {
    private String name;
    private double health;
    private Inventory backpack = new Inventory();

    public void damage(double damage) {
        health -= damage;
    }

    public void addItem(Item item) {
        backpack.addItem(item);
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Backpack:");
        backpack.display();
    }

    public void changeHealth(double health) {
        this.health += health;
    }
}
