package creational.abstractfactory.elf;

import creational.abstractfactory.Army;
import creational.abstractfactory.Castle;
import creational.abstractfactory.King;
import creational.abstractfactory.KingdomFactory;

public class ElfKingdomFactory implements KingdomFactory {

    @Override
    public Castle createCastle() {
        return new ElfCastle();
    }

    @Override
    public King createKing() {
        return new ElfKing();
    }

    @Override
    public Army createArmy() {
        return new ElfArmy();
    }

}
