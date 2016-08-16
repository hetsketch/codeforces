package peteandstrings;

/**
 * Author: hetsketch
 * Created: 8/9/16
 */

import java.util.Scanner;

/**
 * Маленький Петя очень любит подарки. Его мама подарила ему на день рождения две строки равной длины,
 * состоящие из больших и маленьких букв латинского алфавита. Теперь Петя хочет сравнить эти строки лексикографически.
 * При этом регистр букв значения не имеет, то есть большая буква считается эквивалентной соответствующей маленькой
 * букве. Помогите Пете выполнить сравнение.
 * <p>
 * Входные данные
 * В каждой из первых двух строк записано по одной подаренной строке. Длина строк находится в пределах от 1 до
 * 100 включительно. Гарантируется, что строки имеют одинаковую длину, а также состоят из больших и маленьких букв
 * латинского алфавита.
 * <p>
 * Выходные данные
 * Если первая строка меньше второй, выведите «-1». Если вторая строка меньше первой, выведите «1». Если строки равны,
 * выведите «0». Учтите, что регистр букв не учитывается при сравнении.
 */
public class PeteAndStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine();
        String line2 = sc.nextLine();

        int rez = line1.compareToIgnoreCase(line2);
        System.out.println((int) Math.signum(rez));
        // Math.signum() returns -1 if rez is less than 0, 0 - if rez 0, 1 - if rez > 1 (result is float or double)
//        if (rez < 0){
//            System.out.println("-1");
//        }
//        if (rez > 0){
//            System.out.println("1");
//        }
//        if (rez == 0){
//            System.out.println(rez);
//        }
    }
}
