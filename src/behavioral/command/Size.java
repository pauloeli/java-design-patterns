package behavioral.command;

public enum Size {

    SMALL("small"),
    NORMAL("normal"),
    LARGE("large"),
    UNDEFINED("");

    private final String title;

    Size(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }

}
