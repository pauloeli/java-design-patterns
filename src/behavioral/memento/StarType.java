package behavioral.memento;

public enum StarType {

    SUN("sun"),
    RED_GIANT("red giant"),
    WHITE_DWARF("white dwarf"),
    SUPERNOVA("supernova"),
    DEAD("dead star");

    private final String description;

    StarType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return this.getDescription();
    }

}
