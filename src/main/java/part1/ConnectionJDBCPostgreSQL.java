package part1;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionJDBCPostgreSQL {

    public static void main(String[] args) {

        String urlConnection = ("jdbc:postgresql://localhost:5432/postgres");

        try {
            Connection connection = DriverManager.getConnection(urlConnection, "postgres", ""); //password: será a senha que você definir
            System.out.println("SUCESSO!");
        } catch (Exception e) {
            System.out.println("FALHA!");
        }
    }
}
