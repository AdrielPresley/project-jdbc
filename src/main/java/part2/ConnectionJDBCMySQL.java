package part2;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionJDBCMySQL {

    public static void main(String[] args) {

        String urlConnection = ("jdbc:mysql://localhost/digital_innovation_one");

        try {
            Connection connection = DriverManager.getConnection(urlConnection, "root", ""); //password: será a senha que você definir
            System.out.println("SUCESSO!");
        } catch (Exception e) {
            System.out.println("FALHA!");
        }
    }
}
