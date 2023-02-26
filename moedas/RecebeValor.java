package moedas;
import javax.swing.JOptionPane;

public class RecebeValor {

    public double entradaDoValor(String opcaoMoeda) {
        double number = 0;
        boolean continua = true;
        while (continua) {
            String input = JOptionPane.showInputDialog(null, "Digite um valor para a conversão de " + opcaoMoeda + ": ");
            try {
                number = Float.parseFloat(input);
                continua = false;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, digite um VALOR...", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }

        return number;
    }
}
    