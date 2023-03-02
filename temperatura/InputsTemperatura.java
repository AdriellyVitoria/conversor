package temperatura;

public class InputsTemperatura {

    public String opcaoTempe() {
        OpcaoTemperatura opcaoTempe = new OpcaoTemperatura();
        String opcao = opcaoTempe.showOptions();
        return opcao;
    }

    public double recebeTemperatura(String opcaoTempe) {
        RebeceTemperatura recebeTemperatura = new RebeceTemperatura();
        double recebe = recebeTemperatura.entradaDoValorTempe(opcaoTempe);
        return recebe;
    }

    public String conversaoTemperatura() {
        ConversaoTemperatura conversaoTemperatura = new ConversaoTemperatura();
        String conversao = conversaoTemperatura.showOptions();
        return conversao;
    }
}
     