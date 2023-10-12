import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Datee {
    public static void main(String[] args) {
        Datee tarix = new Datee();
        System.out.println("indiki zaman: " + tarix);
//----------------------------------------------------------------------------------------
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH-mm-ss");
        System.out.println("indiki zamani format etdim: " + dateFormat.format(tarix));
//----------------------------------------------------------------------------------------
        Calendar calendar = new GregorianCalendar();
        calendar.set(2000, Calendar.SEPTEMBER, 15);
        Date tarix1 = calendar.getTime();
        System.out.println("men yazdigim kalendar: " + dateFormat.format(tarix1));
//----------------------------------------------------------------------------------------
        Date d = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String s = df.format(d);
        System.out.println("zamani string-e cevirdim: " + s);
//----------------------------------------------------------------------------------------
        java.util.Date zaman = null;
        try {
            zaman = new SimpleDateFormat("dd_MM_yyyy").parse(s);
            } catch (ParseException ignored) {
        /*yuxardaki kodda parse() metodu var.bu metod stringi alir date cevirir.harda istifade olunur desek misalcun
        * musterinin dogum gunu sorusursan oda string tipinde yazir ve onu tesdiq etmek ucun onu Date cevirmelisen
        * axi, bax buna gorede parse() metodunda istifade edirik.qisaca stringi date cevirir*/
        }
        System.out.println("string-i zamana cevirdim: " + s);
//----------------------------------------------------------------------------------------
        Calendar cal = new GregorianCalendar();
        cal.set(2022, Calendar.SEPTEMBER, 11);
        Calendar cal1 = new GregorianCalendar();
        cal.set(2022, Calendar.SEPTEMBER, 15);


        boolean after = cal1.after(cal);
        System.out.println(after);
        /*bu after bir tarixle diger tarix arasinda zamani muqayise edir adindan belli oldugu kimi after() yeni<->
       (sonra) kodunda evlene baxsan gorersen ki bu after() metodunun tipide de boolean-dir. yeni yoxluyurki bir
          tarix digerinden soradi yoxsa yox eger soradisa true evveldise false cavabi verir.*/
        boolean before = cal1.before(cal);
        System.out.println(before);
        /*bu before() metoduda after() metodunun tam eksi adindanda belli oldugu kimi (evvel) demekdir.eyni isi goturur
        ama after-in tam eksin.*/





    }
}