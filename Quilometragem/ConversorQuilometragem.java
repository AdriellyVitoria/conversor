package Quilometragem;
import javax.swing.*;

public class ConversorQuilometragem {
    private String simbolo;
    
    public double verificaEExecutaConversao(String opcaoQuilometragem, double valor) {
        double valorConvertido = 0;
  
        if (opcaoQuilometragem == "Quilometro (km) para Metro (m)") {
            valorConvertido = valor * 1000;
            simbolo = "Quilometro (km) para Metro (m)";
        } else if (opcaoQuilometragem == "Quilometro (km) para Centímetro (cm)") {
            valorConvertido = valor * 100000;
            simbolo = "Quilometro (km) para Centímetro (cm)";
        } else if (opcaoQuilometragem == "Metro (m) para Quilometro (km)" ) {
            valorConvertido = valor / 1000;
            simbolo = "Metro (m) para Quilometro (km)";
        } else if (opcaoQuilometragem == "Centímetro (cm) para Quilometro (km)" ) {
            valorConvertido = valor / 100000;
            simbolo = "Centímetro (cm) para Quilometro (km)";            ;
        } else if (opcaoQuilometragem == "Centímetro (cm) para Metro (m)" ) {
            valorConvertido = valor / 100;
            simbolo = "Centímetro (cm) para Metro (m";
        } else if (opcaoQuilometragem == "Metro (m) para Centímetro (cm)") {
            valorConvertido = valor * 100;
            simbolo = "Metro (m) para Centímetro (cm)";
        }
        return valorConvertido;
    } // talvez a entrada por valor vai está errada verificar
    public void valorDaConversao (String valor) {
        JOptionPane.showMessageDialog(null, "O resultando da conversão e " + simbolo + valor );
    }
}
