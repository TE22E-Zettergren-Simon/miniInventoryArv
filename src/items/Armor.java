package items;

public class Armor extends Item {
    private double protection;

    public Armor(String name, double weight, double protection) {
        super(name, weight);
        this.protection = protection;
    }

    public double getProtection() {
        return protection;
    }

    @Override
    public void display() {
        System.out.println("Armor: " + name + " (" + weight + "kg) protects " + protection + " damage");
    }
}
