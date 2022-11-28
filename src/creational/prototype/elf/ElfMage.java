package creational.prototype.elf;

import creational.prototype.base.Mage;

import java.util.Objects;

public class ElfMage extends Mage {

    private final String description;

    public ElfMage(String description) {
        this.description = description;
    }

    public ElfMage(ElfMage source) {
        super(source);
        this.description = source.description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ElfMage elfMage = (ElfMage) o;
        return Objects.equals(description, elfMage.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description);
    }

    @Override
    public String toString() {
        return "Elven mage helps in " + description;
    }

}
