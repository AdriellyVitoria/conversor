package Quilometragem;

public class Quilometros {
    InputsQuilometragem inputsQuilometragem = new InputsQuilometragem();
    ConversorQuilometragem conversor = new ConversorQuilometragem();

    public void executa() {
        String opcaoQuilometragem = inputsQuilometragem.opcaoQuilometragem();
        double valor = inputsQuilometragem.RecebeQuilometragem(opcaoQuilometragem);
        double valorConvertido = conversor.verificaEExecutaConversao(opcaoQuilometragem, valor);
        String result = String.format("%.2f", valorConvertido);
        conversor.valorDaConversao(result);
    }
    
}
