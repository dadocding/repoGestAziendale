package Grafica;

import ClassiGenerali.GestionaleAziendale;
import javax.swing.*;

public class TestGui {
    public static void main(String[] args) {
        try {
            com.formdev.flatlaf.intellijthemes.FlatCarbonIJTheme.setup();
        } catch(Exception ex) {
            System.err.println("Errore nel caricamento del tema FlatLaf: " + ex.getMessage());
        }

        java.awt.EventQueue.invokeLater(() -> {
            GestionaleGui gui_gestionale = new GestionaleGui("Gestionale S2 SpA");
            LoginPanel login_panel = new LoginPanel();
            gui_gestionale.add(login_panel.getLogin_panel());
            gui_gestionale.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            gui_gestionale.setLocationRelativeTo(null);
            gui_gestionale.setVisible(true);
        });
    }
}
