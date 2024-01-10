package org.example;

import java.sql.SQLException;
import java.util.Scanner;

public class WriterService {

    public static void register() throws SQLException {
        Scanner scanner =new Scanner(System.in);
        System.out.println("please enter your firstname:");
        String firstname= scanner.nextLine();
        System.out.println("please enter your lastname:");
        String lastname =scanner.nextLine();
        System.out.println("please enter your age:");
        int age = scanner.nextInt();
        Writer writer = new Writer(firstname,lastname,age);
        WriterRepository writerRepository =new WriterRepository();
        writerRepository.save(writer);
    }
}
