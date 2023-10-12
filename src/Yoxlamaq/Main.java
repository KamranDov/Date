package Yoxlamaq;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {
//    1-*****bu asagdakilar Date aid ilkin misallardir*****
        /*
        Date d = new Date();
        System.out.println(d);

        SimpleDateFormat sdt = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String tarix = sdt.toString();
        System.out.println(tarix);
        -------------------------------------------------------------------------------------

        Date today = new Date();
        System.out.println("Bu Gun: " + today);
        normal indiki zamani gosterme
        System.out.println("-----------------------------------------------------------");

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss ");
        System.out.println("Format tarix: " + dateFormat.format(today));
        bu ise sen oz isdediyin kimi yazdigin zamani yuxardaki (Date today) adinda zamandan goturub format edir
        System.out.println("-----------------------------------------------------------");

        Calendar calendar = new GregorianCalendar();
        calendar.set(1994, Calendar.JULY, 31);
        Date date = calendar.getTime();
        System.out.println("Teqvim gunu: " + dateFormat.format(date));
        burda ise kalendarnan oz isdediyim tarixi format etdim
        System.out.println("-----------------------------------------------------------");

        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(2012, Calendar.OCTOBER, 4);
        Date date1 = calendar1.getTime();
        System.out.println("Teqvim gunu2: " + dateFormat.format(date1));

//        ----------------------------------------------------------------------------------
//    2-*****bu asagda yazilan kodlar iki zaman arasindaki feri gostermek ucundur*****

        Date bugun = new Date();
        DateFormat f = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date time = null;
        try {
            time = f.parse("02/01/2023 14:30:55");
        } catch (Exception e) {
            e.printStackTrace();
        }

        assert time != null;
        Long timeDifference = (bugun.getTime() - time.getTime()) / (1000 * 60 * 60 * 24);
        System.out.println(timeDifference);
//----------------------------------------------------------------------------------------------
                    3-************

        long l1 = System.nanoTime();
        long l2 = System.nanoTime();
        l2 = (l2 - l1) / (10 * 10);
        System.out.println("nano saniye: " + l2);
//      yuxardaki kod nano saniyeye aid yazilan koddur
        System.out.println("------------------------------------------------");

        long s1 = System.currentTimeMillis();
        long s2 = System.currentTimeMillis();
        s2 = (s2 - s1) / (2);
        System.out.println("milli saniye: " + s2);
//      yuxardaki kod milli saniyeye aid yazilan koddur*/

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);  //bu tarixi gosterir

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);  //bu saati gosterir

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime); // bu umumi hamsini bir yerde gosterir

        String i = localTime.toString();
        System.out.println(i);

        Date d = new Date();
        System.out.println(d.getTime()); //bu getTime metodu long tipinde 1970-ci ilden indki zaman qeder kecen zamani
                                        //millisaniyenen <-> (millisecond) gosterir

    }  //daha etrafli bu Date & Time haqqinda tam basa dusule bilen melumat bu asagda yazdigim saytda var
        //https://www.tutorialspoint.com/java/java_date_time.htm
}