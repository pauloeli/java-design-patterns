package behavioral.visitor;

public class SergeantVisitor implements UnitVisitor {

    @Override
    public void visit(Soldier soldier) {
    }

    @Override
    public void visit(Sergeant sergeant) {
        System.out.printf("Hello %s\n", sergeant);
    }

    @Override
    public void visit(Commander commander) {
    }

}
