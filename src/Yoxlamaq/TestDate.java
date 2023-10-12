package Yoxlamaq;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TestDate {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ad gunu tarixini qeyd edin:");
        String adGunuDaxilEt = scanner.nextLine();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dateMusteri = sdf.parse(adGunuDaxilEt);
        Date menimAdunum = sdf.parse("31/07/1994");

        long musteri = dateMusteri.getTime();
        long men = menimAdunum.getTime();
        long diff = musteri - men;
        System.out.println(diff / (24 * 60 * 60 * 1000) / 365);
/*bu yazdigim kodda menim ad gunumnen oz dogum tarixini giren musteriynen nece il aramizda ferq ona baxmaq isteyirik*/
    }
}
