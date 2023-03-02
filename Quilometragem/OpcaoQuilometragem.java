package Quilometragem;
import javax.swing.*;

public class OpcaoQuilometragem {
    public String showOptions() {

        String opcoes = JOptionPane.showInputDialog(null,
        "Qual unidade de medida deseja fazer a conversão? ", 
        "Menu", 
        JOptionPane.PLAIN_MESSAGE,
        null, 
        new Object[] 
        {"Quilometro (km) para Metro (m)", 
        "Quilometro (km) para Centímetro (cm)",
        "Metro (m) para Quilometro (km)",
        "Centímetro (cm) para Quilometro (km)",
        "Centímetro (cm) para Metro (m)",
        "Metro (m) para Centímetro (cm)" }, 
        "Escolha").toString();

        return opcoes;
    }

    // public String showOptions() {
    //     return null;
    // }
}
