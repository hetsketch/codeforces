package tram;

/**
 * Author: hetsketch
 * Created: 8/10/16
 */

import java.util.Scanner;

/**
 * В Линейном Королевстве всего один трамвайный маршрут. На нем n остановок, пронумерованных от 1 до n в порядке
 * следования трамвая. На i-ой остановке ai человек выходит из трамвая, а bi человек заходит в трамвай. Трамвай
 * прибывает на первую остановку пустым. Также, когда трамвай прибывает на последнюю остановку, все пассажиры выходят,
 * и трамвай уезжает пустым.
 * <p>
 * Ваша задача — найти минимальную возможную вместимость трамвая, такую, что количество пассажиров в трамвае в любой
 * момент времени не превосходит эту вместимость. Учтите, что на каждой остановке все пассажиры выходят до того как
 * какой-либо пассажир заходит.
 * <p>
 * Входные данные
 * В первой строке записано целое число n (2 ≤ n ≤ 1000) — количество остановок трамвая.
 * <p>
 * Далее следует n строк, в каждой — по два целых числа ai и bi (0 ≤ ai, bi ≤ 1000) — количество пассажиров, которые
 * выходят из трамвая на i-ой остановке, и количество пассажиров, которые заходят в трамвай на i-ой остановке. Остановки
 * перечислены в том же порядке, в котором их проезжает трамвай.
 * <p>
 * Количество пассажиров, которые выходят на остановке, не превосходит общего количества пассажиров в трамвае в момент,
 * когда он подъезжает к этой остановке. Более формально, . Это, в частности, означает, что a1 = 0
 * На последней остановке все пассажиры выходят из трамвая. Более формально,
 * Никто не заходит в трамвай на последней остановке. То есть, bn = 0
 * Выходные данные
 * Выведите одно целое число — минимальную возможную вместимость трамвая. Допускается, что вместимость может быть
 * равна нулю.
 */
public class Tram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rez = 0;
        int people = 0;
        int iterations = sc.nextInt() * 2;
        for (int i = 0; i < iterations; i++) {
            if (i % 2 == 0) {
                people -= sc.nextInt();
            } else {
                people += sc.nextInt();
                if (people > rez) {
                    rez = people;
                }
            }
        }
        System.out.println(rez);
    }
}
