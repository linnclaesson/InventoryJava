public abstract class Item {
    private String name;
    private int weight;
    private double value;

    // Constructor
    public Item(String name, int weight, double value) {
        this.name = name;
        this.weight = weight;
        this.value = value;
    }

    // Getters
    public String getName() {
        return name;
    }
    public int getWeight() {
        return weight;
    }
    public double getValue() {
        return value;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void setValue(double value) {
        this.value = value;
    }
}
