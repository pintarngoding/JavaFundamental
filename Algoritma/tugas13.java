import java.util.Scanner;

public class tugas13 {
    public static void sequentialSearchString(String[] arr, String key) {
        boolean ketemu = false;

        System.out.println("Data array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println((i + 1) + ". " + arr[i]);
        }

        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            if (key.equalsIgnoreCase(arr[i])) {
                System.out.println("Data " + key + " ditemukan pada deret ke-" + (i + 1));
                ketemu = true;
                break;
            }
        }

        if (!ketemu) {
            System.out.println("Data " + key + " tidak ditemukan di dalam array");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama[] = { "Tessy", "Sule", "Denny", "Melky", "Jojon", "Kiwil" };

        System.out.print("Inputkan nama yang dicari: ");
        String key = input.nextLine();

        sequentialSearchString(nama, key);
    }
}
