import java.util.Objects;

public class Book {
    private String title;
    private int publicationYear;
    private Author author;

    public Book(String title, Author author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return this.title;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public Author getAuthor() {
        return this.author;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    //2 part of homework
    //Переопределение метода toString
    public String toString() {
        return "Название книги - " + title + ", автор - " + author + ", год публикации - " + publicationYear;
    }

    //Переопределение метода equals
    public boolean equals(Object obj) {
        if (obj instanceof Book) {
            return title.equals(((Book) obj).getTitle()) &&
                    publicationYear == ((Book) obj).getPublicationYear() &&
                    author.equals(((Book) obj).getAuthor());
        }
        return false;
    }

    //Переопределение метода hashCode
    public int hashCode() {
        return Objects.hash(title, publicationYear, author);
    }
}