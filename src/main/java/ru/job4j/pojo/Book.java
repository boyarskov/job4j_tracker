package ru.job4j.pojo;

public class Book {
    private String book;
    private int pages;

    public Book(String book, int pages) {
        this.book = book;
        this.pages = pages;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
