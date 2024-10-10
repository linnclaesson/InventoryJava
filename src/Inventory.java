import java.util.ArrayList;

public class Inventory {
    private ArrayList<Item> items;
    private Armor equippedArmor;

    // Constructor
    public Inventory() {
        items = new ArrayList<>();
        equippedArmor = null; // Initially, no armor should be equipped
    }

    // Getters
    public Armor getEquippedArmor() {
        return equippedArmor;
    }

    // METHODS
    // Add item to the inventory
    public void addItem(Item item) {
        items.add(item);
        System.out.println(item.getName() + " was added to the inventory.");
    }

    // Remove item from the inventory
    public void removeItem(Item item) {
        items.remove(item);
        System.out.println(item.getName() + " has been removed from the inventory.");
    }

    // Show inventory items
    public void showItems() {
        if (items.isEmpty()) {
            System.out.println("No items in the inventory.");
            return;
        }
        System.out.println();
        System.out.println("** Items in the inventory: **");
        for (Item item : items) {
            System.out.println(item.getName());
        }
        System.out.println();
    }

    // Check if an item is in the inventory
    public boolean hasItem(Item item) {
        return items.contains(item);
    }

    // Equip armor
    public void equipArmor(Armor armor) {
        if (hasItem(armor)) {
            if (equippedArmor != null) {
                unequipArmor();
            }
            equippedArmor = armor;
            System.out.println("Equipped armor: " + armor.getName());
        } else {
            System.out.println("Armor not found in inventory, cannot equip.");
        }
    }

    // Unequip armor
    public void unequipArmor() {
        if (equippedArmor != null) {
            System.out.println("Unequipping armor: " + equippedArmor.getName());
            equippedArmor = null;
        } else {
            System.out.println("No armor is currently equipped.");
        }
    }
}
