package behavioral.command;

public enum Visibility {

    VISIBLE("visible"),
    INVISIBLE("invisible"),
    UNDEFINED("");

    private final String title;

    Visibility(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }

}
