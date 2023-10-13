public class MensalidadeNetflix extends PlanoDecorator {

    public MensalidadeNetflix(Plano plano) {
        super(plano);
    }

    public float getPrecoExtra() {
        return 1.30f;
    }
}
