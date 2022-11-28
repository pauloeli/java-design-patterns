package structural.facade;

public class DwarvenTunnelDigger extends DwarvenMineWorker {

    @Override
    public void work() {
        System.out.printf("%s creates another promising tunnel.\n", name());
    }

    @Override
    public String name() {
        return "Dwarven tunnel digger";
    }

}