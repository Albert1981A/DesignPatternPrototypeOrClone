import java.time.LocalDateTime;

public class Person implements Cloneable{
    /**
     * This class is doing an implementation of Cloneable
     * Cloneable have a method of "clone" witch make a copy of an object but its a new object with
     * a new address in the memory (and not just a reference)
     */
    private static int COUNT = 1;

    private int id;
    private String lastName;
    private String firstName;
    private LocalDateTime birth;

    public Person() {
        this.id = COUNT;
        this.lastName = "Last Name " + COUNT;
        this.firstName = "First Name " + COUNT++;
        this.birth = FactoryUtil.getDate();
    }

    public Person(int id, String lastName, String firstName, LocalDateTime birth) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.birth = birth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }



    public LocalDateTime getBirth() {
        return birth;
    }

    public void setBirth(LocalDateTime birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", birth=" + DateUtil.formatDate(birth) +
                '}';
    }

    @Override
    protected Person clone() throws CloneNotSupportedException {
        return (Person) super.clone();
    }

}
