package capitalizeword;

/**
 * Author: hetsketch
 * Created: 8/21/2016
 */

import java.util.Scanner;

/**
 * Капитализация — это запись слова, в которой первая буква слова записывается как прописная буква. Ваша задача,
 * вывести капитализацию заданного слова.
 * <p>
 * Обратите внимание, что в капитализации все буквы слова кроме первой остаются не измененными.
 * <p>
 * Входные данные
 * В первой строке записано непустое слово. Слово состоит из строчных и прописных букв латинского алфавита.
 * Длина заданного слова не превосходит 103 букв.
 */
public class CapitalizeWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.substring(0,1).equals(s.substring(0,1).toLowerCase())){
            s = s.substring(0,1).toUpperCase() + s.substring(1, s.length());
        }
        System.out.println(s);
    }
}
