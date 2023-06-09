public class PersonBuilder {
    private String name;
    private String surname;
    private int age = -1;
    private String city;
    private String address;

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

    public String getCity() {
        return city;
    }

    public PersonBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public PersonBuilder setAddress(String Сидней) {
        this.address = address;
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
        if (age == -1) {
            person = new Person(name, surname);
        } else{
            person = new Person(name, surname, age);
        }

        if (city != null) {
            person.setCity(city);
        }

        return person;
    }
}
