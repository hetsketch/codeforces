package happydivision;

import java.util.Scanner;

/**
 * Author: hetsketch
 * Created: 8/21/2016
 */

/**
 * Петя любит счастливые числа. Всем известно, что счастливыми являются положительные целые числа, в десятичной записи
 * которых содержатся только счастливые цифры 4 и 7. Например, числа 47, 744, 4 являются счастливыми, а 5, 17,
 * 467 — не являются.
 * <p>
 * Петя называет число почти счастливым, если оно делится без остатка на какое-либо счастливое число. Помогите
 * ему узнать, является ли заданное число n почти счастливым?
 * <p>
 * Входные данные
 * В единственной строке задано целое число n (1 ≤ n ≤ 1000) — число, которое нужно проверить.
 * <p>
 * Выходные данные
 * В единственной строке выведите «YES» (без кавычек), если число n почти счастливое, иначе выведите «NO» (без кавычек).
 */
public class HappyDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ns = String.valueOf(n);
        if ((n % 4 == 0) || (n % 7 == 0) || (n % 47 == 0) || (n % 74 == 0)) {
            System.out.println("YES");
        } else {
            boolean isHappy = false;
            //checks every digit if it like 4 or 7
            //if number consists of 4 and 7 it will happy number
            for (int i = 0; i < ns.length(); i++) {
                if (ns.charAt(i) == '4' || ns.charAt(i) == '7') {
                    isHappy = true;
                } else {
                    isHappy = false;
                    break;
                }
            }
            if (isHappy) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
