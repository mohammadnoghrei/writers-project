package org.example;

public class Books {
    int book_id;
    String title;
    int year;
    int writer_id;

    public Books() {
    }

    public Books(String title, int year, int writer_id) {
        this.title = title;
        this.year = year;
        this.writer_id = writer_id;
    }

    public Books(int book_id, String title, int year, int writer_id) {
        this.book_id = book_id;
        this.title = title;
        this.year = year;
        this.writer_id = writer_id;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
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

    public int getWriter_id() {
        return writer_id;
    }

    public void setWriter_id(int writer_id) {
        this.writer_id = writer_id;
    }

    @Override
    public String toString() {
        return "Books{" +
                "book_id=" + book_id +
                ", title='" + title + '\'' +
                ", year=" + year +
                ", writer_id=" + writer_id +
                '}';
    }
}
