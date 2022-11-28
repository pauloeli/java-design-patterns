package structural.facade;

import java.util.Collection;
import java.util.List;

import static structural.facade.DwarvenMineWorker.Action.*;

public class DwarvenGoldmineFacade {

    private final List<DwarvenMineWorker> workers;

    public DwarvenGoldmineFacade() {
        workers = List.of(
                new DwarvenGoldDigger(),
                new DwarvenCartOperator(),
                new DwarvenTunnelDigger()
        );
    }

    private static void makeActions(Collection<DwarvenMineWorker> workers, DwarvenMineWorker.Action... actions) {
        workers.forEach(worker -> worker.action(actions));
    }

    public void startNewDay() {
        makeActions(workers, WAKE_UP, GO_TO_MINE);
    }

    public void digOutGold() {
        makeActions(workers, WORK);
    }

    public void endDay() {
        makeActions(workers, GO_HOME, GO_TO_SLEEP);
    }

}
