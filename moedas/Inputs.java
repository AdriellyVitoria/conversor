package moedas;

import gerais.Menu;

public class Inputs {
    public String menu() {
        Menu menu = new Menu();
        String resposta = menu.showMenu();
        return resposta;
    }

    public String opcoesMoedas() {
        OpcoesMoedas opcoesMoedas = new OpcoesMoedas();
        String opcao = opcoesMoedas.showOptions();
        return opcao;
    }

    public double recebeValor(String opcaoMoeda) {
        RecebeValor entrada = new RecebeValor();
        double valor = entrada.entradaDoValor(opcaoMoeda);
        return valor;
    }

	public void recebeTempe(String opcaoTempe) {
	}
}
