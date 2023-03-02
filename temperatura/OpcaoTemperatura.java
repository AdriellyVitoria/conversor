package temperatura;

import javax.swing.*;
                                                                    
public class OpcaoTemperatura {
    public String showOptions() {

        String opcoes = JOptionPane.showInputDialog(null,
        "Para qual temperatura deseja fazer a conversão?",
        "Menu",
        JOptionPane.PLAIN_MESSAGE,
        null,
        new Object[]
        {"Celsiu (C) para Fahrenheit (F)",
        "Celsiu (C) para Kelvin (K)",
        "Fahrenheit (F) para Celsiu (C)",
        "Kelvin (K) para Celsiu (C)",
        "Fahrenheit (F) Para Kelvin (K)",
        "Kelvin (K) para Fahrenheit (F)",
        }, "Escolha").toString();

        return opcoes;
    }
}
