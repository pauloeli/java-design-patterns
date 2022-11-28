package structural;

import structural.adapter.Captain;
import structural.adapter.FishingBoatAdapter;
import structural.bridge.composite.Messenger;
import structural.bridge.enchantment.FlyingEnchantment;
import structural.bridge.enchantment.SoulEatingEnchantment;
import structural.bridge.weapons.Hammer;
import structural.bridge.weapons.Sword;
import structural.decorator.ClubbedTroll;
import structural.decorator.SimpleTroll;
import structural.facade.DwarvenGoldmineFacade;
import structural.flyweight.AlchemistShop;
import structural.proxy.IvoryTower;
import structural.proxy.Wizard;
import structural.proxy.WizardTowerProxy;

public class Structural {

    public static void adapter() {
        System.out.println();
        System.out.println(
                """
                        Consider that you have some pictures on your memory card and you need to transfer them to your computer.
                        To transfer them, you need some kind of adapter that is compatible with your computer ports so that you can
                        attach a memory card to your computer. In this case card reader is an adapter. Another example would be the
                        famous power adapter; a three-legged plug can't be connected to a two-pronged outlet, it needs to use a power
                        adapter that makes it compatible with the two-pronged outlets. Yet another example would be a translator
                        translating words spoken by one person to another
                        """
        );
        System.out.println();

        var captain = new Captain(new FishingBoatAdapter());
        captain.row();
    }

    public static void bridge() {
        System.out.println();
        System.out.println(
                """
                        Consider you have a weapon with different enchantments, and you are supposed to allow mixing different
                        weapons with different enchantments. What would you do? Create multiple copies of each of the weapons
                        for each of the enchantments or would you just create separate enchantment and set it for the weapon as
                        needed? Bridge pattern allows you to do the second.
                        """
        );
        System.out.println();

        System.out.println("The knight receives an enchanted sword.");
        var enchantedSword = new Sword(new SoulEatingEnchantment());
        enchantedSword.wield();
        enchantedSword.swing();
        enchantedSword.unwield();

        System.out.println();

        System.out.println("The valkyrie receives an enchanted hammer.");
        var hammer = new Hammer(new FlyingEnchantment());
        hammer.wield();
        hammer.swing();
        hammer.unwield();
    }

    public static void composite() {
        System.out.println();
        System.out.println(
                """
                        Every sentence is composed of words which are in turn composed of characters. Each of these objects
                        are printable and they can have something printed before or after them like sentence always ends
                        with full stop and word always has space before it.
                        """
        );
        System.out.println();

        var messenger = new Messenger();

        System.out.println("Message from the orcs: ");
        messenger.messageFromOrcs().print();

        System.out.println();

        System.out.println("Message from the elves: ");
        messenger.messageFromElves().print();
    }

    public static void decorator() {
        System.out.println();
        System.out.println(
                """
                        There is an angry troll living in the nearby hills. Usually, it goes bare-handed but sometimes it has a
                        weapon. To arm the troll it's not necessary to create a new troll but to decorate it dynamically with a
                        suitable weapon.
                        """
        );
        System.out.println();

        System.out.println("A simple looking troll approaches.");
        var troll = new SimpleTroll();
        troll.attack();
        troll.fleeBattle();

        System.out.printf("Simple troll power: %s.%n\n\n", troll.getAttackPower());

        System.out.println("A troll with huge club surprises you.");
        var clubbedTroll = new ClubbedTroll(troll);
        clubbedTroll.attack();
        clubbedTroll.fleeBattle();

        System.out.printf("Clubbed troll power: %s.%n\n", clubbedTroll.getAttackPower());
    }

    public static void facade() {
        System.out.println();
        System.out.println(
                """
                        How does a goldmine work? "Well, the miners go down there and dig gold!" you say. That is what you
                        believe because you are using a simple interface that goldmine provides on the outside, internally
                        it has to do a lot of stuff to make it happen. This simple interface to the complex subsystem is a
                        facade.
                        """
        );
        System.out.println();

        var facade = new DwarvenGoldmineFacade();
        facade.startNewDay();
        facade.digOutGold();
        facade.endDay();
    }

    public static void flyweight() {
        System.out.println();
        System.out.println(
                """
                        Alchemist's shop has shelves full of magic potions. Many of the potions are the same so there is
                        no need to create a new object for each of them. Instead, one object instance can represent multiple
                        shelf items so the memory footprint remains small.
                        """
        );
        System.out.println();

        var alchemistShop = new AlchemistShop();
        alchemistShop.drinkPotions();
    }

    public static void proxy() {
        System.out.println();
        System.out.println(
                """
                        Imagine a tower where the local wizards go to study their spells. The ivory tower can only be accessed
                        through a proxy which ensures that only the first three wizards can enter. Here the proxy represents
                        the functionality of the tower and adds access control to it.
                        """
        );
        System.out.println();

        var proxy = new WizardTowerProxy(new IvoryTower());
        proxy.enter(new Wizard("Red wizard"));
        proxy.enter(new Wizard("White wizard"));
        proxy.enter(new Wizard("Black wizard"));
        proxy.enter(new Wizard("Green wizard"));
        proxy.enter(new Wizard("Brown wizard"));
    }

}
