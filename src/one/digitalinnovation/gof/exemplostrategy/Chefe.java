package one.digitalinnovation.gof.exemplostrategy;

public class Chefe {

    private Humor humor;

    public void setHumor(Humor humor) {
        this.humor = humor;
    }

    public void interagir(){
        humor.interagir();
    }
}
