package controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapHWApp {
    public static void main(String[] args) {
        Map<String, Integer> result = new HashMap<>();
        String[] arr = {"abc", "ab", "abcd", "abcd", "ab", "a"};

        for (int i = 0; i < arr.length; i++) {
           addOccurence(result, arr[i]);

           // result.merge(arr[i], 1, (a, b) -> a + b);

            System.out.println(Arrays.toString(result.entrySet().toArray()));
        }

    }

    private static void addOccurence(Map<String, Integer> result, String str) {
        Integer newValue;
        Integer oldValue = result.get(str);
        if (oldValue == null) {
            newValue = 1;
        } else {
            newValue = oldValue + 1;
        }

        result.put(str, newValue);
    }
    }

