public class Main {
    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .setName("Анна")
                .setSurname("Вольф")
                .setAge(31)
                .setAddress("Сидней")
                .build();
        PersonBuilder PersonBuilder = new PersonBuilder();
        Person son = mom.newChildBuilder(PersonBuilder)
                .setName("Антошка")
                .setSurname("Вольф")
                .build();
        System.out.println("У " + (toString(mom)) + " есть сын, " + (toString(son)));

        try {
            new PersonBuilder().setName("Анна").setSurname("Вольф").setAge(31).build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            new PersonBuilder().setName("Антошка").setSurname("Вольф").setAge(0).build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    private static String toString(Person mom) {
        return mom.getName();
    }
}