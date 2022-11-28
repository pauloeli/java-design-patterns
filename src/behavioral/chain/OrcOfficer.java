package behavioral.chain;

import static behavioral.chain.RequestType.TORTURE_PRISONER;

public class OrcOfficer extends RequestHandler {

    public OrcOfficer(RequestHandler next) {
        super(next);
    }

    @Override
    public void handle(Request request) {
        if (request.getRequestType().equals(TORTURE_PRISONER)) {
            printHandling(request);
            request.markHandled();
        } else {
            super.handle(request);
        }
    }

    @Override
    public String toString() {
        return "Orc officer";
    }

    @Override
    public boolean isCanHandleRequest(Request request) {
        return request.getRequestType().equals(TORTURE_PRISONER);
    }

    @Override
    public int getPriority() {
        return 2;
    }

}
