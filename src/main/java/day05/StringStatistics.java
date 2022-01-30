package day05;

import java.util.*;

public class StringStatistics {

    public int numberOfDifferentLetters(String s) {
        Set<Character> result = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            result.add(s.charAt(i));
        }
        return result.size();
    }

    public Map<Character, Integer> getCharsInText(String text) {
        Map<Character, Integer> result = new HashMap<>();
        for (char c : text.toCharArray()) {
            if (!result.containsKey(c)) {
                result.put(c,1);
            } else {
                result.put(c, result.get(c)+1);
            }
        }
        return result;
    }
    public Map<Character, Integer> getCharsInTextLinked(String text) {
        Map<Character, Integer> result = new LinkedHashMap<>();
        for (char c : text.toCharArray()) {
            if (!result.containsKey(c)) {
                result.put(c,1);
            } else {
                result.put(c, result.get(c)+1);
            }
        }
        return result;
    }
    public Map<Character, Integer> getCharsInTextTree(String text) {
        Map<Character, Integer> result = new TreeMap<>();
        for (char c : text.toCharArray()) {
            if (!result.containsKey(c)) {
                result.put(c,1);
            } else {
                result.put(c, result.get(c)+1);
            }
        }
        return result;
    }
}