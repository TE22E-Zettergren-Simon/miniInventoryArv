import core.Character;
import items.*;

public class Main {
    public static void main(String[] args) {
        Character player = new Character("Grimace", 15.0);

        player.getBackpack().addItem(new Weapon("Glock", 0.7, 3.0, 5.0));
        player.getBackpack().addItem(new Consumable("Monster Energy", 0.5, 3, (Character c) -> { c.changeHealth(5.0); return null; }));
        player.getBackpack().addItem(new Consumable("Kong Strong Mango", 0.5, 1, (Character c) -> { c.changeHealth(-10.0); return null; }));

        player.display();

        System.out.println();
        System.out.println("You drink Monster and heal");
        ((Consumable) player.getBackpack().getItem(1)).use(player);
        player.display();

        System.out.println();
        System.out.println("You drink Kong Strong and take damage");
        ((Consumable) player.getBackpack().getItem(2)).use(player);
        player.display();

        System.out.println();
        System.out.println("Kong Strong is empty, you don't take damage");
        ((Consumable) player.getBackpack().getItem(2)).use(player);
        player.display();
    }
}
