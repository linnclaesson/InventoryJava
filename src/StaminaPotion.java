public class StaminaPotion extends Consumable {
    public StaminaPotion(String name, int weight, double value, int potency, int duration) {
        super(name, weight, value, potency, duration);
    }

    @Override
    public void useItem() {
        System.out.printf("Using stamina potion. Boosting stamina by %s for %s seconds.%n", potency, duration);
        addStrength(potency, duration);
    }

    public void addStrength(int potency, int duration) {
        System.out.println("Stamina increased by " + potency + " points.");

        try {
            Thread.sleep(duration * 1000L); // duration is in seconds
        } catch (InterruptedException e) {
            System.out.println("Interrupted while applying stamina boost.");
        }
        System.out.println("The stamina boost has worn off.");
    }
}
