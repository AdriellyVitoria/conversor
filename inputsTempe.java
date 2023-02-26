import temperatura.*;

public class inputsTempe {
    public static String opcaoTempe() {
        OpcaoTempe opcaoTempe = new OpcaoTempe();
        String opcao = opcaoTempe.showOptions();
        return opcao;
    }

    // public String recebeTempe() {
    //     RebeceTempe recebeTempe = new RebeceTempe();
    //     String recebe = recebeTempe.showOptions();
    //     return recebe;

    // }
}
