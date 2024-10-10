public class HealthPotion extends Consumable {
    public HealthPotion(String name, int weight, double value, int potency) {
        super(name, weight, value, potency, 0);
    }

    @Override
    public void useItem(Inventory inventory) {
        System.out.println("Using health potion. Boosting health by " + potency + " points.");
        addHealth(potency);

        // remove item from inventory after it is consumed/used
        inventory.removeItem(this);
    }

    public void addHealth(int potency) {
        System.out.println("Health increased by " + potency + " points.");
    }
}
