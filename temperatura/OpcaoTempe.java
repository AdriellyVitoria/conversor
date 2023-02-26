package temperatura;

import javax.swing.*;
                                                                    
public class OpcaoTempe {
    public String showOptions() {

        String opcoes = JOptionPane.showInputDialog(null,
        "Para qual temperatura deseja fazer a conversão?",
        "Menu",
        JOptionPane.PLAIN_MESSAGE,
        null,
        new Object[]
        {"Celsiu (C) para Fahrenheit (F)",
        "Celsiu (C) para Kelvin (K)",
        "Fahrenheit (F) para Calsiu (C)",
        "Kelvin (K) para Celsiu",
        "Fahrenheit (F) Para Kelvin (K)",
        "Kelvin (K) para Fahrenheit (F)",
        }, "Escolha").toString();

        return opcoes;
    }
}
