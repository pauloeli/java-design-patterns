package behavioral;

import behavioral.chain.OrcKing;
import behavioral.chain.Request;
import behavioral.command.Goblin;
import behavioral.command.InvisibilitySpell;
import behavioral.command.ShrinkSpell;
import behavioral.command.Wizard;
import behavioral.iterator.TreasureChest;
import behavioral.mediator.*;
import behavioral.memento.Star;
import behavioral.memento.StarMemento;
import behavioral.observer.Hobbits;
import behavioral.observer.Orcs;
import behavioral.observer.Weather;
import behavioral.state.Mammoth;
import behavioral.strategy.*;
import behavioral.template.HalflingThief;
import behavioral.template.HitAndRunMethod;
import behavioral.template.SubtleMethod;
import behavioral.visitor.*;

import java.util.Stack;

import static behavioral.chain.RequestType.*;
import static behavioral.iterator.ItemType.RING;
import static behavioral.mediator.Action.*;
import static behavioral.memento.StarType.SUN;

public class Behavioral {

    public static void observer() {
        System.out.println();
        System.out.println(
                """
                        In a land far away live the races of hobbits and orcs. Both of them are mostly outdoors so they closely
                        follow the weather changes. One could say that they are constantly observing the weather."""
        );
        System.out.println();

        final Weather weather = new Weather();
        weather.addObserver(new Orcs());
        weather.addObserver(new Hobbits());

        weather.timePasses();
        weather.timePasses();
    }

    public static void chainOfResponsability() {
        System.out.println();
        System.out.println(
                """
                        The Orc King gives loud orders to his army. The closest one to react is the commander, then an officer,
                        and then a soldier. The commander, officer, and soldier form a chain of responsibility.
                        """
        );
        System.out.println();

        var king = new OrcKing();
        king.makeRequest(new Request(DEFEND_CASTLE, "defend castle"));
        king.makeRequest(new Request(TORTURE_PRISONER, "torture prisoner"));
        king.makeRequest(new Request(COLLECT_TAX, "collect tax"));
    }

    public static void iterator() {
        System.out.println();
        System.out.println(
                """
                        Treasure chest contains a set of magical items. There multiple types of items such as rings, potions,
                        and weapons. The items can be browsed by type using an iterator the treasure chest provides.
                        """
        );
        System.out.println();

        var itemIterator = new TreasureChest().iterator(RING);
        while (itemIterator.hasNext()) {
            System.out.printf("%s\n", itemIterator.next().toString());
        }
    }

    public static void memento() {
        System.out.println();
        System.out.println(
                """
                        We are working on an astrology application where we need to analyze star properties over time.
                        We are creating snapshots of star states using the Memento pattern.
                        """
        );
        System.out.println();

        var states = new Stack<StarMemento>();
        var star = new Star(SUN, 10000000, 500000);

        System.out.println(star);
        states.add(star.getMemento());

        star.timePasses();

        System.out.println(star);
        states.add(star.getMemento());

        star.timePasses();

        System.out.println(star);
        states.add(star.getMemento());

        star.timePasses();

        System.out.println(star);
        states.add(star.getMemento());

        star.timePasses();

        System.out.println(star);
        while (states.size() > 0) {
            star.setMemento(states.pop());
            System.out.println(star);
        }
    }

    public static void state() {
        System.out.println();
        System.out.println(
                """
                        When observing a mammoth in its natural habitat it seems to change its behavior based on the
                        situation. It may first appear calm, but over time when it detects a threat, it gets angry and
                        dangerous to its surroundings.
                        """
        );
        System.out.println();

        var mammoth = new Mammoth();
        mammoth.observe();
        mammoth.timePasses();
        mammoth.observe();
        mammoth.timePasses();
        mammoth.observe();
    }

    public static void template() {
        System.out.println();
        System.out.println(
                """
                        The general steps in stealing an item are the same. First, you pick the target, next you confuse
                        him somehow and finally, you steal the item. However, there are many ways to implement these
                        steps.
                        """
        );
        System.out.println();

        var thief = new HalflingThief(new HitAndRunMethod());
        thief.steal();

        thief.changeMethod(new SubtleMethod());
        thief.steal();
    }

    public static void command() {
        System.out.println();
        System.out.println(
                """
                        There is a wizard casting spells on a goblin. The spells are executed on the goblin one by one.
                        The first spell shrinks the goblin and the second makes him invisible. Then the wizard reverses
                        the spells one by one. Each spell here is a command object that can be undone.
                        """
        );
        System.out.println();

        Wizard wizard = new Wizard();
        Goblin goblin = new Goblin();

        goblin.printStatus();

        wizard.castSpell(new ShrinkSpell(), goblin);
        goblin.printStatus();

        wizard.castSpell(new InvisibilitySpell(), goblin);
        goblin.printStatus();

        wizard.undoLastSpell();
        goblin.printStatus();

        wizard.undoLastSpell();
        goblin.printStatus();

        wizard.redoLastSpell();
        goblin.printStatus();

        wizard.redoLastSpell();
        goblin.printStatus();
    }

    public static void mediator() {
        System.out.println();
        System.out.println(
                """
                        Rogue, wizard, hobbit, and hunter have decided to join their forces and travel in the same party.
                        To avoid coupling each member with each other, they use the party interface to communicate with
                        each other.
                        """
        );
        System.out.println();

        final Party party = new PartyImpl();
        final Hobbit hobbit = new Hobbit();
        final Rogue rogue = new Rogue();
        final Hunter hunter = new Hunter();
        final behavioral.mediator.Wizard wizard = new behavioral.mediator.Wizard();

        party.addMember(hobbit);
        party.addMember(wizard);
        party.addMember(rogue);
        party.addMember(hunter);

        hobbit.act(ENEMY);
        wizard.act(TALE);
        rogue.act(GOLD);
        hunter.act(HUNT);
    }

    public static void strategy() {
        System.out.println();
        System.out.println(
                """
                        Slaying dragons is a dangerous job. With experience, it becomes easier. Veteran dragonslayers
                        have developed different fighting strategies against different types of dragons.
                        """
        );
        System.out.println();

        System.out.println("Green dragon spotted ahead!");
        var dragonSlayer = new DragonSlayer(new MeleeStrategy());
        dragonSlayer.goToBattle();

        System.out.println("Red dragon emerges.");
        dragonSlayer.changeStrategy(new ProjectileStrategy());
        dragonSlayer.goToBattle();

        System.out.println("Black dragon lands before you.");
        dragonSlayer.changeStrategy(new SpellStrategy());
        dragonSlayer.goToBattle();
    }

    public static void visitor() {
        System.out.println();
        System.out.println(
                """
                        Consider a tree structure with army units. Commander has two sergeants under it and each sergeant
                        has three soldiers under them. Given that the hierarchy implements the visitor pattern, we can
                        easily create new objects that interact with the commander, sergeants, soldiers, or all of them.
                        """
        );
        System.out.println();

        var commander = new Commander(
                new Sergeant(new Soldier(), new Soldier(), new Soldier()),
                new Sergeant(new Soldier(), new Soldier(), new Soldier())
        );

        commander.accept(new SoldierVisitor());
        commander.accept(new SergeantVisitor());
        commander.accept(new CommanderVisitor());
    }

}
