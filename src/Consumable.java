public abstract class Consumable extends Item implements Usable {
    protected int potency;
    protected int duration;

    // Constructor
    public Consumable(String name, int weight, double value, int potency, int duration) {
        super(name, weight, value);
        this.potency = potency;
        this.duration = duration;
    }

    // Getters
    public int getPotency() {
        return potency;
    }
    public double getDuration() {
        return duration;
    }

    // Setters
    public void setPotency(int potency) {
        this.potency = potency;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }

    // Methods
    @Override
    public abstract void useItem();
}
