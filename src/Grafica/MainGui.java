package Grafica;

import javax.swing.*;
import java.awt.*;

public class MainGui extends JFrame {

    private CardLayout cardLayout;
    private JPanel contenitore;

    public MainGui() {

        cardLayout = new CardLayout();
        contenitore = new JPanel(cardLayout);

        LoginPanel login = new LoginPanel(this);
        PanelRegistrazione registrazione = new PanelRegistrazione(this);

        contenitore.add(login.getLogin_panel(), "LOGIN");
        contenitore.add(registrazione.getRegistrazione_panel(), "REGISTRAZIONE");

        add(contenitore);

        setTitle("Gestionale");
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void mostraSchermata(String nome) {
        cardLayout.show(contenitore, nome);
    }
}