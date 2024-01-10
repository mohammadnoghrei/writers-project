package org.example;

import java.sql.SQLException;
import java.util.Scanner;

public class BookService {

    public static void register() throws SQLException {
        Scanner scanner =new Scanner(System.in);
        System.out.println("please enter book's title:");
        String title= scanner.nextLine();
        System.out.println("please enter book's year:");
        int year =scanner.nextInt();
        System.out.println("please enter writer id:");
        int id = scanner.nextInt();
        Books books = new Books(title,year,id);
        BookRepository bookRepository =new BookRepository();
        bookRepository.save(books);
    }
}
