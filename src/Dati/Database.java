package Dati;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
    private static final String URL = "jdbc:sqlite:utenti.db";

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            System.err.println("Driver JDBC non trovato!");
        }

        Connection conn = DriverManager.getConnection(URL);
        // Ogni volta che chiediamo una connessione, ci assicuriamo che la tabella esista
        creaTabellaUtenti(conn);
        return conn;
    }

    private static void creaTabellaUtenti(Connection conn) {
        // Query SQL per creare la tabella e inserire un utente di test se è vuota
        String sql = "CREATE TABLE IF NOT EXISTS utenti ("
                + " id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + " username TEXT NOT NULL UNIQUE,"
                + " password TEXT NOT NULL"
                + ");";

        try (Statement stmt = conn.createStatement()) {
            // Crea la tabella se non esiste
            stmt.execute(sql);

            // Inseriamo un utente di prova (admin / admin123) se la tabella è appena stata creata ed è vuota
            String inserisciAdmin = "INSERT OR IGNORE INTO utenti (id, username, password) VALUES (1, 'admin', 'admin123');";
            stmt.execute(inserisciAdmin);

        } catch (SQLException e) {
            System.err.println("Errore durante la creazione della tabella: " + e.getMessage());
        }
    }
}