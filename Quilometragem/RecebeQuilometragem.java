package Quilometragem;
import javax.swing.*;

public class RecebeQuilometragem {
    
    public double entradaDoValor(String opcaoQuilometragem) {
        double number = 0;
        boolean continua = true;
        
        while (continua) {
            String input = JOptionPane.showInputDialog(null, "Digite um valor para a conversão" , null, 0);

            try {
                number = Float.parseFloat(input);
                continua = false;
            } catch (NumberFormatException e) {   
                JOptionPane.showMessageDialog(null,
                "Entrada inválida. Por favor, digite um VALOR...", input, JOptionPane.ERROR_MESSAGE);
            }
        }        
        return number;
    }
    public String showOptions() {
        return null;
    }
    }
