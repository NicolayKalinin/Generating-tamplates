public class PersonBuilder {
    public String name;
    private String surname;
    private int age = -1;
    private String city;
    private Person mom;

    public String getName() {
        return name;
    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public int getAge() {
        return age;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException(
                    "Возраст должен быть в пределах от 0 до 150, а у Вас:" + age
            );
        }
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String Сидней) {
        this.city = city;
        return this;
    }

    public Person build() {
        if (name == null) {
            throw new IllegalStateException(
                    "Имя является необходимым полем, Вы его не прописали"
            );
        }
        if (surname == null) {
            throw new IllegalStateException(
                    "Фамилия является необходимым полем, Вы её не прописали"
            );
        }

        Person person;
        person = new Person(name, surname, age);

        if (city != null) {
            person.setAddress(city);
        }

        return person;
    }

    public static class setSurname extends PersonBuilder {
        public setSurname(String s) {
            super();
        }
    }
}
