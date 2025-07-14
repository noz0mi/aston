package example.homework5.builder;

public class Book {
    private String name;
    private Integer publishingYear;
    private int pages;
    private String description;

    public Book(BookBuilder bookBuilder) {
        name = bookBuilder.name;
        publishingYear = bookBuilder.publishingYear;
        pages = bookBuilder.pages;
        description = bookBuilder.description;
    }

    public Integer getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(Integer publishingYear) {
        this.publishingYear = publishingYear;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Book{");
        sb.append("name='").append(name).append('\'');
        sb.append(", publishingYear=").append(publishingYear);
        sb.append(", pages=").append(pages);
        sb.append(", description='").append(description).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static class BookBuilder {

        private String name;
        private Integer publishingYear;
        private int pages;
        private String description;

        public  BookBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public BookBuilder setPublishingYear(Integer publishingYear) {
            this.publishingYear = publishingYear;
            return this;
        }

        public BookBuilder setPages(int pages) {
            this.pages = pages;
            return this;
        }

        public BookBuilder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Book build() {
            return new Book(this);

        }
    }
}
