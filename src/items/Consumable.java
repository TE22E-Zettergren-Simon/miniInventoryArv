package items;

import core.Character;

public class Consumable extends Item {
    private int uses;

    public Consumable(String name, double weight, int uses) {
        super(name, weight);
        this.uses = uses;
    }

    public void use(Character target) {
        if (uses <= 0) {
            return;
        }

        uses--;
        target.changeHealth(10.0);
    }

    @Override
    public void display() {
        System.out.println("Consumable: " + name + " (" + weight + "kg) (" + uses + " uses) heals 10 hp");
    }
}
