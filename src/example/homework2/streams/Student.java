package example.homework2.streams;

import java.util.LinkedList;
import java.util.List;

public class Student {
    private String name;
    private int course;
    private List<Book> books;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
        this.books = new LinkedList<>();
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("\n name = '").append(name).append('\'');
        sb.append(",\n course = ").append(course);
        sb.append(",\n books = \n").append(books);
        sb.append('}');
        return sb.toString();
    }
}
