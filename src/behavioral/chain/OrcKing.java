package behavioral.chain;

import java.util.Comparator;
import java.util.List;

public class OrcKing {

    private List<RequestHandler> handlers;

    public OrcKing() {
        buildChain();
    }

    private void buildChain() {
        final OrcSoldier orcSoldier = new OrcSoldier(null);
        final OrcOfficer orcOfficer = new OrcOfficer(orcSoldier);
        final OrcCommander orcCommander = new OrcCommander(orcOfficer);

        handlers = List.of(orcCommander, orcOfficer, orcSoldier);
    }

    public void makeRequest(Request req) {
        handlers
                .stream()
                .sorted(Comparator.comparing(RequestHandler::getPriority))
                .filter(handler -> handler.isCanHandleRequest(req))
                .findFirst()
                .ifPresent(handler -> handler.handle(req));
    }

}
