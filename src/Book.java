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
    public int getPublicationYear(){
        return this.publicationYear;
    }
    public Author getAuthor(){
        return this.author;
    }
    public void setPublicationYear(int publicationYear){
        this.publicationYear = publicationYear;
    }

}
