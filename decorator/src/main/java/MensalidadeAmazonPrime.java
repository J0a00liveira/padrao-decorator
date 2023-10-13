public class MensalidadeAmazonPrime extends PlanoDecorator {

    public MensalidadeAmazonPrime(Plano plano) {
        super(plano);
    }

    public float getPrecoExtra() {
        return 3.80f;
    }
}
