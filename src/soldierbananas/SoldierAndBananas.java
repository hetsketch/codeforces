package soldierbananas;

/**
 * Author: hetsketch
 * Created: 8/25/2016
 */

import java.util.Scanner;

/**
 * Солдат хочет купить w бананов в магазине. Ему надо заплатить k долларов за первый банан, 2k долларов — за второй и
 * так далее (иными словами, за i-й банан надо заплатить i·k долларов).
 * <p>
 * У него есть n долларов. Сколько долларов ему придется одолжить у однополчанина, чтобы купить w бананов?
 * <p>
 * Входные данные
 * В первой строке записано три положительных целых числа k, n, w (1  ≤  k, w  ≤  1000, 0 ≤ n ≤ 109), стоимость первого банана,
 * изначальное количество долларов у солдата и количество бананов, которые он хочет купить.
 * <p>
 * Выходные данные
 * Выведите единственное целое число — количество долларов, которое солдату надо одолжить у однополчанина. Если деньги
 * одалживать не надо, выведите 0.
 */
public class SoldierAndBananas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        int cash = sc.nextInt();
        int bananas = sc.nextInt();

        //how to find sum of natural numbers from 1 to n?
        //you have to add 1 to n and multiply it by n/2
        // sum = ((1+n)*n)/2
        int sum = 0;
        for (int i = 1; i <= bananas; i++) {
            sum += price * i;
        }
        System.out.println(sum <= cash ? 0 : sum - cash);
    }
}
