package example.homework5.builder;

public class Main {
    public static void main(String[] args) {
        Book newBook = new Book.BookBuilder().setName("Lighthouse")
                .setPublishingYear(1928)
                .setPages(298)
                .setDescription("Some description")
                .build();

        System.out.println(newBook);
    }
}
