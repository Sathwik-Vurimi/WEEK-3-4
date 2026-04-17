import java.util.*;

public class AccountSearch {

    static int linear(String[] arr, String target) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i].equals(target)) return i;
        return -1;
    }

    static int binary(String[] arr, String target) {
        int l = 0, h = arr.length - 1;

        while (l <= h) {
            int m = (l + h) / 2;
            if (arr[m].equals(target)) return m;
            else if (arr[m].compareTo(target) < 0) l = m + 1;
            else h = m - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] arr = {"accA", "accB", "accB", "accC"};

        System.out.println("Linear first index: " + linear(arr, "accB"));
        System.out.println("Binary index: " + binary(arr, "accB"));

        int count = 0;
        for (String s : arr)
            if (s.equals("accB")) count++;

        System.out.println("Count: " + count);
    }
}