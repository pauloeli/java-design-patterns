package behavioral.chain;

import static behavioral.chain.RequestType.COLLECT_TAX;

public class OrcCommander extends RequestHandler {

    public OrcCommander(RequestHandler next) {
        super(next);
    }

    @Override
    public void handle(Request request) {
        if (request.getRequestType().equals(COLLECT_TAX)) {
            printHandling(request);
            request.markHandled();
        } else {
            super.handle(request);
        }
    }

    @Override
    public String toString() {
        return "Orc commander";
    }

    @Override
    public boolean isCanHandleRequest(Request request) {
        return request.getRequestType().equals(COLLECT_TAX);
    }

    @Override
    public int getPriority() {
        return 1;
    }

}
