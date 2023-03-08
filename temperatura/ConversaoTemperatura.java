package temperatura;
import javax.swing.*;
public class ConversaoTemperatura {
    private String simbolo;
    public double verificarEExecutarConversao(String opcaoTemperatura, double valor) {
        double valorConvertido = 0;

        if (opcaoTemperatura == "Celsiu (C) para Fahrenheit (F)") {
            valorConvertido = (valor * 9/5) + 32;
            simbolo = "Fº";
        } else if (opcaoTemperatura == "Celsiu (C) para Kelvin (K)" ) {
            valorConvertido = valor + 273.15;
            simbolo = "Kº";
        } else if (opcaoTemperatura == "Fahrenheit (F) para Celsiu (C)" ) {
            valorConvertido = (valor - 32) / 1.8;
            simbolo = "Cº";
        } else if (opcaoTemperatura == "Kelvin (K) para Celsiu") {
            valorConvertido = 30 - 273.15;
            simbolo = "Cº";
        } else if (opcaoTemperatura == "Fahrenheit (F) Para Kelvin (K)" ) {
            valorConvertido = (valor - 32) * 5/9 + 2;
            simbolo = "Kº";
        } else if (opcaoTemperatura == "Kelvin (K) para Fahrenheit (F)" ) {
            valorConvertido = (valor - 273.15) * 9/5 + 32;
            simbolo = "Fº";
        }

        return valorConvertido;
    }
   
    public  void valorDaConversao (String valor) {
        JOptionPane.showMessageDialog(null, "A conversão dá: "  + valor + simbolo );
    }

    public String showOptions() {
        return null;
    }
}
