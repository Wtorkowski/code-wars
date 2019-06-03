package com.codewars.EightKyu;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class First {
    public static String HighAndLow(String numbers) {
        List<String> numbersList = Arrays.stream(numbers.split(" "))
                .collect(Collectors.toList());
        if (numbersList.size() < 2) {
            return numbersList.get(0) + " " + numbersList.get(0);
        }
        String highest = numbersList.stream()
                .max(Comparator.comparing(Integer::valueOf))
                .get();
        String lowest = numbersList.stream()
                .min(Comparator.comparing(Integer::valueOf))
                .get();
        return highest + " " + lowest;
    }
}