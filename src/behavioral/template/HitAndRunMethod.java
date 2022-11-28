package behavioral.template;

public class HitAndRunMethod extends StealingMethod {

    @Override
    protected String pickTarget() {
        return "old goblin woman";
    }

    @Override
    protected void confuseTarget(String target) {
        System.out.printf("\nApproach the %s from behind.", target);
    }

    @Override
    protected void stealTheItem(String target) {
        System.out.print("\nGrab the handbag and run away fast!");
    }

}
