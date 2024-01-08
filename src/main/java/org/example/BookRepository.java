package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BookRepository {
    jdbcconnection jdbcconnection =new jdbcconnection();

    public BookRepository() throws SQLException {
    }
    public void save(Books books) throws SQLException {
        Connection connection = jdbcconnection.getConnection();
        String savebook = "insert into books(?,?,?) ";
        PreparedStatement preparedStatement = connection.prepareStatement(savebook);
        preparedStatement.setString(1,"a");
        preparedStatement.setInt(2,1992);
        preparedStatement.setInt(3,1);
    }
}
