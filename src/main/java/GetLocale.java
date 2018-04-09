import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class GetLocale {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        System.out.println(new SimpleDateFormat("HH:mm:ss.SSS").format(new Date()));
    }
}
