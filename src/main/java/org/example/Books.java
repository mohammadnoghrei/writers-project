package org.example;

public class Books {
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
                "title='" + title + '\'' +
                ", year=" + year +
                ", writer id=" + writer_id +
                '}';
    }
}
