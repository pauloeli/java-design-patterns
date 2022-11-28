package creational.prototype.orc;

import creational.prototype.base.Mage;

import java.util.Objects;

public class OrcMage extends Mage {

    private final String weapon;

    public OrcMage(String weapon) {
        this.weapon = weapon;
    }

    public OrcMage(OrcMage source) {
        super(source);
        this.weapon = source.weapon;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrcMage orcMage = (OrcMage) o;
        return Objects.equals(weapon, orcMage.weapon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(weapon);
    }

    @Override
    public String toString() {
        return "Orcish mage attacks with " + weapon;
    }

}
