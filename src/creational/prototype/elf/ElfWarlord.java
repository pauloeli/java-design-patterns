package creational.prototype.elf;

import creational.prototype.base.Warlord;

import java.util.Objects;

public class ElfWarlord extends Warlord {

    private final String description;

    public ElfWarlord(String description) {
        this.description = description;
    }

    public ElfWarlord(ElfWarlord source) {
        super(source);
        this.description = source.description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ElfWarlord that = (ElfWarlord) o;
        return Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description);
    }

    @Override
    public String toString() {
        return "Elven warlord helps in " + description;
    }

}
