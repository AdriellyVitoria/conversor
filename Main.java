import gerais.Cancelar;
import gerais.Continuar;
import moedas.Inputs;
import moedas.Moedas;
import temperatura.Temperatura;
import Quilometragem.Quilometros;

public class Main {
    public static void main(String[] args) {
        Inputs inputs = new Inputs();
        Moedas moedas = new Moedas();
        Temperatura temperatura = new Temperatura();
        Quilometros quilometros = new Quilometros();
        Continuar continuar = new Continuar();

        try {
            int continua = 0;
            while (continua == 0) {
                String opcao = inputs.menu();

                if (opcao == "Conversor de Moeda"){
                    moedas.executa();
                
                } else if (opcao == "Conversor de Temperatura") {
                    temperatura.executa();

                } else if (opcao == "Quilometragem") {
                    quilometros.executa();

                } else {

                }
                continua = continuar.querContinuar();
            }
        } catch (Exception e) {
            Cancelar cancelar = new Cancelar();
            cancelar.showCancelar();
        }
    }
}
