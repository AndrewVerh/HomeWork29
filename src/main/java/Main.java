import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        Logger logger = Logger.getInstance();

        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");


        Scanner scan = new Scanner(System.in);

        //Задаем размер списка
        System.out.println("Введите размер списка:");
        int n = scan.nextInt();

        //Задаем верхнюю границу значений элементов
        System.out.println("Введите верхнюю границу для значений:");
        int m = scan.nextInt();

        //Создаем список случайных значений
        logger.log("Создаём и наполняем список");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(random.nextInt(m));
        }
        System.out.println("Вот случайный список: " + list);

        //Задаем порог для фильтра
        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.println("Введите порог для фильтра:");
        int f = scan.nextInt();

        //Создаем объект класса Фильтр
        Filter filter = new Filter(f);



        logger.log("Выводим результат на экран:");

        System.out.println("Отфильтрованный список: " + filter.filterOut(list));

        logger.log("Завершаем программу");
    }
}
