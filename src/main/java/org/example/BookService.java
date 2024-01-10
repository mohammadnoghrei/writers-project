package org.example;

import java.sql.Date;
import java.sql.SQLException;
import java.util.Scanner;

public class BookService {

    public static void addbook() throws SQLException {
        Scanner scanner =new Scanner(System.in);
        System.out.println("please enter book's title:");
        String title= scanner.nextLine();
        System.out.println("please enter book's year' date:");
        String year =scanner.nextLine();
        Date date = Date.valueOf(year);
        System.out.println("please enter writer id:");
        int id = scanner.nextInt();
        Books books = new Books(title,date,id);
        BookRepository bookRepository =new BookRepository();
        bookRepository.save(books);
    }
}
