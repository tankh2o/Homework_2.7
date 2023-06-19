import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(List.of(6, 1, 1, 2, 2, 3, 6, 5, 3, 4, 4, 5));

        System.out.println(" Задание 1");
        oddNumbers(nums);
        System.out.println("\n Задание 2");
        evenNumbers(nums);


        List<String> words = new ArrayList<>(List.of("до", "ми", "соль", "до", "до", "соль", "ми", "до", "соль", "соль", "ми", "до"));
        System.out.println("\n Задание 3");
        deletedDuplicatesWords(words);
        System.out.println("\n Задание 4");
        numberDuplicates(words);
    }
    public static void oddNumbers(List<Integer> nums) {
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 != 0) {
                System.out.print(nums.get(i) + " ");
            }
        }
    }
    public static void evenNumbers(List<Integer> nums) {
        deletedDuplicatesNums(nums);
        Collections.sort(nums);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 0) {
                System.out.print(nums.get(i) + " ");
            }
        }
    }
    public static void deletedDuplicatesNums(List<Integer> nums) {
        for (int i = 0; i < nums.size(); i++) {
            for (int k = 0; k < nums.size() && nums.get(i) != null; k++) {
                if (nums.get(i).equals(nums.get(k)) && i != k) {
                    nums.remove(k);
                }
            }
        }
    }
    public static void deletedDuplicatesWords(List<String> words) {
        Set<String> removeDoubles = new HashSet<>(words);
        System.out.print(removeDoubles);
    }
    public static void numberDuplicates(List<String> words) {
        Map<String, Integer> resultMap = new HashMap<>();
        for (String w : words) {
            if (resultMap.containsKey(w)) {
                resultMap.put(w, (resultMap.get(w) + 1));
            } else {
                resultMap.put(w, 1);
            }
        }
        for (String w1 : resultMap.keySet()) {
            System.out.println("Слово " + w1 + " встретилось " + resultMap.get(w1) + " раз.");
        }
    }
}