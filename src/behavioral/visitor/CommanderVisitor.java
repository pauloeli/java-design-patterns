package behavioral.visitor;

public class CommanderVisitor implements UnitVisitor {

    @Override
    public void visit(Soldier soldier) {
    }

    @Override
    public void visit(Sergeant sergeant) {
    }

    @Override
    public void visit(Commander commander) {
        System.out.printf("Good to see you %s\n", commander);
    }

}
