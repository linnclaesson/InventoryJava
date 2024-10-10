public abstract class Weapon extends Item implements Equippable {
    protected int damage;

    // Constructor
    public Weapon(String name, int weight, double value, int damage) {
        super(name, weight, value);
        this.damage = damage;
    }

    // Getter
    public int getDamage() {
        return damage;
    }

    // Setter
    public void setDamage(int damage) {
        this.damage = damage;
    }

    // Methods
    public abstract void equipItem(Inventory inventory);
    public abstract void unequipItem(Inventory inventory);
}
