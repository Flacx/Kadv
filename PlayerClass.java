import java.lang.reflect.Array;
import java.util.ArrayList;

public class PlayerClass extends Subject {
    private ArrayList<ArrayList<Item>> inventory;
    public PlayerClass(String name, int id, float hp) {
        super(name, id, hp);
        inventory = new ArrayList<ArrayList<Item>>();
    }

    public void addItem(Item item) {
        boolean exists = false;
        for (ArrayList<Item> itemlist : inventory) {
            if (itemlist.get(0).getId() == item.getId()) {
                itemlist.add(item);
                exists = true;
            }
        }

        if (!exists) {
            inventory.add(new ArrayList<Item>());
            inventory.get(inventory.size()-1).add(item);
        }
    }



}
