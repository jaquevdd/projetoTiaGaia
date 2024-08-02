package robos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class GaiaRobo {

    private ChromeDriver navegador;

    public GaiaRobo() {
        WebDriverManager.chromedriver().setup();
        navegador = new ChromeDriver();
    }

    public void acessarSite(String urlSite) {
        navegador.get(urlSite);
    }

    public String lerTituloDaPagina () {
        return navegador.getTitle();
    }

    public void fazerLogin() {

    }

    public void lancarNota() {
        System.out.println("Vou lançar uma nota ficsal!");

    }
}
