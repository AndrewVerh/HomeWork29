public class PersonBuilder {
    protected String name;
    protected String surname;
    protected int age;
    protected String city;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {

        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Неверное значение возраста!");
        }

        this.age = age;
        return this;
    }

    public PersonBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public Person build() {

        if (name == null) {
            throw new IllegalStateException("Не задано имя человека!");
        }
        if (surname == null) {
            throw new IllegalStateException("Не задана фамилия человека!");
        }
//        if (age < 0 || age > 120) {
//            throw new IllegalArgumentException("Неверное значение возраста!");
//        }
        if (city == null) {
            throw new IllegalStateException("Не задан город человека!");
        }

        return new Person(name, surname, age, city);
    }
}
