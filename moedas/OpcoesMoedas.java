package moedas;
import javax.swing.*;

public class OpcoesMoedas {
    public String showOptions() {

        String opcao = JOptionPane.showInputDialog(
            null,
            "Escolha a moeda para a qual você deseja girar seu dinheiro: ",
            "Menu",
            JOptionPane.PLAIN_MESSAGE,
            null,
            new Object[] {
            "De Reais a Dólares",
            "De Reais a Euros",
            "De Reais a Libras",
            "De Reais a Yenes",
            "De Reais a Won Coreano",
            "De Dólares a Reais",
            "De Euros a Reais",
            "De Libras a Reais",
            "De Yene a Reais",
            "De Won Coreano a Reais"}, 
            "Escolha").toString();
        
        return opcao;
    } 
}
