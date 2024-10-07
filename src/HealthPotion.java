public class HealthPotion extends Consumable {
    public HealthPotion(String name, int weight, double value, int potency, int duration) {
        super(name, weight, value, potency, duration);
    }

    @Override
    public void useItem() {
        System.out.printf("Using health potion. Boosting health by %s for %s seconds.%n", potency, duration);
        addHealth(potency, duration);
    }

    public void addHealth(int potency, int duration) {
        System.out.println("Health increased by " + potency + " points.");

        try {
            Thread.sleep(duration * 1000L); // duration is in seconds
        } catch (InterruptedException e) {
            System.out.println("Interrupted while applying health boost.");
        }
        System.out.println("The health boost has worn off.");
    }
}
