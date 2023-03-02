package Quilometragem;
import gerais.Menu;

public class InputsQuilometragem {
    public String menu() {
        Menu menu = new Menu();
        String resposta = menu.showMenu();
        return resposta;
    }

    public String opcaoQuilometragem(){
        OpcaoQuilometragem opcaoQuilometragem = new OpcaoQuilometragem();
        String opcoes = opcaoQuilometragem.showOptions();
        return opcoes;
    }

    public double RecebeQuilometragem(String opcaoQuilometragem) {
        RecebeQuilometragem entrada = new RecebeQuilometragem();
        double valor = entrada.entradaDoValor(opcaoQuilometragem);
        return valor;

    }
        
}
