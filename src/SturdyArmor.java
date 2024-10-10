public class SturdyArmor extends Armor {
    // Constructor
    public SturdyArmor(String name, int weight, double value, int damageDefence, int armorDurability) {
        super(name, weight, value, damageDefence, armorDurability);
    }

    // Methods
    @Override
    public void equipItem(Inventory inventory) {
        System.out.println("Trying to equip Sturdy Armor: " + this.getName());
        inventory.equipArmor(this);
    }

    @Override
    public void unequipItem(Inventory inventory) {
        System.out.println("Trying to unequip Sturdy Armor: " + this.getName());
        inventory.unequipArmor();
    }
}