package items;

import core.Character;

import java.util.function.Function;

public class Consumable extends Item {
    private int uses;
    private Function<Character, Void> action;

    public Consumable(String name, double weight, int uses, Function<Character, Void> action) {
        super(name, weight);
        this.uses = uses;
        this.action = action;
    }

    public void use(Character target) {
        if (uses <= 0) {
            return;
        }

        uses--;
        action.apply(target);
    }

    @Override
    public void display() {
        System.out.println("Consumable: " + name + " (" + weight + "kg) (" + uses + " uses)");
    }
}
