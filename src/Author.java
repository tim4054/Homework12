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
    public String toString() {
        return firstName + " " + lastName;
    }

    //Переопределение метода equals
    public boolean equals(Object obj) {
        if (obj instanceof Author) {
            return firstName.equals(((Author) obj).firstName) &&
                    lastName.equals(((Author) obj).getLastName());
        }
        return false;
    }

    //Переопределение метода hashCode
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}


