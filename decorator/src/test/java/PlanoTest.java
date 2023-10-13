import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PlanoTest {

    @Test
    void deveRetornarPreco() {
        Plano plano = new PlanoInternet(20.00f);

        assertEquals(20.00f, plano.getPreco());
    }

    @Test
    void deveRetornarPrecoComMensalidadeNetflix() {
        Plano plano = new MensalidadeNetflix(new PlanoInternet(20.00f));

        assertEquals(21.30f, plano.getPreco());
    }

    @Test
    void deveRetornarPrecoComMensalidadeHaboMax() {
        Plano plano = new MensalidadeHboMax(new PlanoInternet(20.00f));

        assertEquals(23.00f, plano.getPreco());
    }

    @Test
    void deveRetornarPrecoComMensalidadeAmazonPrime() {
        Plano plano = new MensalidadeAmazonPrime(new PlanoInternet(20.00f));

        assertEquals(23.80f, plano.getPreco());
    }
    @Test
    void deveRetornarPrecoComMensalidadeNetflixMaisMensalidadeHboMax() {
        Plano plano = new MensalidadeNetflix(new MensalidadeHboMax(new PlanoInternet(20.00f)));

        assertEquals(24.30f, plano.getPreco());
    }

    @Test
    void deveRetornarPrecoComMensalidadeNetflixMaisMensalidadeAmazonPrime() {
        Plano plano = new MensalidadeNetflix(new MensalidadeAmazonPrime(new PlanoInternet(20.00f)));

        assertEquals(25.10f, plano.getPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoComMensalidadeHaboMaxMaisMensalidadeAmazonPrime() {
        Plano plano = new MensalidadeHboMax(new MensalidadeAmazonPrime(new PlanoInternet(20.00f)));

        assertEquals(26.80f, plano.getPreco(), 0.01f);
    }

    @Test
    void deveRetornarPrecoComMensalidadeNetflixMaisMensalidadeHaboMaxMaisMensalidadeAmazonPrime() {
        Plano plano = new MensalidadeNetflix(new MensalidadeHboMax(new MensalidadeAmazonPrime(new PlanoInternet(20.00f))));

        assertEquals(28.10f, plano.getPreco(), 0.01f);
    }

}
