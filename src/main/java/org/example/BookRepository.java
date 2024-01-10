package org.example;

import java.sql.*;

public class BookRepository {
    jdbcconnection jdbcconnection = new jdbcconnection();

    public BookRepository() throws SQLException {
    }

    public void save(Books books) throws SQLException {
        Connection connection = jdbcconnection.getConnection();
        String savebook = "insert into books(bookName,year,writerid)\n" +
                "values (?,?,?);";
        PreparedStatement preparedStatement = connection.prepareStatement(savebook);
        preparedStatement.setString(1, books.getTitle());
        preparedStatement.setDate(2, books.getYear());
        preparedStatement.setInt(3, books.getWriter_id());
        preparedStatement.executeUpdate();
        System.out.println("your books id is :"+findid(books.getTitle()));
    }

    public Books load(int bookid) throws SQLException {
        Connection connection = jdbcconnection.getConnection();
        String select = "SELECT * FROM books WHERE book_id= ?";
        PreparedStatement preparedStatement = connection.prepareStatement(select);
        preparedStatement.setInt(1, bookid);
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            int book_id = resultSet.getInt("book_id");
            String bookName = resultSet.getString("bookName");
            Date year = Date.valueOf(resultSet.getString("year"));
            int writerid = resultSet.getInt("writerid");
            Books books = new Books(book_id, bookName, year, writerid);
            return books;
        } else System.out.println("your book id not exist");
        return null;
    }

    public void  delete(Books books) throws SQLException {
        Connection connection = jdbcconnection.getConnection();
        String select = "DELETE FROM books WHERE bookName=?;";
        PreparedStatement preparedStatement = connection.prepareStatement(select);
        preparedStatement.setString(1,books.getTitle() );
        preparedStatement.executeUpdate();
    }

    private   int findid(String name) throws SQLException {
        Connection connection = jdbcconnection.getConnection();
        String select = "SELECT book_id FROM books WHERE bookName= ?";
        PreparedStatement preparedStatement = connection.prepareStatement(select);
        preparedStatement.setString(1, name);
        ResultSet resultSet = preparedStatement.executeQuery();
        resultSet.next();
        int book_id = resultSet.getInt("book_id");
        return book_id;
    }
}
