public abstract class Armor extends Item implements Equippable {
    protected int damageDefence;
    protected int armorDurability;

    // Constructor
    public Armor(String name, int weight, double value, int damageDefence, int armorDurability) {
        super(name, weight, value);
        this.damageDefence = damageDefence;
        this.armorDurability = armorDurability;
    }

    // Getters
    public int getDamageDefence() {
        return damageDefence;
    }
    public int getArmorDurability() {
        return armorDurability;
    }

    // Setters
    public void setDamageDefence(int damageDefence) {
        this.damageDefence = damageDefence;
    }
    public void setArmorDurability(int armorDurability) {
        this.armorDurability = armorDurability;
    }

    // Methods
    public abstract void equipItem(Inventory inventory);
    public abstract void unequipItem(Inventory inventory);

    public void repair(){
        System.out.println("Armor repaired");
    };

}
