package com.sdabyd2.programowanie;

import java.util.Collections;
import java.util.List;

public class PTestImpl {

    public static String last(List<String> lista) {
        return lista.get(lista.size() - 1);

    }


    public static Integer length(List<Integer> integers) {
        return integers.size();
    }

    public static List<Integer> reverse(List<Integer> numbers) {
        Collections.reverse(numbers);
        return numbers;
    }
}
