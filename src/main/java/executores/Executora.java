package executores;

import robos.GaiaRobo;

public class Executora {
    public static void main(String[] args) {
        GaiaRobo umaGaiaRobo = new GaiaRobo();

        umaGaiaRobo.acessarSite("https://www.youtube.com/");
        umaGaiaRobo.fazerLogin();
        umaGaiaRobo.lancarNota();

        GaiaRobo umaOutraGaiaRobo = new GaiaRobo();
        umaOutraGaiaRobo.acessarSite("https://www.google.com.br/");

    }
}
