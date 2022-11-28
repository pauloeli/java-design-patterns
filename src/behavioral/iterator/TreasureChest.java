package behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

import static behavioral.iterator.ItemType.*;

public class TreasureChest {

    private final List<Item> items;

    public TreasureChest() {
        items = List.of(
                new Item(POTION, "Potion of courage"),
                new Item(RING, "Ring of shadows"),
                new Item(POTION, "Potion of wisdom"),
                new Item(POTION, "Potion of blood"),
                new Item(WEAPON, "Sword of silver +1"),
                new Item(POTION, "Potion of rust"),
                new Item(POTION, "Potion of healing"),
                new Item(RING, "Ring of armor"),
                new Item(WEAPON, "Steel halberd"),
                new Item(WEAPON, "Dagger of poison"));
    }

    public TreasureChestItemIterator iterator(ItemType itemType) {
        return new TreasureChestItemIterator(this, itemType);
    }

    public List<Item> getItems() {
        return new ArrayList<>(items);
    }

}
