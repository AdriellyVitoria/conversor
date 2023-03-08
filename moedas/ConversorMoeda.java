package moedas;
import javax.swing.*;

public class ConversorMoeda {
    private String simbolo;

    public double verificaEExecutaConversao(String opcaoMoeda, double valor) {
        double valorConvertido = 0;

        if (opcaoMoeda == "De Reais a Dólares") {
            valorConvertido = valor / 5.21;
            simbolo = "U$ ";
        } else if (opcaoMoeda == "De Reais a Euros") {
            valorConvertido = valor / 5.51;
            simbolo = "€";
        } else if (opcaoMoeda == "De Reais a Libras") {
            valorConvertido = valor / 6.20;
            simbolo = "£";
        } else if (opcaoMoeda == "De Reais a Ienes") {
            valorConvertido = valor * 26;
            simbolo = "¥";
        } else if (opcaoMoeda == "De Reais a Won Coreano") {
            valorConvertido = valor * 252;
            simbolo = "₩";
        } else if (opcaoMoeda == "De Dólares a Reais") {
            valorConvertido = valor * 5.21;
            simbolo = "R$";
        } else if (opcaoMoeda == "De Euros a Reais") {
            valorConvertido = valor * 5.51;
            simbolo = "R$";
        } else if (opcaoMoeda == "De Libras a Reais") {
            valorConvertido = valor * 6.20;
            simbolo = "R$";
        } else if (opcaoMoeda == "De Yene a Reais") {
            valorConvertido = valor * 26;
            simbolo = "R$";
        } else if (opcaoMoeda == "De Won Coreano a Reais") {
            valorConvertido = valor * 252;
            simbolo = "R$";
        } 
        return valorConvertido;
    }

    public  void valorDaConversao (String valor) {
        JOptionPane.showMessageDialog(null, "O valor da conversão é de " + simbolo + valor );
    }
}
