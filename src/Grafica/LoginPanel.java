package Grafica;

import javax.swing.*;

public class LoginPanel extends JPanel { //implements ActionListener {
    private JPanel login_panel;
    private JLabel label_titolo;
    private JTextField text_name;
    private JPasswordField text_password;
    private JButton btn_accedi;
    private JButton btn_registrati;
    private JLabel label_nome;
    private JLabel label_password;
    private JLabel label_account;

    //private GestionaleAzienda gestionale_azienda;

    public LoginPanel(//GestionaleAzienda gest-passato
    ) {
        super();
        setLayout(null);
        //this.gestionale_azienda = gest_passato;
    }

    public JPanel getLogin_panel() {
        return login_panel;
    }


}
