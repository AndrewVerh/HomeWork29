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
        this.age = age;
        return this;
    }

    public PersonBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public Person build() {

        if (name == null) {
            throw new IllegalArgumentException("Не задано имя человека!");
        }
        if (surname == null) {
            throw new IllegalArgumentException("Не задана фамилия человека!");
        }
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Неверное значение возраста!");
        }
        if (city == null) {
            throw new IllegalArgumentException("Не задан город человека!");
        }

        return new Person(name, surname, age, city);
    }
}
