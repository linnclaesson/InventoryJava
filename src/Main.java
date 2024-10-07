public class Main {
    public static void main(String[] args) {

        // Create an inventory
        Inventory inventory = new Inventory();

        // create potions
        StaminaPotion staminaPotion = new StaminaPotion("Small Stamina Potion", 30, 5, 5, 15);
        DefencePotion defencePotion = new DefencePotion("Medium Defence Potion", 40, 10, 10, 20);
        HealthPotion healthPotion = new HealthPotion("Big Health Potion", 50, 20, 10, 30);
        // try showItems
        inventory.showItems();

        // add potion to inventory
        inventory.addItem(staminaPotion);
        inventory.addItem(defencePotion);
        inventory.addItem(healthPotion);

        // try show inventory
        inventory.showItems();

        // use potion
        staminaPotion.useItem(inventory);
        defencePotion.useItem(inventory);
        healthPotion.useItem(inventory);


        // try show inventory
        inventory.showItems();
    }
}