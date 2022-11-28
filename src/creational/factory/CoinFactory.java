package creational.factory;

public class CoinFactory {

    public static Coin getInstance(final CoinType type) {
        return type.getConstructor().get();
    }

}
