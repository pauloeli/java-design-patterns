package creational.abstractfactory;

import creational.abstractfactory.elf.ElfKingdomFactory;
import creational.abstractfactory.orc.OrcKingdomFactory;

import java.util.function.Supplier;

public enum KingdomType {

    ELF(ElfKingdomFactory::new),
    ORC(OrcKingdomFactory::new);

    private final Supplier<KingdomFactory> constructor;

    KingdomType(Supplier<KingdomFactory> constructor) {
        this.constructor = constructor;
    }

    public Supplier<KingdomFactory> getConstructor() {
        return constructor;
    }

}
