public class BigSword extends Weapon implements MeeleWeapon {
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

    @Override
    public void meeleAttack() {
        bigSwingAttack();
    }

    public void bigSwingAttack() {
        System.out.println("\n" + "Using " + this.getName() + " to perform a big swing attack with " + this.getDamage() + " damage!" + "\n");
    }
}
