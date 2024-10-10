public class BigSword extends Weapon {
    // Constructor
    public BigSword(String name, int weight, double value, int damage) {
        super(name, weight, value, damage);
    }

    // Methods
    @Override
    public void equipItem(Inventory inventory) {
        System.out.println("Trying to equip BigSword: " + this.getName());
        inventory.equipWeapon(this);
    }

    @Override
    public void unequipItem(Inventory inventory) {
        System.out.println("Trying to unequip BigSword: " + this.getName());
        inventory.unequipWeapon();
    }

}
