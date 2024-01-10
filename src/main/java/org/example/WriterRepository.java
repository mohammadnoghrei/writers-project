package org.example;

import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
        int exequte=preparedStatement.executeUpdate();
        int id=findid(writer.first_name, writer.last_name);
        System.out.println("your id is:"+id);
    }

    public Writer load(int writerid) throws SQLException {
        Connection connection =jdbcconnection.getConnection();
        String select = "SELECT * FROM writers WHERE id= ?";
        PreparedStatement preparedStatement = connection.prepareStatement(select);
        preparedStatement.setInt(1,writerid);
        ResultSet resultSet = preparedStatement.executeQuery();
        resultSet.next();
        if (resultSet.next()){
            int id = resultSet.getInt("id");
            String firstname= resultSet.getString("FirstName");
            String lasttname= resultSet.getString("LastName");
            int age = resultSet.getInt("age");
            Writer writer =new Writer(id,firstname,lasttname,age);
            return writer;
        }else System.out.println("your writer id not exist");
        return null;


    }
    private int findid(String fname, String lname) throws SQLException {
        Connection connection =jdbcconnection.getConnection();
        String select = "SELECT id FROM writers WHERE FirstName=? and LastName=?";
        PreparedStatement preparedStatement = connection.prepareStatement(select);
        preparedStatement.setString(1,fname);
        preparedStatement.setString(2,lname);
        ResultSet resultSet = preparedStatement.executeQuery();
        resultSet.next();

            int id = resultSet.getInt("id");
            return id;
    }
}
