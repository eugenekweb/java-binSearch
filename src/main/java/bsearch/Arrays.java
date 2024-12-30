package bsearch;

import java.util.Comparator;

public class Arrays {

    // 1
    public static int binarySearch(byte[] a, byte key) {
        return java.util.Arrays.binarySearch(a, key);
    }

    // 2
    public static int binarySearch(byte[] a, int fromIndex, int toIndex, byte key) {
        return java.util.Arrays.binarySearch(a, fromIndex, toIndex, key);
    }

    // 3
    public static int binarySearch(char[] a, char key) {
        return java.util.Arrays.binarySearch(a, key);
    }

    // 4
    public static int binarySearch(char[] a, int fromIndex, int toIndex, char key) {
        return java.util.Arrays.binarySearch(a, fromIndex, toIndex, key);
    }

    // 5
    public static int binarySearch(double[] a, double key) {
        return java.util.Arrays.binarySearch(a, key);
    }

    // 6
    public static int binarySearch(double[] a, int fromIndex, int toIndex, double key) {
        return java.util.Arrays.binarySearch(a, fromIndex, toIndex, key);
    }

    // 7
    public static int binarySearch(float[] a, float key) {
        return java.util.Arrays.binarySearch(a, key);
    }

    // 8
    public static int binarySearch(float[] a, int fromIndex, int toIndex, float key) {
        return java.util.Arrays.binarySearch(a, fromIndex, toIndex, key);
    }

    // 9
    public static int binarySearch(int[] a, int key) {
        return java.util.Arrays.binarySearch(a, key);
    }

    // 10
    public static int binarySearch(int[] a, int fromIndex, int toIndex, int key) {
        return java.util.Arrays.binarySearch(a, fromIndex, toIndex, key);
    }

    // 11
    public static int binarySearch(long[] a, long key) {
        return java.util.Arrays.binarySearch(a, key);
    }

    // 12
    public static int binarySearch(long[] a, int fromIndex, int toIndex, long key) {
        return java.util.Arrays.binarySearch(a, fromIndex, toIndex, key);
    }

    // 13
    public static int binarySearch(short[] a, short key) {
        return java.util.Arrays.binarySearch(a, key);
    }

    // 14
    public static int binarySearch(short[] a, int fromIndex, int toIndex, short key) {
        return java.util.Arrays.binarySearch(a, fromIndex, toIndex, key);
    }

    // 15 - для произвольных типов
    public static <T> int binarySearch(T[] a, T key, Comparator<? super T> comparator) {
        return java.util.Arrays.binarySearch(a, key, comparator);
    }

    // 16 - для произвольных типов
    public static <T> int binarySearch(T[] a, int fromIndex, int toIndex, T key, Comparator<? super T> comparator) {
        return java.util.Arrays.binarySearch(a, fromIndex, toIndex, key, comparator);
    }
}
