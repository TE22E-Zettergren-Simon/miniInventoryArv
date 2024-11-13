package core;

public class Character {
    private String name;
    private double health;
    private Inventory backpack = new Inventory();

    public Character(String name, double health) {
        this.name = name;
        this.health = health;
    }

    public void damage(double damage) {
        health -= damage;
    }

    public void display() {
        System.out.println();
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Backpack:");
        backpack.display();
    }

    public void changeHealth(double health_diff) {
        this.health += health_diff;
    }


    public Inventory getBackpack() {
        return backpack;
    }
}
