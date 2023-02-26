package temperatura;

import javax.swing.JOptionPane;

public class RebeceTempe {
    
    public void entradaDoValorTempe(String[] opcaoTempe) {
        String input = JOptionPane.showInputDialog(null, "Digite um valor para a conversão" + opcaoTempe + ":", null, 0);
        float number = 0;
        try {

            number = Float.parseFloat(input);
            JOptionPane.showMessageDialog(null,
            "Você digitou o valor " + number);

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(null,
            "Entrada inválida. Por favor, digite um VALOR...", input, JOptionPane.ERROR_MESSAGE);
        }
    }
}
