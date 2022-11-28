package creational;

import creational.abstractfactory.KingdomFactory;
import creational.abstractfactory.KingdomType;
import creational.builder.HairColor;
import creational.builder.Hero;
import creational.builder.Profession;
import creational.builder.Weapon;
import creational.factory.CoinFactory;
import creational.prototype.HeroFactoryImpl;
import creational.prototype.elf.ElfBeast;
import creational.prototype.elf.ElfMage;
import creational.prototype.elf.ElfWarlord;
import creational.prototype.orc.OrcBeast;
import creational.prototype.orc.OrcMage;
import creational.prototype.orc.OrcWarlord;
import creational.singleton.Tower;

import static creational.factory.CoinType.COPPER;
import static creational.factory.CoinType.GOLD;

public class Creational {

    public static void abstractFactory() {
        System.out.println();
        System.out.println(
                """
                        To create a kingdom we need objects with a common theme. The elven kingdom needs an elven king,
                        elven castle, and elven army whereas the orcish kingdom needs an orcish king, orcish castle,
                        and orcish army. There is a dependency between the objects in the kingdom."""
        );
        System.out.println();

        final KingdomFactory elfKingdomFactory = KingdomType.ELF.getConstructor().get();
        System.out.println(elfKingdomFactory.createKing().getDescription());
        System.out.println(elfKingdomFactory.createCastle().getDescription());
        System.out.println(elfKingdomFactory.createArmy().getDescription());

        final KingdomFactory orcKingdomFactory = KingdomType.ORC.getConstructor().get();
        System.out.println(orcKingdomFactory.createKing().getDescription());
        System.out.println(orcKingdomFactory.createCastle().getDescription());
        System.out.println(orcKingdomFactory.createArmy().getDescription());
    }

    public static void builder() {
        System.out.println();
        System.out.println("""
                Imagine a character generator for a role-playing game. The easiest option is to let the computer create
                the character for you. If you want to manually select the character details like profession, gender, hair
                color, etc. the character generation becomes a step-by-step process that completes when all the selections
                are ready.
                """);
        System.out.println();

        var hero = Hero.builder()
                .profession(Profession.WIZARD)
                .name("Riobard")
                .withHairColor(HairColor.BLACK)
                .withWeapon(Weapon.KNIFE)
                .build();

        System.out.println(hero.toString());
    }

    public static void prototype() {
        System.out.println();
        System.out.println("""
                Remember Dolly? The sheep that was cloned! Let's not get into the details but the key point here is that it is all about cloning.
                """);

        System.out.println();

        var factory = new HeroFactoryImpl(
                new ElfMage("cooking"),
                new ElfWarlord("cleaning"),
                new ElfBeast("protecting")
        );

        var mage = factory.createMage();
        var warlord = factory.createWarlord();
        var beast = factory.createBeast();

        System.out.println(mage.toString());
        System.out.println(warlord.toString());
        System.out.println(beast.toString());

        factory = new HeroFactoryImpl(
                new OrcMage("axe"),
                new OrcWarlord("sword"),
                new OrcBeast("laser")
        );

        mage = factory.createMage();
        warlord = factory.createWarlord();
        beast = factory.createBeast();

        System.out.println(mage.toString());
        System.out.println(warlord.toString());
        System.out.println(beast.toString());
    }

    public static void factory() {
        System.out.println();
        System.out.println("The alchemist begins his work");
        System.out.println();

        System.out.println(CoinFactory.getInstance(COPPER).getDescription());
        System.out.println(CoinFactory.getInstance(GOLD).getDescription());
    }

    public static void singleton() {
        System.out.println();
        System.out.println(
                """
                        There can only be one ivory tower where the wizards study their magic.
                        The same enchanted ivory tower is always used by the wizards. The ivory tower here is a singleton.
                        """
        );
        System.out.println();

        System.out.printf("First tower: %s%n", Tower.getInstance().toString());
        System.out.printf("Second tower: %s%n", Tower.getInstance().toString());
    }


}
