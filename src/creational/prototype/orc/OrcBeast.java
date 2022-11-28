package creational.prototype.orc;

import creational.prototype.base.Beast;

import java.util.Objects;

public class OrcBeast extends Beast {

    private final String weapon;

    public OrcBeast(OrcBeast orcBeast) {
        super(orcBeast);
        this.weapon = orcBeast.weapon;
    }

    public OrcBeast(String weapon) {
        super();
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Orcish wolf attacks with " + weapon;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrcBeast orcBeast = (OrcBeast) o;
        return Objects.equals(weapon, orcBeast.weapon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(weapon);
    }

}
