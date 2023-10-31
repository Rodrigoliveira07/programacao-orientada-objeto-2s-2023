import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PessoaTest {

    @Test
    public void testDizerOla() {
        Pessoa pessoa = new Pessoa();
        String mensagemEsperada = "Ola!";
        assertEquals(mensagemEsperada, pessoa.dizerOla());
    }
}

