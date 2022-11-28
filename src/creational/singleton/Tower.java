package creational.singleton;

public class Tower {

    private static Tower tower;

    private Tower() {
    }

    public static synchronized Tower getInstance() {
        if (tower == null) {
            tower = new Tower();
        }
        return tower;
    }

}
