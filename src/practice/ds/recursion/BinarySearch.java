package practice.ds.recursion;

import java.util.Arrays;

/**
 * Created by mahbubalam on 03.01.18.
 */
public class BinarySearch {

    private static boolean search(int[] arr, int k, int m, int n) {
        System.out.println("m = " + m + ", n = " + n);
        if (m > n) return false;
        if (arr[(m+n)/2] == k) return true;
        else if (arr[(m+n)/2] < k) return search(arr, k, (m+n)/2 + 1, n);
        else return search(arr, k, m, (m+n)/2 - 1);
    }

    public static boolean search(int[] arr, int k) {
        Arrays.sort(arr);
        return search(arr, k, 0, arr.length);
    }

    public static void main(String[] args) {
        int[] a1 = {2, 3, 4, 5, 6};
        System.out.println(search(a1, 2));
        System.out.println(search(a1, 6));
        System.out.println(search(a1, 4));
        System.out.println(search(a1, 3));

        int[] a2 = {2, 3, 4, 6};
        System.out.println(search(a2, 2));
        System.out.println(search(a2, 6));
        System.out.println(search(a2, 3));
        System.out.println(search(a2, 4));
    }

}
