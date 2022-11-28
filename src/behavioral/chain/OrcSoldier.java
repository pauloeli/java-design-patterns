package behavioral.chain;

import static behavioral.chain.RequestType.DEFEND_CASTLE;

public class OrcSoldier extends RequestHandler {

    public OrcSoldier(RequestHandler next) {
        super(next);
    }

    @Override
    public void handle(Request request) {
        if (request.getRequestType().equals(DEFEND_CASTLE)) {
            printHandling(request);
            request.markHandled();
        } else {
            super.handle(request);
        }
    }

    @Override
    public String toString() {
        return "Orc soldier";
    }

    @Override
    public boolean isCanHandleRequest(Request request) {
        return request.getRequestType().equals(DEFEND_CASTLE);
    }

    @Override
    public int getPriority() {
        return 3;
    }

}