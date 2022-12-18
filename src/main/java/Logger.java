import javax.xml.crypto.Data;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {

    private static Logger instance;

    protected int num = 1;
    Date d = new Date();
    DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    protected String strDF = df.format(d);


    public void log(String msg) {
        System.out.println("[" + strDF + " " + num++ + "] " + msg);
    }

    // В этом поле храним ссылку на тот единственный объект
    //этого класса, который будем отдавать пользователям
    private Logger() {
    }

    // Пользователи которым нужен объект нашего класса получают всегда один
    // и тот же объект, который мы храним в приватном статичном поле, которое
    // мы заполняем в этом методе если оно до того не было заполнено
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

}
