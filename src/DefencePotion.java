public class DefencePotion extends Consumable{
    public DefencePotion(String name, int weight, double value, int potency, int duration) {
        super(name, weight, value, potency, duration);
    }

    @Override
    public void useItem(Player player) {
        System.out.println("*** Using defence potion ***");
        System.out.printf("Boosting defence by %s points for %s seconds.%n", potency, duration);

        // Temporarily increase player's defence
        player.increaseDefence(potency);

        // Create a new thread to handle the effect duration
        new Thread(() -> {
            try {
                Thread.sleep(duration * 1000L);
            } catch (InterruptedException e) {
                System.out.println("Potion effect interrupted.");
            }
            // After duration, revert the defence back to normal
            player.decreaseDefence(potency);
            System.out.println("Defence boost has worn off.");
        }).start();

        player.getInventory().removeItem(this);
    }
}
