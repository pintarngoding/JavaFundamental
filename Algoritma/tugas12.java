import java.util.Scanner;

public class tugas12 {

    public static void sequentialSearchAngka(int[] arr, int key) {
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

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int arrAngka[] = { 20, 50, 10, 15, 60, 100, 70, 55, 80, 45, 35, 25 };

        System.out.print("Inputkan angka yang dicari: ");
        int key = input.nextInt();

        sequentialSearchAngka(arrAngka, key);
    }
}
