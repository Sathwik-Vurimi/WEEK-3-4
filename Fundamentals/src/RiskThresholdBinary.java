public class RiskThresholdBinary {

    static int floor(int[] arr, int target) {
        int l = 0, h = arr.length - 1, res = -1;

        while (l <= h) {
            int m = (l + h) / 2;
            if (arr[m] <= target) {
                res = arr[m];
                l = m + 1;
            } else h = m - 1;
        }
        return res;
    }

    static int ceil(int[] arr, int target) {
        int l = 0, h = arr.length - 1, res = -1;

        while (l <= h) {
            int m = (l + h) / 2;
            if (arr[m] >= target) {
                res = arr[m];
                h = m - 1;
            } else l = m + 1;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {10, 25, 50, 100};
        int target = 30;

        System.out.println("Floor: " + floor(arr, target));
        System.out.println("Ceiling: " + ceil(arr, target));
    }
}