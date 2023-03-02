package temperatura;
import javax.swing.JOptionPane;

public class RebeceTemperatura {
    
    public double entradaDoValorTempe(String opcaoTempe) {
       boolean continua = true;
        float number = 0;
        while (continua) {
            String input = JOptionPane.showInputDialog(null, "Digite um valor para a conversão" + opcaoTempe + ":", null, 0);

            try {
                number = Float.parseFloat(input);
                continua = false;
            } catch (NumberFormatException e) {   
                JOptionPane.showMessageDialog(null,
                "Entrada inválida. Por favor, digite um VALOR... ou adicionem um ponto em vez da virgula!!", input, JOptionPane.ERROR_MESSAGE);
            }
        }        
        return number;
    }

    public String showOptions() {
        return null;
    }
}
