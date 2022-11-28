package behavioral.chain;

public abstract class RequestHandler {

    private RequestHandler next;

    public RequestHandler(RequestHandler next) {
        this.next = next;
    }

    public void handle(Request request) {
        if (next != null) {
            next.handle(request);
        }
    }

    protected void printHandling(Request request) {
        System.out.printf("%s handling request \"{%s}\"\n", this, request);
    }

    @Override
    public abstract String toString();

    public abstract boolean isCanHandleRequest(Request request);

    public abstract int getPriority();

}
