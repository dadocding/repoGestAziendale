package Dati;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UtenteDAO {

    public boolean verificaLogin(String username, String password) {
        String sql = "SELECT * FROM utenti WHERE username = ? AND password = ?";

        // Uso il try-with-resources per chiudere automaticamente la connessione
        try (Connection conn = Database.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // Passo i parametri in modo sicuro (evita la SQL Injection)
            pstmt.setString(1, username);
            pstmt.setString(2, password);

            ResultSet rs = pstmt.executeQuery();

            // Se c'è un risultato, le credenziali sono corrette
            return rs.next();

        } catch (SQLException e) {
            System.err.println("Errore durante il login: " + e.getMessage());
            return false;
        }
    }
}