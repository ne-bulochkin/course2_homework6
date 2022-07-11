package pro.sky;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // 1) only odd nums
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        System.out.println(printAllOddNumber(nums));

        // 2) only even, no repeat, sorted
        System.out.println(printAllEvenNoRepeatSortedNumbers(nums));

        // 3) no repeat
        List<String> strings = Arrays.asList(
                "Клубника",
                "Малина",
                "Ежевика",
                "Малина",
                "Голубика",
                "Клубника");
        System.out.println(new HashSet<>(strings));


        // 4) number of repeats
        System.out.println(printNumberOfRepeats(strings));

    }

    public static List<Integer> printAllOddNumber(List<Integer> nums) {
        List<Integer> odd = new ArrayList<>();
        for (Integer num : nums) {
            if (num % 2 != 0) {
                odd.add(num);
            }
        }
        return odd;
    }

    public static List<Integer> printAllEvenNoRepeatSortedNumbers(List<Integer> nums) {
        Set<Integer> even = new HashSet<>();
        for (Integer num : nums) {
            if (num % 2 == 0) {
                even.add(num);
            }
        }
        List<Integer> list = new ArrayList<>(even);
        Collections.sort(list);
        return list;
    }

    public static Map<String, Integer> printNumberOfRepeats(List<String> strings) {
        Map<String, Integer> repeatedNumbers = new HashMap<>();
        for (String str : strings) {
            if (repeatedNumbers.containsKey(str)) {
                repeatedNumbers.put(str, repeatedNumbers.get(str) + 1);
            } else {
                repeatedNumbers.put(str, 1);
            }
        }
        Map<String, Integer> repeatedNumbersMoreThenOne = new HashMap<>();
        for (Map.Entry<String, Integer> entry : repeatedNumbers.entrySet()) {
            if (entry.getValue() != 1) {
                repeatedNumbersMoreThenOne.put(entry.getKey(), entry.getValue());
            }
        }
        return repeatedNumbersMoreThenOne;
    }
}
