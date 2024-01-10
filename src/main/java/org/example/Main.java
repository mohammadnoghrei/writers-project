package org.example;

import java.sql.SQLException;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws SQLException {
        System.out.println("*******welcome*******");
        WriterService.register();
        System.out.println(" ");
        System.out.println("********************");
        BookService.addbook();



    }
}