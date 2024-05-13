import java.util.Objects;

public class Author {
    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    //2 part of homework
    //Переопределение метода toString
    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    //Переопределение метода equals (сгенерировано IDEA)
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Author author = (Author) o;
//        return Objects.equals(firstName, author.firstName) && Objects.equals(lastName, author.lastName);
//        }

    //Переопределение метода equals (написано вручную)
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj != null && getClass() == obj.getClass()) {
            Author author = (Author) obj;
            return firstName.equals(author.firstName) &&
                    lastName.equals(author.lastName);
        }
        return false;
    }

    //Переопределение метода hashCode
    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}


