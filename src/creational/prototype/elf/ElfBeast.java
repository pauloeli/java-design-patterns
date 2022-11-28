package creational.prototype.elf;

import creational.prototype.base.Beast;

import java.util.Objects;

public class ElfBeast extends Beast {

    private final String description;

    public ElfBeast(String description) {
        this.description = description;
    }

    public ElfBeast(ElfBeast source) {
        super(source);
        this.description = source.description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ElfBeast elfBeast = (ElfBeast) o;
        return Objects.equals(description, elfBeast.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description);
    }

    @Override
    public String toString() {
        return "Elven beast helps in " + description;
    }

}
