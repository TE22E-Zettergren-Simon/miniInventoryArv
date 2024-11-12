package items;

import java.util.Random;

import core.Character;

public class Weapon extends Item {
    private double minDamage;
    private double maxDamage;

    private static final Random generator = new Random();

    public Weapon(String name, double weight, double minDamage, double maxDamage) {
        super(name, weight);
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
    }

    public void attack(Character target) {
        target.damage(generator.nextDouble(minDamage, maxDamage));
    }

    @Override
    public void display() {
        System.out.println("Weapon: " + name + " (" + weight + "kg) deals " + minDamage + " - " + maxDamage + " damage");
    }
}
