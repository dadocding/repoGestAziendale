package Grafica;

import Dati.UtenteDAO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelRegistrazione {
    private JTextField text_nome;
    private JTextField text_token;
    private JPanel panel_registrazione;
    private JButton jbtn_torna_accesso;
    private JButton registratiButton;
    private JPasswordField text_password;


    public PanelRegistrazione(MainGui frame) {

        jbtn_torna_accesso.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.mostraSchermata("LOGIN");
            }
        });
        registratiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Recuperiamo i dati inseriti nei campi grafici
                String usernameInserito = text_nome.getText();
                String passwordInserita = new String(text_password.getPassword());
                String tokenInserito = text_token.getText();
                //Nota: se label_password è una JPasswordField, si usa .getPassword()

                //controlliamo che i campi non siano vuoti
                if (usernameInserito.isEmpty() || passwordInserita.isEmpty() || tokenInserito.isEmpty()) {
                    JOptionPane.showMessageDialog(null,
                            "Per favore, inserisci username, password e token.",
                            "Campi incompleti",
                            JOptionPane.WARNING_MESSAGE);
                    return; //Interrompe l'esecuzione così non fa la query a vuoto
                }

                //Istanziamo il DAO per comunicare con il database SQLite
                UtenteDAO utenteDao = new UtenteDAO();

                //Verifichiamo se l'utente esiste nel database
                if (utenteDao.verificaLogin(usernameInserito, passwordInserita)) {
                    JOptionPane.showMessageDialog(null,
                            "Utente già presente",
                            "Registrazione negata",
                            JOptionPane.WARNING_MESSAGE);

                } else {
                    //Credenziali errate
                    JOptionPane.showMessageDialog(null,
                            "Username o Password errati. Riprova.",
                            "Errore di Autenticazione",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    public JPanel getRegistrazione_panel() {
        return panel_registrazione;
    }
}

