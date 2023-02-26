package gerais;
import javax.swing.*;

public class Menu {
  // PARA PEGAR AS OPÇOES EM LISTAS... falta mostra a opção que escolheu
  public String showMenu() {  

    String escolha = JOptionPane.showInputDialog(
      null,
      "Tipos de conversores",
      "COVERSORES",
      JOptionPane.PLAIN_MESSAGE,
      null,
      new Object[] {
        "Conversor de Moeda", "Conversor de Temperatura"
      },
      "Escolha"
    ).toString();

    return escolha;
                  
    //     if (escolha != JOptionPane.CLOSED_OPTION) {
    //         JOptionPane.showMessageDialog(null, "Você escolheu a opção " + opcoes[escolha]);
    // } 
  }
}
