package com.company;

import java.util.Objects;

public class Book {
    private String author;
    private String title;
    private int pages;

    public Book (String authorParameter, String titleParameter, int pagesParameter){
        this.author = authorParameter;
        this.title = titleParameter;
        this.pages = pagesParameter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return pages == book.pages &&
                Objects.equals(author, book.author) &&
                Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, title, pages);
    }

    @Override
    public String toString() {
        return "Książka " + title + " napisana przez " + author + ", ma " + pages + " stron.";
    }


}
