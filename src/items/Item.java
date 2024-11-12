package items;

public class Item {
    protected String name;
    protected double weight;

    public Item(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public void display() {
        System.out.println("Item: " + name + " (" + weight + "kg)");
    }
}
