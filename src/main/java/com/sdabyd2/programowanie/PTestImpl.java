package com.sdabyd2.programowanie;

import java.util.*;
import java.util.stream.Collectors;

public class PTestImpl {

    public static String last(List<String> lista) {
        return lista.get(lista.size() - 1);

    }

    public static Integer length(List<Integer> integers) {
        return integers.size();
    }

    public static <T> List<T> reverse(List<T> numbers) {
        Collections.reverse(numbers);
        return numbers;
    }

    public static boolean isPalindrome(List<String> list) {
        List<String> original = new ArrayList<>(list);
        PTestImpl.reverse(list);
        return Objects.equals(list, original);
    }

    public static Object[] removeAt(List<String> list, int i) {
        List<String> text = new ArrayList<>(list);
        String kth = text.remove(i - 1);
        return new Object[]{text, kth};
    }

    public static List<String> randomSelect(List<String> list, int elements) {
        int listSize = list.size() - 1;
        Random random = new Random(System.currentTimeMillis());
        List<String> resultList = new ArrayList<String>();
        int z = 1;
        do {
            resultList.add(list.get(random.nextInt(listSize)));
            z++;
        } while (z <= elements);
        return resultList;
    }

    /*
    public static <T> List<T> flatten(List<?> objects) {

        return objects.stream().flatMap(Collection::stream)
                .collect(Collectors.toList());
    }*/

    public static List<String> compress(List<String> list) {

        Set<String> text = new LinkedHashSet<String>(list);
        List<String> output = new ArrayList<>(text);
        return output;
    }
}
