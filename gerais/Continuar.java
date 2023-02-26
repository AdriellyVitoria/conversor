package gerais;
import javax.swing.*;

public class Continuar {
    public int querContinuar() {
        Object[] opcoes = {"Sim", "Não", "Cancelar"};
        int opcaoSelecionada = JOptionPane.showOptionDialog
        (null,
        "Deseja continuar?",
        "Continuar",
        JOptionPane.YES_NO_CANCEL_OPTION,
        JOptionPane.QUESTION_MESSAGE ,
        null, opcoes, opcoes);

        if (opcaoSelecionada == 1) {
            JOptionPane.showMessageDialog(null, "Programa Finalizando, Volter sempre", null, opcaoSelecionada);
        }

        return opcaoSelecionada;
    }
}
