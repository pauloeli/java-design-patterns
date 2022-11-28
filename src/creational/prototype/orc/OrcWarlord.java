package creational.prototype.orc;

import creational.prototype.base.Warlord;

import java.util.Objects;

public class OrcWarlord extends Warlord {

    private final String weapon;

    public OrcWarlord(String weapon) {
        this.weapon = weapon;
    }

    public OrcWarlord(OrcWarlord source) {
        super(source);
        this.weapon = source.weapon;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrcWarlord that = (OrcWarlord) o;
        return Objects.equals(weapon, that.weapon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(weapon);
    }

    @Override
    public String toString() {
        return "Orcish warload attacks with " + weapon;
    }

}
