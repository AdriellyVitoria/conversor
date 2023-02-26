import gerais.Cancelar;
import gerais.Continuar;
import moedas.Inputs;
import moedas.Moedas;

public class Main {
    public static void main(String[] args) {
        Inputs inputs = new Inputs();
        Moedas moedas = new Moedas();
        Continuar continuar = new Continuar();

        try {
            int continua = 0;
            while (continua == 0) {
                String opcao = inputs.menu();

                if (opcao == "Conversor de Moeda"){
                    moedas.executa();
                } else {
                    String opcaoTempe = inputsTempe.opcaoTempe();
                    inputs.recebeTempe(opcaoTempe);
                }

                continua = continuar.querContinuar();
            }
        } catch (NullPointerException e) {
            Cancelar cancelar = new Cancelar();
            cancelar.showCancelar();
        }
    }
}
