package structural.facade;

public class DwarvenGoldDigger extends DwarvenMineWorker {

    @Override
    public void work() {
        System.out.printf("%s digs for gold.\n", name());
    }

    @Override
    public String name() {
        return "Dwarf gold digger";
    }

}