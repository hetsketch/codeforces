package football;

/**
 * Author: hetsketch
 * Created: 8/9/16
 */

import java.util.Scanner;

/**
 * Петя очень любит футбол. Однажды, глядя футбольный матч, он записывал на листе бумаги текущее положение игроков.
 * Для простоты он изобразил ситуацию в виде строки из нулей и единиц. Ноль соответствует игрокам одной команды, единица
 * — игрокам другой команды. Если есть как минимум 7 игроков некоторой команды, стоящих подряд, то эта ситуация
 * считается опасной. Например, ситуация 00100110111111101 — опасная, а 11110111011101 — нет. Вам задана текущая ситуация.
 * Определите, является ли она опасной.
 * <p>
 * Входные данные
 * В первой строке ввода задана непустая строка из символов «0» и «1», обозначающих игроков. Длина строки не превышает
 * 100 символов. От каждой команды на поле присутствует хотя бы один игрок.
 * <p>
 * Выходные данные
 * Выведите «YES» если ситуация опасная. В противном случае выведите «NO».
 */
public class Football {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] line = sc.nextLine().toCharArray();

        int count = 1;
        for (int i = 0; i < line.length - 1; i++) {
            if (line[i] == line[i + 1]) {
                count++;
            } else {
                if (count >= 7) {
                    break;
                } else {
                    count = 1;
                }
            }
        }
        if (count >= 7) {
            System.out.println("YES");
        } else System.out.println("NO");

    }
}
