package structural.flyweight;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import static structural.flyweight.PotionType.*;

public class AlchemistShop {

    private final List<Potion> topShelf;
    private final List<Potion> bottomShelf;

    public AlchemistShop() {
        var factory = new PotionFactory();
        topShelf = Arrays.asList(
                factory.createPotion(INVISIBILITY),
                factory.createPotion(INVISIBILITY),
                factory.createPotion(STRENGTH),
                factory.createPotion(HEALING),
                factory.createPotion(INVISIBILITY),
                factory.createPotion(STRENGTH),
                factory.createPotion(HEALING),
                factory.createPotion(HEALING)
        );
        bottomShelf = Arrays.asList(
                factory.createPotion(POISON),
                factory.createPotion(POISON),
                factory.createPotion(POISON),
                factory.createPotion(HOLY_WATER),
                factory.createPotion(HOLY_WATER)
        );
    }

    public final List<Potion> getTopShelf() {
        return List.copyOf(this.topShelf);
    }

    public final List<Potion> getBottomShelf() {
        return List.copyOf(this.bottomShelf);
    }

    public void drinkPotions() {
        System.out.print("Drinking top shelf potions\n");
        topShelf.stream().filter(Objects::nonNull).forEach(Potion::drink);

        System.out.print("Drinking bottom shelf potions\n");
        bottomShelf.stream().filter(Objects::nonNull).forEach(Potion::drink);
    }

}
