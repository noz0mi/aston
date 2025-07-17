package ru.example.homework2.streams;

import java.util.Objects;

public class Book {
    private int year;
    private int pages;
    private String name;

    public Book(int year, String name, int pages) {
        this.year = year;
        this.name = name;
        this.pages = pages;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;

        Book book = (Book) object;
        return year == book.year && pages == book.pages && Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {
        int result = year;
        result = 31 * result + pages;
        result = 31 * result + Objects.hashCode(name);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Book{");
        sb.append("\n year=").append(year);
        sb.append(",\n pages=").append(pages);
        sb.append(",\n name='").append(name).append('\'');
        sb.append("} \n");
        return sb.toString();
    }
}
