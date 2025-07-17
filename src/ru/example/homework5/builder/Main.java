package ru.example.homework5.builder;

public class Main {
    public static void main(String[] args) {
        Book book = Book.builder()
                        .setName("Lighthouse")
                        .setPages(300)
                        .setPublishingYear(1928)
                        .setDescription("description")
                        .build();
        System.out.println(book);
    }
}
