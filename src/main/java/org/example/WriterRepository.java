package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class WriterRepository {
    private final jdbcconnection jdbcconnection =new jdbcconnection();

    public WriterRepository() throws SQLException {
    }
    public void save(Writer writer) throws SQLException {
        Connection connection = jdbcconnection.getConnection();
        String savebook = "insert into writers(FirstName,LastName,age)\n" +
                "values (?,?,?);";
        PreparedStatement preparedStatement = connection.prepareStatement(savebook);
        preparedStatement.setString( 1,writer.getFirst_name());
        preparedStatement.setString(2,writer.getLast_name());
        preparedStatement.setInt(3, writer.getAge());
        preparedStatement.executeUpdate();
        System.out.println(preparedStatement.executeUpdate());
    }

//    public Writer load(int writerid){
//
//    }
}
