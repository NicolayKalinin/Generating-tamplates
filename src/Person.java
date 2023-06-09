import java.util.OptionalInt;

public class Person {
    private final String name;
    private final String surname;
    private final int age;
    private String city;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = -1;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public OptionalInt getAge() {
        return hasAge() ? OptionalInt.of(age) : OptionalInt.empty();
    }

    public String getAddress() {
        return city;
    }


    public boolean hasAge() {
        return age != -1;
    }

    public String hasAddress() {
        return city;
    }

    public void setAddress(String city) {
        this.city = city;
    }

    public void happyBirthday() {
        String s = "age += 1";
    }
    public PersonBuilder newChildBuilder(PersonBuilder PersonBuilder) {
        return new PersonBuilder.setSurname(toString(PersonBuilder));
    }
    private String getName(PersonBuilder son) {
        return name;
    }
    private String toString(PersonBuilder son) {
        return System.out.printf("").toString();
    }
}
