import java.util.ArrayList;

public class Inventory {
    ArrayList<Item> items;

    // Constructor
    public Inventory() {
        items = new ArrayList<>();
    }

    // Methods
    public void addItem(Item item) {
        items.add(item);
        System.out.println(item.getName() + " was added to the inventory.");
    }

    public void removeItem(Item item) {
        items.remove(item);
        System.out.println(item.getName() + " has been removed from the inventory.");
    }

    public void showItems(){
        if(items.isEmpty()){
            System.out.println("No items in the inventory.");
            return;
        }
        System.out.println("Items in the inventory:");
        for(Item item : items){
            System.out.println(item.getName());
        }
    }
}
