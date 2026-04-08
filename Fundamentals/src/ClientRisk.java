import java.util.*;

class Client {
    String name;
    int risk;

    Client(String n, int r) {
        name = n;
        risk = r;
    }

    public String toString() {
        return name + ":" + risk;
    }
}

public class ClientRisk {

    static void bubble(Client[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].risk > arr[j + 1].risk) {
                    Client t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
        System.out.println("Bubble (asc): " + Arrays.toString(arr));
    }

    static void insertion(Client[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Client key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].risk < key.risk) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        System.out.println("Insertion (desc): " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Client[] arr = {
                new Client("C", 80),
                new Client("A", 20),
                new Client("B", 50)
        };

        Client[] copy = Arrays.copyOf(arr, arr.length);
        bubble(copy);

        insertion(arr);

        System.out.println("Top risks:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}