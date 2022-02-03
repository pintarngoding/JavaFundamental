import java.util.Scanner;

public class tugas7MethodSelectionSortAscendingKiri {

    public static void selectionSortAscendingKiri(int[] arr) {
        int min, temp;
        for (int i = 0; i < (arr.length - 1); i++) {
            min = i;
            for (int j = (i + 1); j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        for (int n = 0; n < arr.length; n++) {
            System.out.print(arr[n] + "\t");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah data: ");
        int n = input.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Masukkan data ke-" + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }

        System.out.println("\nData sebelum diurutkan: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

        System.out.println("\nData setelah diurutkan: ");
        selectionSortAscendingKiri(arr);
    }
}
