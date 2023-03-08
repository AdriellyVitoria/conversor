package moedas;

public class Moedas {
    private Inputs inputs = new Inputs();
    private ConversorMoeda conversor = new ConversorMoeda();

    public void executa(){
        String opcaoMoeda = inputs.opcoesMoedas();
        double valor = inputs.recebeValor(opcaoMoeda);
        double valorConvertido = conversor.verificaEExecutaConversao(opcaoMoeda, valor);
        String result = String.format("%.2f", valorConvertido);
        conversor.valorDaConversao(result);
       

    }
}
