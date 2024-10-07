public class DefencePotion extends Consumable{
    public DefencePotion(String name, int weight, double value, int potency, int duration) {
        super(name, weight, value, potency, duration);
    }

    @Override
    public void useItem(Inventory inventory) {
        System.out.printf("Using defence potion. Boosting defence by %s for %s seconds.%n", potency, duration);
        addDefence(potency, duration);

        // remove item from inventory after it is consumed/used
        inventory.removeItem(this);
    }

    public void addDefence(int potency, int duration) {
        System.out.println("Defence increased by " + potency + " points.");

        try {
            Thread.sleep(duration * 1000L); // duration is in seconds
        } catch (InterruptedException e) {
            System.out.println("Interrupted while applying defence boost.");
        }
        System.out.println("The defence boost has worn off.");
    }
}
