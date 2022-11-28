package creational.abstractfactory.orc;

import creational.abstractfactory.Army;
import creational.abstractfactory.Castle;
import creational.abstractfactory.King;
import creational.abstractfactory.KingdomFactory;

public class OrcKingdomFactory implements KingdomFactory {

    @Override
    public Castle createCastle() {
        return new OrcCastle();
    }

    @Override
    public King createKing() {
        return new OrcKing();
    }

    @Override
    public Army createArmy() {
        return new OrcArmy();
    }

}
