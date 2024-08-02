package executores;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import robos.GaiaRobo;

@DisplayName("Validando o título da página inicial")
public class PaginaInicialTest {

    @Test
    @DisplayName("Validando se o título da página está correto")
    public void validarTituloDaPagina() {
        GaiaRobo titulo = new GaiaRobo();

        titulo.acessarSite("http://google.com.br");

        String tituloDaPagina = titulo.lerTituloDaPagina();

        Assertions.assertEquals("Google", tituloDaPagina);

        

    }
}
