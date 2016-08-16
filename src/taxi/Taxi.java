package taxi;

import java.util.Arrays;
import java.util.Scanner;

/**
 * После окончания уроков n групп школьников вышли на улицу и собрались ехать домой к Поликарпу на празднование
 * его дня рождения. Известно, что i-ая группа состоит из si друзей (1 ≤ si ≤ 4), которые не хотят расставаться по пути
 * к Поликарпу. Решено ехать на такси. Каждая машина может вместить не более четырех пассажиров. Какое минимальное
 * количество машин потребуется школьникам, если каждая группа должна целиком находиться в одной из машин такси
 * (но одна машина может вмещать более чем одну группу)?
 * <p>
 * Входные данные
 * В первой строке записано целое число n (1 ≤ n ≤ 105) — количество групп школьников. Вторая строка содержит
 * последовательность целых чисел s1, s2, ..., sn (1 ≤ si ≤ 4). Числа записаны через пробел, si — количество
 * ребят в i-ой группе.
 * <p>
 * Выходные данные
 * Выведите единственное число — минимальное необходимое количество такси, чтобы отвезти всех ребят к Поликарпу.
 */
public class Taxi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberOfCars = 0;
        int numberOfGroups = sc.nextInt();
        int[] groups = new int[numberOfGroups];

        for (int i = 0; i < numberOfGroups; i++) {
            groups[i] = sc.nextInt();
        }

        for (int i = 0; i < numberOfGroups; i++) {
            if (groups[i] == 4) {
                numberOfCars++;
                groups[i] = 0;
            }
        }

        for (int i = 0; i < numberOfGroups; i++) {
            if (groups[i] == 3) {
                for (int j = 0; j < numberOfGroups; j++) {
                    if (groups[j] != 0) {
                        if (groups[j] == 1) {
                            numberOfCars++;
                            groups[i] = 0;
                            groups[j] = 0;
                            break;
                        }
                        numberOfCars++;
                    }
                }
            }
        }

//        for (int i = 0; i < numberOfGroups; i++) {
//            if (groups[i] == 2) {
//                for (int j = i + 1; j < numberOfGroups; j++) {
//                    if (groups[j] == 2) {
//                        numberOfCars++;
//                        groups[i] = 0;
//                        groups[j] = 0;
//                        break;
//                    }
//                    if (groups[j] == 1)
//                }
//            }
//        }
//
//        for ()
//            if (groups[i] == 1) {
//                for (int j = i + 1; j < numberOfGroups; j++) {
//                    if (groups[j] == 2) {
//                        numberOfCars++;
//                        groups[j] = 0;
//                    }
//                }
//            }
//
//        }

        System.out.println(Arrays.toString(groups));
        System.out.println(numberOfCars);
    }
}
