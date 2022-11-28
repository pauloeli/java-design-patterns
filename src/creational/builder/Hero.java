package creational.builder;

import java.util.Objects;

public class Hero {

    private final Profession profession;

    private final String name;

    private final HairType hairType;

    private final HairColor hairColor;

    private final Armor armor;

    private final Weapon weapon;

    public Hero(Profession profession,
                String name,
                HairType hairType,
                HairColor hairColor,
                Armor armor,
                Weapon weapon) {
        Objects.requireNonNull(profession, "profession is required");
        Objects.requireNonNull(name, "name is required");

        this.profession = profession;
        this.name = name;
        this.hairType = hairType;
        this.hairColor = hairColor;
        this.armor = armor;
        this.weapon = weapon;
    }

    /* Some IDE's, like IntellIJ auto identify this pattern */
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        return "Hero{" +
                "profession=" + profession +
                ", name='" + name + '\'' +
                ", hairType=" + hairType +
                ", hairColor=" + hairColor +
                ", armor=" + armor +
                ", weapon=" + weapon +
                '}';
    }

    public static class Builder {

        private Profession profession;

        private String name;

        private HairType hairType;

        private HairColor hairColor;

        private Armor armor;

        private Weapon weapon;

        public Builder() {
        }

        public Builder profession(Profession profession) {
            this.profession = profession;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder withHairType(HairType hairType) {
            this.hairType = hairType;
            return this;
        }

        public Builder withHairColor(HairColor hairColor) {
            this.hairColor = hairColor;
            return this;
        }

        public Builder withArmor(Armor armor) {
            this.armor = armor;
            return this;
        }

        public Builder withWeapon(Weapon weapon) {
            this.weapon = weapon;
            return this;
        }

        /*
         * With this approach you duplicate de variables, but you have more control to customize.
         * If you like, you can pass the Builder object or set properties by "set" methods.
         * */
        public Hero build() {
            return new Hero(
                    profession,
                    name,
                    hairType,
                    hairColor,
                    armor != null ? armor : Armor.NONE,
                    weapon != null ? weapon : Weapon.NONE
            );
        }
    }

}
