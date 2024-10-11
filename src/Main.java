import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for the player's name
        System.out.print("Enter your player's name: ");
        String playerName = scanner.nextLine();

        // Create the player
        Player player = new Player(playerName);

        // Show initial player stats
        player.showPlayerStats();

        // Create armor
        SturdyArmor sturdyArmor = new SturdyArmor("Heavy Plate Armor", 50, 150.0, 75, 100);
        SturdyArmor smallSturdyArmor = new SturdyArmor("Light Plate Armor", 25, 100.0, 50, 100);

        // Create potions
        StaminaPotion staminaPotion = new StaminaPotion("Small Stamina Potion", 5, 5, 5, 15);
        DefencePotion defencePotion = new DefencePotion("Medium Defence Potion", 10, 10, 10, 20);
        HealthPotion healthPotion = new HealthPotion("Big Health Potion", 15, 20, 10);

        // Create weapons
        BigSword bigSword1 = new BigSword("Big Fury Sword", 30, 100, 20);
        BigSword bigSword2 = new BigSword("Big Sword 2nd", 30, 100, 20);

        // Add items to player's inventory
        player.getInventory().addItem(staminaPotion);
        player.getInventory().addItem(defencePotion);
        player.getInventory().addItem(healthPotion);
        player.getInventory().addItem(smallSturdyArmor);
        player.getInventory().addItem(sturdyArmor);
        player.getInventory().addItem(bigSword1);


        // Show the inventory
        player.getInventory().showItems();

        // Use potions
        staminaPotion.useItem(player);
        healthPotion.useItem(player);
        defencePotion.useItem(player);

        // Show player stats after using potions
        player.showPlayerStats();

        // Equip armor
        smallSturdyArmor.equipItem(player.getInventory());
        sturdyArmor.equipItem(player.getInventory());

        // Equip weapon
        bigSword1.equipItem(player.getInventory());

        // Perform a weapon attack
        bigSword1.bigSwingAttack();

        // Try to swap weapons
        bigSword2.equipItem(player.getInventory());

        // Remove an item from the inventory
        player.getInventory().removeItem(sturdyArmor);

        // Show the updated inventory
        player.getInventory().showItems();
    }
}