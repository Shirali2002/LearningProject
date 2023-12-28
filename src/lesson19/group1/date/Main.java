package src.lesson19.group1.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String format = sdf.format(date);
        System.out.println(format);

        String dateStr = "12/10/2012";
        Date myDate = sdf.parse(dateStr);
        System.out.println(myDate);
    }

//    public static void main(String[] args) {
//        Calendar calendar = Calendar.getInstance();
//
//        calendar.add(Calendar.MONTH, -5);
//        calendar.add(Calendar.HOUR, -5);
//        System.out.println(calendar.getTime());
//    }

//    public static void main(String[] args) {
//        Date date = new Date();
//        System.out.println(date);
//
//        long currentTimeMillis = System.currentTimeMillis();
//        System.out.println(currentTimeMillis);
//
//        long after = currentTimeMillis + 1000000000000000000L;
//
//        Date dateAfter = new Date(9223372036854775807L);
//        System.out.println(dateAfter);
//    }

}
