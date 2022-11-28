package behavioral.template;

public abstract class StealingMethod {

    protected abstract String pickTarget();

    protected abstract void confuseTarget(String target);

    protected abstract void stealTheItem(String target);

    public final void steal() {
        var target = pickTarget();
        System.out.printf("\nThe target has been chosen as %s.", target);
        confuseTarget(target);
        stealTheItem(target);
    }

}
