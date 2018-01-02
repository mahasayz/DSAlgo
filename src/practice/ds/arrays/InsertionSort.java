package practice.ds.arrays;

/**
 * Created by mahbubalam on 02.01.18.
 */
public class InsertionSort {

    public static void debug(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i : arr) {
            sb.append(i + ", ");
        }
        System.out.println(sb.toString());
    }

    public static void sort(int[] arr) {
        for (int i=1; i<arr.length; i++) {
            int temp = arr[i];
            int j = i;
            while(j > 0 && arr[j-1] > temp) {
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = temp;
            debug(arr);
        }
    }

    public static void main(String[] args) {

        sort(new int[]{1,5,5,5});

    }

}
