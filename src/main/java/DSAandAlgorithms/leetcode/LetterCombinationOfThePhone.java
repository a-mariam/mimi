package DSAandAlgorithms.leetcode;

import java.util.HashMap;

public class LetterCombinationOfThePhone {
    private static HashMap<String, String> numbers = new HashMap<>();

    public static String match(String digits) {
        StringBuilder words = new StringBuilder();
        String string = words.toString();
        numbers.put("1", "");
        numbers.put("2", "ABC");
        numbers.put("3", "DEF");
        numbers.put("4", "GHI");
        numbers.put("5", "JKL");
        numbers.put("6", "MNO");
        numbers.put("7", "PQRS");
        numbers.put("8", "TUV");
        numbers.put("9", "WXYZ");
        if (
                numbers.containsKey(digits)) {
        for (int count = 0; count < digits.length(); count++) {
            char c = digits.charAt(count);
            words.append(numbers.get(String.valueOf(c)));
            System.out.println(words);

//            }
            return string;
//         return "[]";
        }}
        return string;
        }
}
