package behavioral.visitor;

public class SoldierVisitor implements UnitVisitor {

    @Override
    public void visit(Soldier soldier) {
        System.out.printf("Greetings %s\n", soldier);
    }

    @Override
    public void visit(Sergeant sergeant) {
    }

    @Override
    public void visit(Commander commander) {
    }

}
