public class App {
    public static void main(String[] args) {
        Author author = new Author("Николай", "Гоголь");
        System.out.println("author = " + author.getFirstName());
        System.out.println("author = " + author.getLastName());

        Book book = new Book("Вечера на хуторе близ Диканьки", author, 1831);
        System.out.println("book = " + book.getAuthor().getFirstName() + " " + book.getAuthor().getLastName());
        System.out.println("book = " + book.getTitle());
        System.out.println("book = " + book.getPublicationYear());

        book.setPublicationYear(1840);
        System.out.println("book = " + book.getPublicationYear());

        Author author1 = new Author("Эрих", "Мария Ремарк");
        Book book1 = new Book("Триумфальная Арка", author1, 1945);
        System.out.println("book1 = " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName());
        System.out.println("book1 = " + book1.getTitle());
        System.out.println("book1 = " + book1.getPublicationYear());

    }
}
