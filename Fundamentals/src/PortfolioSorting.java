import java.util.*;

class Asset {
    String name;
    int returnRate;

    Asset(String n, int r) {
        name = n;
        returnRate = r;
    }

    public String toString() {
        return name + ":" + returnRate;
    }
}

public class PortfolioSorting {
    public static void main(String[] args) {
        Asset[] arr = {
                new Asset("AAPL", 12),
                new Asset("TSLA", 8),
                new Asset("GOOG", 15)
        };

        Arrays.sort(arr, Comparator.comparingInt(a -> a.returnRate));
        System.out.println("MergeSort: " + Arrays.toString(arr));

        Arrays.sort(arr, (a, b) -> b.returnRate - a.returnRate);
        System.out.println("QuickSort(desc): " + Arrays.toString(arr));
    }
}