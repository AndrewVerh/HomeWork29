import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        int countAdded =0;
        int countFiltered = 0;

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < source.size(); i++) {
            if (source.get(i) < treshold) {
                logger.log("Элемент " + '"' + source.get(i) + '"' + " не подходит");
                countFiltered++;

            } else {
                logger.log("Элемент " + '"' + source.get(i) + '"' + " подходит");
                countAdded++;
                result.add(source.get(i));
            }
        }
        logger.log("Прошло фильтр " + countAdded + " элементов из " + (countAdded + countFiltered));
        return result;
    }

}
