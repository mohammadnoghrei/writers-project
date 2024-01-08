package org.example;

public class Books {
    String title;
    int year;
    Writer booksWriter;

    public Books() {
    }

    public Books(String title, int year, Writer booksWriter) {
        this.title = title;
        this.year = year;
        this.booksWriter = booksWriter;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Writer getBooksWriter() {
        return booksWriter;
    }

    public void setBooksWriter(Writer booksWriter) {
        this.booksWriter = booksWriter;
    }

    @Override
    public String toString() {
        return "Books{" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", booksWriter=" + booksWriter +
                '}';
    }
}
