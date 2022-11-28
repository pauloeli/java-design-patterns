package creational.abstractfactory.elf;

import creational.abstractfactory.Castle;

public class ElfCastle implements Castle {

    @Override
    public String getDescription() {
        return "This is the elven castle!";
    }

}
