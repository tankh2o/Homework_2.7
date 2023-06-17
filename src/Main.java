import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        tusk1();
        tusk2();
        tusk3();
        tusk4();

        oddNumbers(List.of(1,2,3,2,3,1,4,4));
    }

    public static void tusk1() {
        /*Напишите код, с помощью которого можно напечатать только нечетные числа в консоль.
                Код должен работать с любой последовательностью и объемом списка чисел.*/
        List<Integer> nums = new ArrayList<>(List.of(1, 2, 2, 3, 4, 1, 3, 4));
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 0) {
                nums.remove(i);
            }
            System.out.println(nums.get(i));
        }
    }

    public static void oddNumbers (List<Integer> nums) {
        for (int i = 0; i < nums.size(); i++) {
            //for (int k = 0; k < nums.size(); k++) {
            if (nums.get(i) % 2 != 0) {
                System.out.println(nums.get(i));
            }
        }
    }
    public static void tusk2() {
        /*Напишите код, с помощью которого можно напечатать только четные числа без повторений
        в порядке возрастания. Код должен работать с любой последовательностью и объемом списка чисел.*/
    }
    public static void tusk3() {
        /*Напишите код, который выводит в консоль все уникальные слова из списка слов,
                в котором могут встречаться дубли. Код должен работать с любой последовательностью и объемом списка слов.
        В качестве отладочной информации возьмите произвольный набор слов или текст, в котором встречаются повторения.*/
    }
    public static void tusk4() {
        /*Напишите код, который выводит в консоль количество дублей для каждого уникального слова.
                Код должен работать с любой последовательностью и объемом списка слов.*/
    }
}