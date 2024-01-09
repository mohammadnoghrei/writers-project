package org.example;

import java.util.Arrays;

public class Writer {
    int writer_id;
    String first_name;
    String last_name;
    int age;
    Books[] books;

    public Writer() {
    }

    public Writer(int writer_id, String first_name, String last_name, int age) {
        this.writer_id = writer_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
    }

    public Writer(int writer_id, String first_name, String last_name, int age, Books[] books) {
        this.writer_id = writer_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
        this.books = books;
    }

    public Writer(String first_name, String last_name, int age, Books[] books) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
        this.books = books;
    }

    public int getWriter_id() {
        return writer_id;
    }

    public void setWriter_id(int writer_id) {
        this.writer_id = writer_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Books[] getBooks() {
        return books;
    }

    public void setBooks(Books[] books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Writer{" +
                "writer_id=" + writer_id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", age=" + age +
                ", books=" + Arrays.toString(books) +
                '}';
    }
}
