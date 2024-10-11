public class StaminaPotion extends Consumable {
    public StaminaPotion(String name, int weight, double value, int potency, int duration) {
        super(name, weight, value, potency, duration);
    }

    @Override
    public void useItem(Player player) {
        System.out.println("*** Using stamina potion ***");
        System.out.printf("Boosting strength by %s points for %s seconds.%n", potency, duration);

        // Temporarily increase player's strength
        player.increaseStrength(potency);

        // Create a new thread to handle the effect duration
        new Thread(() -> {
            try {
                Thread.sleep(duration * 1000L);
            } catch (InterruptedException e) {
                System.out.println("Potion effect interrupted.");
            }
            // After duration, revert the strength back to normal
            player.decreaseStrength(potency);
            System.out.println("Strength boost has worn off.");
        }).start();

        player.getInventory().removeItem(this);
    }
}
