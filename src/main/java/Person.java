public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String city;

    public Person(String name, String surname, int age, String city) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.city = city;
    }

    public boolean hasAge() {
        return age != 0;
    }

    public boolean hasAddress() {
        if (this.getAddress() != null) {
            System.out.println(city);
        }
        return true;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return city;
    }


    public void setAddress(String address) {
        address = city;
    }

    public void happyBirthday() {
        age++;
    }

    @Override
    public String toString() {
        return "Person [" +
                "имя = " + name + ", " +
                "фамилия =" + surname + ", " +
                "возраст =" + age + ", " +
                "город = " + city + "]";
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setSurname(this.surname)
                .setCity(this.city);
    }
}

