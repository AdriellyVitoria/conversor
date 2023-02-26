package moedas;
import javax.swing.*;

public class ConversorMoeda {

    public double verificaEExecutaConversao(String opcaoMoeda, double valor) {
        double valorConvertido = 0;

        if (opcaoMoeda == "De Reais a Dólares") {
            valorConvertido = valor / 5.21;

        } else if (opcaoMoeda == "De Reais a Euros") {
            valorConvertido = valor / 5.51;
        } else if (opcaoMoeda == "De Reais a Libras") {
            valorConvertido = valor / 6.20;
        } else if (opcaoMoeda == "De Reais a Yenes") {
            valorConvertido = valor * 26;
        } else if (opcaoMoeda == "De Reais a Won Coreano") {
            valorConvertido = valor * 252;
        } else if (opcaoMoeda == "De Dólares a Reais") {
            valorConvertido = valor * 5.21;
        } else if (opcaoMoeda == "De Euros a Reais") {
            valorConvertido = valor * 5.51;
        } else if (opcaoMoeda == "De Libras a Reais") {
            valorConvertido = valor * 6.20;
        } else if (opcaoMoeda == "De Yene a Reais") {
            valorConvertido = valor * 26;
        } else if (opcaoMoeda == "De Won Coreano a Reais") {
            valorConvertido = valor * 252;
        } 
        return valorConvertido;
    }

    public  void valorDaConversao (String valor) {
        JOptionPane.showMessageDialog(null, "O valor da conversão é de $ " + valor );
    }
}
