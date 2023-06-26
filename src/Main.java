public class Main {
    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .setName("Анна")
                .setSurname("Вольф")
                .setAge(31)
                .setAddress("Сидней")
                .build();
        Person son = mom.newChildBuilder()
                .setName("Антошка")
                .setSurname("Вольф")
                .build();

        try {
            new PersonBuilder().setName("Анна").setSurname("Вольф").setAge(31).build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            new PersonBuilder().setName("Антошка").setSurname("Вольф").setAge(20).build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}