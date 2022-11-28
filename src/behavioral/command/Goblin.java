package behavioral.command;

import static behavioral.command.Size.NORMAL;
import static behavioral.command.Size.SMALL;
import static behavioral.command.Visibility.INVISIBLE;
import static behavioral.command.Visibility.VISIBLE;

public class Goblin extends Target {

    public Goblin() {
        setSize(NORMAL);
        setVisibility(VISIBLE);
    }

    @Override
    public String toString() {
        return "Goblin";
    }

    public void changeSize() {
        setSize(getSize() == NORMAL ? SMALL : NORMAL);
    }

    public void changeVisibility() {
        setVisibility(getVisibility() == INVISIBLE ? VISIBLE : INVISIBLE);
    }

}
