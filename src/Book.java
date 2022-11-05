import java.util.Objects;

public class Book {
    final private String nameBook;
    final private Author fullNameAuthor;
    private int yearOfPublication;

    public Book(String nameBook, Author fullNameAuthor, int yearOfPublication) {
        this.nameBook = nameBook;
        this.fullNameAuthor = fullNameAuthor;
        this.yearOfPublication = yearOfPublication;
    }

    public String getNameBook() {
        return nameBook;
    }

    public Author getFullNameAuthor() {
        return fullNameAuthor;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public String toString() {
        return fullNameAuthor.toString() + " " + nameBook + " " + yearOfPublication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfPublication == book.yearOfPublication && nameBook.equals(book.nameBook) && fullNameAuthor.equals(book.fullNameAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, fullNameAuthor, yearOfPublication);
    }
}
