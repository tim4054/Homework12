public class App {
    public static void main(String[] args) {
        Author author = new Author("Николай", "Гоголь");
        System.out.println("author = " + author.getFirstName());
        System.out.println("author = " + author.getLastName());

        Book book = new Book("Вечера на хуторе близ Диканьки", author, 1831);
        System.out.println("book = " + book.getAuthor().getFirstName() + " " + book.getAuthor().getLastName());
        System.out.println("book = " + book.getTitle());
        System.out.println("book = " + book.getPublicationYear());

        book.setPublicationYear(1841);
        System.out.println("book = " + book.getPublicationYear());

        Author author1 = new Author("Эрих", "Мария Ремарк");
        Book book1 = new Book("Триумфальная Арка", author1, 1945);
        System.out.println("book1 = " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName());
        System.out.println("book1 = " + book1.getTitle());
        System.out.println("book1 = " + book1.getPublicationYear());

        //2 part of homework
        //Переопределение метода toString
        System.out.println(book);
        System.out.println(book1);

        //Переопределение метода equals
        Book book3 = new Book("Вечера на хуторе близ Диканьки", author, 1841);
        System.out.println(book.equals(book3)); //true

        Author author3 = new Author("Николай", "Гоголь");
        System.out.println(author.equals(author3)); //true

        //Переопределение метода hashCode
        //hashCode.book == hashCode.book3
        System.out.println(book.hashCode());
        System.out.println(book3.hashCode());
        //hashCode.author == hashCode.author3
        System.out.println(author.hashCode());
        System.out.println(author3.hashCode());

    }
}
