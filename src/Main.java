public class Main {
    public static void main(String[] args) {

        // Create an inventory
        Inventory inventory = new Inventory();

        // create armor
        SturdyArmor sturdyArmor = new SturdyArmor("Heavy Plate Armor", 50, 150.0, 75, 100);
        SturdyArmor smallSturdyArmor = new SturdyArmor("Light Plate Armor", 25, 100.0, 50, 100);

        // create potions
        StaminaPotion staminaPotion = new StaminaPotion("Small Stamina Potion", 30, 5, 5, 15);
        DefencePotion defencePotion = new DefencePotion("Medium Defence Potion", 40, 10, 10, 20);
        HealthPotion healthPotion = new HealthPotion("Big Health Potion", 50, 20, 10);

        // create weapons
        BigSword bigSword1 = new BigSword("Big Fury Sword", 30, 100, 20);
        BigSword bigSword2 = new BigSword("Big Sword 2nd", 30, 100, 20);

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
        //defencePotion.useItem(inventory);
        healthPotion.useItem(inventory);

        // Add armor to inventory
        inventory.addItem(smallSturdyArmor);
        inventory.addItem(sturdyArmor);

        // Equip armor
        smallSturdyArmor.equipItem(inventory);
        sturdyArmor.equipItem(inventory);

        // Try equip weapon
        bigSword1.equipItem(inventory);

        // Add weapon to inventory
        inventory.addItem(bigSword1);

        // Equip weapon
        bigSword1.equipItem(inventory);

        bigSword1.bigSwingAttack();

        // Try swap weapon
        bigSword2.equipItem(inventory);

        inventory.removeItem(sturdyArmor);

        // try showing inventory
        inventory.showItems();
    }
}