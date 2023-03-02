package temperatura;

public class Temperatura {
    InputsTemperatura inputsTemperatura = new InputsTemperatura();
    ConversaoTemperatura conversor = new ConversaoTemperatura();

    public void executa(){
        String opcaoTempe = inputsTemperatura.opcaoTempe();
        double recebe = inputsTemperatura.recebeTemperatura(opcaoTempe);
        double valorConvertido = conversor.verificarEExecutarConversao(opcaoTempe, recebe);
        String result = String.format("%.2f", valorConvertido);
        conversor.valorDaConversao(result);         
    }
    

}
