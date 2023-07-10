package bit.edu.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

    public Connection getConnection(){
        Connection connection = null;

        //TODO 1: DB 추후 첨가 예정
        String jdbcURL = "jdbc:mysql://localhost:3306/____";
        String driver = "com.mysql.cj.jdbc.Driver";
        String id = "root";
        String pw = "1234";

        try {
            Class.forName(driver);
            try {
                connection = DriverManager.getConnection(jdbcURL, id, pw);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }
}
