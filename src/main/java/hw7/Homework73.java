package hw7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework73 {

    public static boolean isUSCurrency(String value){
        Pattern pattern = Pattern.compile("\\$\\d+\\.\\d{2}");
        Matcher m = pattern.matcher(value);

        return m.matches();

    }
}
