import org.junit.jupiter.api.*;

public class PersonTesting {

    @BeforeAll
    public static void BeforeAll(){
        System.out.println("Начало тестирования:");
    }
    @AfterAll
    public static void AfterAll(){
        System.out.println("Окончание тестирования");
    }
    @BeforeEach
    public void BeforeEach(){
        System.out.println("---Перед началом каждого теста---");
    }
    @AfterEach
    public void AfterEach(){
        System.out.println("---После каждого теста---" + '\n');
    }

    //Создаем тестируемый объект
    String testedName = "Neo";
    String testedSurname = "Anderson";
    int testedAge = 30;
    String testedCity = "Zion";

    Person testedPerson = new PersonBuilder()
            .setName(testedName)
            .setSurname(testedSurname)
            .setAge(testedAge)
            .setCity(testedCity)
            .build();

    @Test
    //Проверка если не задали имя
    public void testName() {
        String result = testedPerson.getName();
        Assertions.assertEquals("Neo", result);
    }
    @Test
    //проверка метода день рождение -
    //возраст должен увеличиться на 1
    public void testAge() {

        testedPerson.happyBirthday();

        int result = testedPerson.getAge();
        Assertions.assertEquals(31, result);
    }
    @Test
    //Проверка есть ли город
    public void testCity() {
        boolean result = testedPerson.hasAddress();
        Assertions.assertTrue(result);
    }
    @Test
    //Проверка фамилий сына и предка
    public void testSon() {
        Person testSon = testedPerson.newChildBuilder()
                .setName("Tomas")
                .build();
        Assertions.assertEquals(testedPerson.getSurname(), testSon.getSurname());
    }
}
