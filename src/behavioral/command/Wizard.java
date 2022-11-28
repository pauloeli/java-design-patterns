package behavioral.command;

import java.util.Deque;
import java.util.LinkedList;

public class Wizard {

    private final Deque<Command> undoStack = new LinkedList<>();
    private final Deque<Command> redoStack = new LinkedList<>();

    public Wizard() {
    }

    public void castSpell(Command command, Target target) {
        System.out.println(this + " casts " + command + " at " + target);

        command.execute(target);

        undoStack.offerLast(command);
    }

    public void undoLastSpell() {
        if (!undoStack.isEmpty()) {
            Command previousSpell = undoStack.pollLast();
            redoStack.offerLast(previousSpell);

            System.out.println(this + " undoes " + previousSpell);

            previousSpell.undo();
        }
    }

    public void redoLastSpell() {
        if (!redoStack.isEmpty()) {
            Command previousSpell = redoStack.pollLast();
            undoStack.offerLast(previousSpell);

            System.out.println(this + " redoes " + previousSpell);

            previousSpell.redo();
        }
    }

    @Override
    public String toString() {
        return "Wizard";
    }

}
