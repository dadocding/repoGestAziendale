package Grafica;

import javax.swing.*;

public class TestGui {
    public static void main(String[] args) {

        try {
            com.formdev.flatlaf.intellijthemes.FlatCarbonIJTheme.setup();
        } catch(Exception ex) {
            System.err.println("Errore FlatLaf: " + ex.getMessage());
        }

        java.awt.EventQueue.invokeLater(() -> {

            MainGui gui = new MainGui();

            gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            gui.setLocationRelativeTo(null);
            gui.setVisible(true);
        });
    }
}
