package temperatura;
import javax.swing.*;
public class ConversaoTemperatura {

    public double verificarEExecutarConversao(String opcaoTemperatura, double valor) {
        double valorConvertido = 0;

        if (opcaoTemperatura == "Celsiu (C) para Fahrenheit (F)") {
            valorConvertido = (valor * 9/5) + 32;
        } else if (opcaoTemperatura == "Celsiu (C) para Kelvin (K)" ) {
            valorConvertido = valor + 273.15;
        } else if (opcaoTemperatura == "Fahrenheit (F) para Celsiu (C)" ) {
            valorConvertido = (valor - 32) / 1.8;
        } else if (opcaoTemperatura == "Kelvin (K) para Celsiu") {
            valorConvertido = 30 - 273.15;
        } else if (opcaoTemperatura == "Fahrenheit (F) Para Kelvin (K)" ) {
            valorConvertido = (valor - 32) * 5/9 + 2;
        } else if (opcaoTemperatura == "Kelvin (K) para Fahrenheit (F)" ) {
            valorConvertido = (valor - 273.15) * 9/5 + 32;
        }

        return valorConvertido;
    }
   
    public  void valorDaConversao (String valor) {
        JOptionPane.showMessageDialog(null, "O valor da conversão é de $ " + valor );
    }

    public String showOptions() {
        return null;
    }
}
