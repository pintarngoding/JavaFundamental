import java.util.Arrays;
import javax.swing.JOptionPane;

public class tugas16 {
    public static void sequentialSearch(int[] arr, int key) {
        boolean ketemu = false;

        System.out.println("Data array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\n");

        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                System.out.println("Angka " + key + " ditemukan pada data ke-" + (i + 1));
                ketemu = true;
                break;
            }
        }

        if (!ketemu) {
            System.out.println("Angka " + key + " tidak ditemukan di dalam array");
        }
    }

    public static void binarySearch(int[] data, int key) {
        Arrays.sort(data);

        System.out.println("Data array setelah diurutkan:");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("\n");

        int indexTengah = data.length / 2;
        int index = indexTengah;
        boolean ketemu = false;

        while (index >= 0 && index < data.length && ketemu == false) {
            if (key == data[index]) {
                System.out.println("Angka " + key + " ditemukan pada index ke-" + index);
                ketemu = true;
                break;
            } else if (key < data[indexTengah]) {
                index--;
            } else {
                index++;
            }
        }

        if (!ketemu) {
            System.out.println("Angka " + key + " tidak ditemukan di dalam data array");
        }
    }

    public static void main(String[] args) {
        int data[] = { 9, 6, 4, 3, 7, 1, 6, 10, 20, 61, 43, 80, 100, 54, 32, 36, 75, 81, 17, 19,
                1020, 55, 57, 82, 84, 16, 21, 28, 99, 89, 87, 73, 74, 76, 78, 79, 83, 85 };

        int key = Integer.parseInt(JOptionPane.showInputDialog("Inputkan angka yang dicari"));

        System.out.println("========== Sequential Search ==========");
        long startTime = System.currentTimeMillis();
        sequentialSearch(data, key);
        long endTime = System.currentTimeMillis();
        System.out.println("\nWaktu eksekusi sequential search: " + (endTime - startTime) + " ms");
        System.out.println("=======================================\n\n");

        System.out.println("============ Binary Search ============");
        long startTime2 = System.currentTimeMillis();
        binarySearch(data, key);
        long endTime2 = System.currentTimeMillis();
        System.out.println("\nWaktu eksekusi binary search: " + (endTime2 - startTime2) + " ms");
        System.out.println("=======================================");
    }
}
