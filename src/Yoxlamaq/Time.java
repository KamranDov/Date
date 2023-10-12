package Yoxlamaq;

import java.util.Timer;
import java.util.TimerTask;


public class Time {
    public static void main(String[] args) {

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                int result = job();
                System.out.println("yaranan ededler: " + result);
                if (result > 8) {
                    timer.cancel();
                }
            }
        }, 1000, 1000 * 2);//men bele yazmagimla Timer icinde yazdigim "Timer isledi sozu 2 saniyede bir
//                                      dayanmadan yazilacaq taaki sen onu stop edene qeder.
        System.out.println("men geldim");
    }

    private static int job() {
        eded = (int) (Math.random() * 10);
        return eded;
    }

    static int eded;
}
/*bu yadigim kodda 2 saniyeden bir random edeler verirem taaki bu daxil olan random ededlerden hansi ki 10-a
* beraber olacaq onda kod dayanacaq.*/