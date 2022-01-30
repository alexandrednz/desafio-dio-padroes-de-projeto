package one.digitalinnovation.gof.exemplostrategy;

public class HumorExtremamenteAlegre implements Humor{
    @Override
    public void interagir() {
        System.out.println("Chefe: - Bom dia! Estou muito satisfeito com seu trabalho nos últimos dias. " +
                "Passe mais tarde na minha sala para conversarmos sobre aquela promoção ;)");
    }
}
