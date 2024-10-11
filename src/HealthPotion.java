public class HealthPotion extends Consumable {
    public HealthPotion(String name, int weight, double value, int potency) {
        super(name, weight, value, potency, 0);
    }

    @Override
    public void useItem(Player player) {
        System.out.println("*** Using health potion ***");
        System.out.println("Boosting health by " + potency + " points.");
        player.increaseHealth(potency);

        // remove item from inventory after it is consumed/used
        player.getInventory().removeItem(this);
    }

}
