package Quilometragem;
import javax.swing.*;

public class ConversorQuilometragem {
    
    public double verificaEExecutaConversao(String opcaoQuilometragem, double valor) {
        double valorConvertido = 0;
  
        if (opcaoQuilometragem == "Quilometro (km) para Metro (m)") {
            valorConvertido = valor * 1000;
        } else if (opcaoQuilometragem == "Quilometro (km) para Centímetro (cm)") {
            valorConvertido = valor * 100000;
        } else if (opcaoQuilometragem == "Metro (m) para Quilometro (km)" ) {
            valorConvertido = valor / 1000;
        } else if (opcaoQuilometragem == "Centímetro (cm) para Quilometro (km)" ) {
            valorConvertido = valor / 100000;            ;
        } else if (opcaoQuilometragem == "Centímetro (cm) para Metro (m)" ) {
            valorConvertido = valor / 100;
        } else if (opcaoQuilometragem == "Metro (m) para Centímetro (cm)") {
            valorConvertido = valor * 100;
        }
        return valorConvertido;
    } // talvez a entrada por valor vai está errada verificar
    public void valorDaConversao (String valor) {
        JOptionPane.showMessageDialog(null, "O valor da conversão é de $ " + valor );
    }
}
