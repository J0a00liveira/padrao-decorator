public class MensalidadeHboMax extends PlanoDecorator {

    public MensalidadeHboMax(Plano plano) {
        super(plano);
    }

    public float getPrecoExtra() {
        return 3.00f;
    }
}
