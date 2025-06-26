package example.homework2.streams;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book(2001, "Geometry", 301);
        Book book2 = new Book(1995, "Fine Art", 459);
        Book book3 = new Book(1984, "Math Analysis", 200);
        Book book4 = new Book(2010, "Computer Science", 499);
        Book book5 = new Book(1984, "Math Analysis", 200);
        Book book6 = new Book(1984, "Linear Algebra", 450);
        Book book7 = new Book(2006, "Networking Basics", 347);
        Book book8 = new Book(2000, "Informatics", 312);
        Book book9 = new Book(1997, "Philosophy", 200);
        Book book10 = new Book(1949, "1984", 400);
        Student student1 = new Student("Paul", 2);
        student1.setBooks(List.of(book1, book2, book4, book9, book10));
        Student student2 = new Student("Nicole", 3);
        student2.setBooks(List.of(book3, book5, book6, book7, book10));
        Student student3 = new Student("Elena", 1);
        student3.setBooks(List.of(book1, book2, book3, book8, book10));
        List<Student> students = new LinkedList<>(List.of(student1, student2,student3));

        students.stream()
                .peek(st -> System.out.println("Peek -> " + st))
                .map(st -> st.getBooks())
                .flatMap(books -> books.stream())
                .sorted(Comparator.comparingInt(Book::getPages))
                .distinct()
                .filter(book -> book.getYear() > 2000)
                .limit(3)
                .map(Book::getYear)
                .findAny().ifPresentOrElse(System.out::println,
                        () -> System.out.println("Книга с таким годом издания отсутствует."));
    }
}
