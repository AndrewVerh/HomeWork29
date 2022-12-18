public class Main {

    public static void main(String[] args) {
        PersonBuilder personBuilder = new PersonBuilder();

        Person bulba = personBuilder
                .setName("Бульба")
                .setSurname("Сумкин")
                .setAge(62)
                .setCity("Шир")
                .build();

        System.out.println(bulba);

        Person fedya = bulba.newChildBuilder()
                .setName("Федя")
                .setAge(17)
                .build();

        System.out.println(fedya);
    }
}
