package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbcconnection {
    Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","13760622");

    public Connection getConnection() {
        return connection;
    }

    public jdbcconnection() throws SQLException {
    }
}
