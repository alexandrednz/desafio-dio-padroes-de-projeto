package one.digitalinnovation.gof.exemplostrategy;

public class HumorIrritado implements Humor {
    @Override
    public void interagir() {
        System.out.println("O chefe te ignorou." );
    }
}
