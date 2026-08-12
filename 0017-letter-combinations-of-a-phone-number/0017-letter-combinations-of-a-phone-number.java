import java.util.*;

class Solution {

    List<String> list = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return list;
        }

        numPad("", digits);
        return list;
    }

    String[] map = {
            "",     // 0
            "",     // 1
            "abc",  // 2
            "def",  // 3
            "ghi",  // 4
            "jkl",  // 5
            "mno",  // 6
            "pqrs", // 7
            "tuv",  // 8
            "wxyz"  // 9
    };

    public void numPad(String p, String up) {
        if (up.isEmpty()) {
            list.add(p);
            return;
        }

        int digit = up.charAt(0) - '0';
        String letters = map[digit];

        for (int i = 0; i < letters.length(); i++) {
            char ch = letters.charAt(i);
            numPad(p + ch, up.substring(1));
        }
    }
}