package Lesson1;

public class Author {
    private String firstName;
    private String secondName;

    public Author(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getFirstName() {
        return this.firstName;
    }
    public String getSecondNameName() {
        return this.secondName;
    }
    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author fn2 = (Author) other;
        return firstName.equals(fn2.firstName) && secondName.equals(fn2.secondName);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(firstName,secondName);
    }

    public String toString() {
        return this.firstName + " " + this.secondName;
    }
}


