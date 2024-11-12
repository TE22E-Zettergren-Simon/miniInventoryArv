import core.Character;
import items.Armor;
import items.Consumable;
import items.Weapon;

public class Main {
    public static void main(String[] args) {
        Character player = new Character();

        player.addItem(new Weapon("Glock", 0.7, 3.0, 5.0));
        player.addItem(new Consumable("Monster Energy", 0.3, 3));

        player.display();
    }
}
