package bsearch;

import java.util.Comparator;
import java.util.List;

public class Collections {

    // 1 - без компаратора
    public static <T extends Comparable<? super T>> int binarySearch(List<? extends T> list, T key) {
        return java.util.Collections.binarySearch(list, key);
    }

    // 2 - с компаратором
    public static <T> int binarySearch(List<? extends T> list, T key, Comparator<? super T> comparator) {
        return java.util.Collections.binarySearch(list, key, comparator);
    }
}
