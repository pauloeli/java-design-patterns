package creational.prototype;

import creational.prototype.base.Beast;
import creational.prototype.base.Mage;
import creational.prototype.base.Warlord;

public interface HeroFactory {

    Mage createMage();

    Warlord createWarlord();

    Beast createBeast();

}
