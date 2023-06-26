import java.util.OptionalInt;

public class Person {
    private final String name;
    private final String surname;
    private final int age;
    private String city;
    private PersonBuilder son;
    private PersonBuilder mom;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = -1;
    }

    public String getName(PersonBuilder mom, PersonBuilder son) {
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
    public PersonBuilder newChildBuilder() {
        return new PersonBuilder.setSurname(toString(son));
    }
    private String getName(PersonBuilder son) {
        return name;
    }
    public void setSon(PersonBuilder son) {
        this.son = son;
    }

    public void setMom(PersonBuilder mom) {
        this.mom = mom;
    }
    private String toString(PersonBuilder son) {
        return System.out.printf("У %s есть сын, %s%n", getName(mom), getName(son)).toString();
    }
}
