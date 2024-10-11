public class Player {
    private String name;
    private int level;
    private int strength;
    private int defence;
    private int health;
    private int maxHealth;
    private Inventory inventory;

    // Constructor
    public Player(String name) {
        this.name = name;
        this.level = 1;
        this.strength = 10;
        this.defence = 10;
        this.health = 100;
        this.maxHealth = 100;
        this.inventory = new Inventory();
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getStrength() {
        return strength;
    }

    public int getDefence() {
        return defence;
    }

    public int getHealth() {
        return health;
    }

    public Inventory getInventory() {
        return inventory;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    // Methods

    public void showPlayerStats() {
        System.out.println();
        System.out.println("Player Name: " + name);
        System.out.println("Level: " + level);
        System.out.println("Strength: " + strength);
        System.out.println("Defence: " + defence);
        System.out.println("Health: " + health + "/" + maxHealth);
        System.out.println();
    }

    public void increaseStrength(int amount) {
        this.strength += amount;
        System.out.println("Player strength increased by " + amount + ". Current strength: " + this.strength);
    }

    public void increaseDefence(int amount) {
        this.defence += amount;
        System.out.println("Player defence increased by " + amount + ". Current defence: " + this.defence);
    }

    public void decreaseStrength(int amount) {
        this.strength -= amount;
        System.out.println("Player strength decreased by " + amount + ". Current strength: " + this.strength);
    }

    public void decreaseDefence(int amount) {
        this.defence -= amount;
        System.out.println("Player defence decreased by " + amount + ". Current defence: " + this.defence);
    }

    public void increaseHealth(int amount) {
        this.health += amount;
        if (this.health > maxHealth) {
            this.health = maxHealth;
        }
        System.out.println(name + " healed by " + amount + " points. Current health: " + health);
    }

    public void decreaseHealth(int amount) {
        this.health -= amount;
        if (this.health < 0) {
            this.health = 0;
        }
        System.out.println(name + " took " + amount + " damage. Current health: " + health);
    }
}
