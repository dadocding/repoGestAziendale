package Grafica;

import javax.swing.*;
import java.awt.event.ActionListener;

public class LoginFrame extends JPanel implements ActionListener {
    private JPanel frame_login;
    private JLabel label_titolo;
    private JTextField text_name;
    private JPasswordField text_password;
    private JButton btn_accedi;
    private JButton btn_registrati;
    private JLabel label_nome;
    private JLabel label_password;
    private JLabel label_account;

    //private GestionaleAzienda gestionale_azienda;

    public LoginFrame(//GestionaleAzienda gest-passato
    ) {
        super();
        setLayout(null);
        //this.gestionale_azienda = gest_passato;
    }


}
