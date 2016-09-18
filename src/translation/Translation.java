package translation;

/**
 * Author: hetsketch
 * Created: 9/18/2016
 */

import java.util.Scanner;

/**
 * Перевод с берляндского языка на бирляндский — задача не из легких. Эти языки очень похожи: слово на бирляндском
 * языке отличается от такого же по смыслу слова на берляндском только тем, что оно пишется (и произносится) наоборот.
 * Например, слову code в берляндском языке соответствует слово edoc в бирляндском. Несмотря на это, при «переводе»
 * легко ошибиться. Вася перевел слово s с берляндского на бирляндский как t. Помогите ему: определите, правильно ли
 * он выполнил перевод?
 * <p>
 * Входные данные
 * В первой строке записано слово s, во второй строке записано слово t. Слова состоят из маленьких латинских букв.
 * Входные данные не содержат лишних пробелов. Слова непустые, и их длины не превосходят 100 символов.
 * <p>
 * Выходные данные
 * Если слово t является словом s, записанным наоборот, выведите YES, иначе выведите NO.
 */
public class Translation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String inverse = sc.nextLine();
        boolean isInverse = false;
        if (word.length() != inverse.length()) {
            System.out.println("NO");
        } else {
            for (int i = 0; i < word.length(); i++) {

                if (word.charAt(i) == inverse.charAt(word.length() - i - 1)) {
                    isInverse = true;
                } else {
                    isInverse = false;
                    break;
                }
            }
            System.out.println(isInverse ? "YES" : "NO");
        }
    }
}
